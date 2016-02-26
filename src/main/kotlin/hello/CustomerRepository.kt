package hello

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : JpaRepository<Customer, Long> {
	fun findByLastName(lastName: String): Iterable<Customer>
}
