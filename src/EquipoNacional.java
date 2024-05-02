import java.util.ArrayList;
import java.util.List;

public class EquipoNacional {
    String color;
    String pais;
    List<Atleta> atletas;

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.atletas = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void addAtleta(Atleta atleta) {
        atletas.add(atleta);
    }


}
