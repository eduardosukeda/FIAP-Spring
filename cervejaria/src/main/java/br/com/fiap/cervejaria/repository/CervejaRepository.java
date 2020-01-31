package br.com.fiap.cervejaria.repository;

import br.com.fiap.cervejaria.dto.CervejaDTO;
import br.com.fiap.cervejaria.dto.Tipo;
import br.com.fiap.cervejaria.entity.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CervejaRepository extends JpaRepository<Cerveja, Integer> {

    @Query("from Cerveja where tipo = :tipo")
    List<CervejaDTO> findAll(Tipo tipo);
}
