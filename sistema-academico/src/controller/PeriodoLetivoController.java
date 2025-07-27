package controller;

import entity.PeriodoLetivo;
import service.PeriodoLetivoService;

import java.util.List;

public class PeriodoLetivoController {
    private PeriodoLetivoService periodoService;

    public PeriodoLetivoController(PeriodoLetivoService periodoService) {
        this.periodoService = periodoService;
    }

    public void adicionar(String descricao) {
        PeriodoLetivo pl = new PeriodoLetivo();
        pl.setAnoLetivo(descricao);

        periodoService.cadastrar(pl);
    }

    public List<PeriodoLetivo> listar() {
        return periodoService.listar();
    }

    public PeriodoLetivo exibir(int id) {
        return periodoService.consultar(id);
    }
}
