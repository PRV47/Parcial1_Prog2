import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Juan Perez", 39784248, 1.75, 28, 82);
        Atleta atleta2 = new Atleta("Mayra Gonzalez", 404589324, 1.65, 32, 65);
        Atleta atleta3 = new Atleta("Miguel Garcia", 39568985, 1.80, 33, 95);
        Atleta atleta4 = new Atleta("Juan de la Cruz", 39896541, 1.70, 29, 80);
        Atleta atleta5 = new Atleta("Leandro Denaro", 36895412, 1.90, 30, 95);
        Atleta atleta6 = new Atleta("Ana Maria Francisco", 40457896, 1.60, 24, 55);

        EquipoNacional equipo = new EquipoNacional("Celeste y Blanco", "Argentina");
        equipo.addAtleta(atleta1);
        equipo.addAtleta(atleta2);
        equipo.addAtleta(atleta3);
        equipo.addAtleta(atleta4);
        equipo.addAtleta(atleta5);
        equipo.addAtleta(atleta6);

        Prueba prueba1 = new Prueba(10, "Carrera");
        prueba1.addAtleta(atleta1);
        prueba1.addAtleta(atleta2);
        prueba1.addAtleta(atleta3);

        Prueba prueba2 = new Prueba(11, "Salto");
        prueba2.addAtleta(atleta4);
        prueba2.addAtleta(atleta5);
        prueba2.addAtleta(atleta6);

        Instalacion instalacion = new Instalacion("Deportiva", "Mendoza", "Polideportivo Municipal Hipólito Yrigoyen", "Escuela de deportes");
        Sede sede = new Sede(5506, "18/6/2024", "18:30");

        System.out.println("Nombre del 3er atleta de la 2da prueba: " + obtenerTercerAtleta(prueba2));
        System.out.println("Código de la 2da prueba: " + prueba2.getCodigo());
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println(" ");

        System.out.println("Altura de todos los atletas: ");
        for (int i = 0; i < equipo.getAtletas().size(); i++) {
            Atleta esteAtleta = equipo.getAtletas().get(i);
            System.out.println(esteAtleta.getNombre() + ": " + esteAtleta.getAltura());
        }
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println(" ");

        System.out.println("Los atletas tienen sobrepeso?");
        for (Atleta atleta : equipo.getAtletas()) {
            System.out.println(atleta.getNombre() + ": " + atleta.obtenerSobrepeso());
        }
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println(" ");
    }

    public static String obtenerTercerAtleta(Prueba prueba) {
        if (prueba.getAtletas().size() >= 3) {
            return prueba.getAtletas().get(2).getNombre();
        } else {
            return "No hay un tercer atleta en esta prueba";
        }
    }
}
