package pl.pila.vegetable.Usteni.repository;

import org.springframework.data.repository.CrudRepository;
import pl.pila.vegetable.Usteni.model.Role;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Integer> {
    Optional<Role> findByName(String name);
}
