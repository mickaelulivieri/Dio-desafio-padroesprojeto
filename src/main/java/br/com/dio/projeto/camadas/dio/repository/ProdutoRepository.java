package br.com.dio.projeto.camadas.dio.repository;

import br.com.dio.projeto.camadas.dio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
