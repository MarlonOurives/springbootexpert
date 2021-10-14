package io.github.marlonourives.domain.repository;

import io.github.marlonourives.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
