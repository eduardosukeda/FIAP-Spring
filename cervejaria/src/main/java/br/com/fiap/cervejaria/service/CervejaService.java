package br.com.fiap.cervejaria.service;

import br.com.fiap.cervejaria.dto.CervejaDTO;
import br.com.fiap.cervejaria.dto.CreateCervejaDTO;
import br.com.fiap.cervejaria.dto.PrecoCervejaDTO;
import br.com.fiap.cervejaria.dto.Tipo;
import br.com.fiap.cervejaria.entity.Cerveja;

import java.util.List;
import java.util.Optional;

public interface CervejaService {

    List<CervejaDTO> findAll(Tipo tipo);
    Optional<Cerveja> findById(Integer id);
    CervejaDTO create(CreateCervejaDTO createCervejaDTO);
    CervejaDTO update(Integer id, CreateCervejaDTO createCervejaDTO);
    CervejaDTO update(Integer id, PrecoCervejaDTO precoCervejaDTO);
    void delete (Integer id);
}
