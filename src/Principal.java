import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Datos de peliculas");
        //instancias
        Scanner entrada = new Scanner(System.in);


        TiposPeliculas HarryPoter = new TiposPeliculas(
                "Harry Potter y el cáliz de fuego",
                "Fantasía", 2005,
                "Estados Unidos",
                "Daniel Radcliffe",
                97,
                "PG-13",
                "Reino Unido",
                "Heyday Films");
        TiposPeliculas Megan = new TiposPeliculas(
                "Megan",
                "Terror",
                2023,
                "Estados Unidos",
                "Amie Donald",
                102,
                "PG-13",
                "Estados Unidos",
                "Universal Pictures");
        TiposPeliculas Encanto = new TiposPeliculas(
                "Encanto",
                "infantil",
                2021,
                "Walt Disney Picture",
                "Stefanie Beatriz",
                109,
                "Todo publico",
                "Estados Unidos",
                "Walt Disney Studios");
        TiposPeliculas Eljusticiero = new TiposPeliculas(
                "El Justiciero 2",
                "Accion",
                2018,
                "Estados Unidos",
                "Denzel Washington",
                121,
                "violenta",
                "Estados Unidos",
                "Columbia Pictures");
        HarryPoter.imprimirpelicula();
    }
}
