package com.microserver.ap.proveedores.repository;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import com.microserver.ap.proveedores.entity.Proveedores;

public interface IProveedoresRepository extends CrudRepository<Proveedores, UUID>{

}
