import java.util.ArrayList;
import java.util.List;

public class Prueba {
    int codigo;
    String titulo;
    List<Atleta> atletas;
    List<Instalacion> instalaciones = new ArrayList<>();

    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.atletas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public List<Instalacion> getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(List<Instalacion> instalaciones) {
        this.instalaciones = instalaciones;
    }

    public void addAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

}
