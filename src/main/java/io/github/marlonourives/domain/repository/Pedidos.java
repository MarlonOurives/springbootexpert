package io.github.marlonourives.domain.repository;

import io.github.marlonourives.domain.entity.Cliente;
import io.github.marlonourives.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
