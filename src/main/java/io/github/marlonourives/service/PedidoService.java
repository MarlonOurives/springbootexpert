package io.github.marlonourives.service;

import io.github.marlonourives.api.dto.PedidoDTO;
import io.github.marlonourives.domain.entity.Pedido;
import io.github.marlonourives.domain.enums.StatusPedido;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
