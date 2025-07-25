package entity;

public class PeriodoLetivo {
    private Long id;
    private String anoLetivo;

    public PeriodoLetivo() {
    }

    public PeriodoLetivo(Long id, String anoLetivo) {
        this.id = id;
        this.anoLetivo = anoLetivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }
}
