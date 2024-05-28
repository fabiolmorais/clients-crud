package com.desafio.clients_crud.repositories;

import com.desafio.clients_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
