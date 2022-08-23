package com.ejemplo.SpringBoot.security.repository;

import com.ejemplo.SpringBoot.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findBynombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario (String nombreUsuario);
    boolean existsByEmail (String email);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
