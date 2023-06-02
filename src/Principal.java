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
        TiposPeliculas Dune = new TiposPeliculas(
                "Dune",
                "Ciencia ficción",
                2019,
                "Estados Unidos",
                "Zendaya",
                161,
                "Todo publico",
                "Estados Unidos",
                "Warner");
        TiposPeliculas The_pianist = new TiposPeliculas(
                "The Pianist",
                "Drama",
                2004,
                "Rusia",
                "Adrien Brody",
                150,
                "+18",
                "Alemania",
                "Paramount");
        TiposPeliculas The_Batman = new TiposPeliculas(
                "The Batman",
                "Accion-Drama",
                2002,
                "Londres",
                "Robert Pattinson",
                167,
                "+18",
                "Estados Unidos",
                "Warner Bros");
        TiposPeliculas Dont_look_up = new TiposPeliculas(
                "Don´t Look up",
                "Ciencia ficción",
                2021,
                "Estados Unidos",
                "Leonardo DiCaorio",
                138,
                "+18",
                "Estados Unidos",
                "Netflix");
        TiposPeliculas Project_X = new TiposPeliculas(
                "Project X",
                "Humor",
                2012,
                "Estados Unidos",
                " Thomas Mann",
                160,
                "+18",
                "Estados Unidos",
                "Silver Pictures"
        );
        TiposPeliculas Creed = new TiposPeliculas(
                "Creed",
                "Accion-Drama",
                2015,
                "Filadelfia",
                "Michael B. Jordan",
                133,
                "Todo Publico",
                "Estados Unidos",
                "Warner Bros"
        );
        TiposPeliculas Rapidos_y_Fruriosos = new TiposPeliculas(
                "Rapidos y Furiosos",
                "Accion",
                2021,
                "EEUU",
                "Vin Diesel",
                94,
                "Para mayores de 13 años",
                "EEUU",
                "Universal Pictures");
        TiposPeliculas DeadPool = new TiposPeliculas(
                "Deadpool",
                "Accion",
                2016,
                "EEUU",
                "Ryan Reynolds",
                108,
                "R",
                "EEUU",
                "20th Century Animation");
        TiposPeliculas John_Wick = new TiposPeliculas(
                "John Wick",
                "Accion",
                2014,
                "EEUU",
                "Keanu Reeves",
                101,
                "R",
                "EEUU",
                "Lionsgate Films");
        TiposPeliculas Piratas_del_Caribe = new TiposPeliculas(
                "Piratas del Caribe",
                "Aventuras",
                2003,
                "EEUU",
                "Johnny Depp",
                143,
                "PG-13",
                "EEUU",
                "Walt Disney Pictures");
        HarryPoter.imprimirpelicula();
        Megan.imprimirpelicula();
        Encanto.imprimirpelicula();
        Eljusticiero.imprimirpelicula();
        Dune.imprimirpelicula();
        The_pianist.imprimirpelicula();
        The_Batman.imprimirpelicula();
        Dont_look_up.imprimirpelicula();
        Project_X.imprimirpelicula();
        Creed.imprimirpelicula();
        Rapidos_y_Fruriosos.imprimirpelicula();
        John_Wick.imprimirpelicula();
        DeadPool.imprimirpelicula();
        Piratas_del_Caribe.imprimirpelicula();
    }
}
