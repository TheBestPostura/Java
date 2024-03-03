/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea04;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Insets;




public class QuienEsQuien extends JFrame {
    private Scanner teclado;
    private String nombre;
    private String tipo;
    private String color;
    private Boolean legendario;
    private Boolean terrestre;
    private Boolean volador;
    private Boolean acuatico;
    private Boolean preevolucion;
    private static ArrayList<QuienEsQuien> listaPokemons = new ArrayList<>();
    private QuienEsQuien pokemonSeleccionado;
    private JButton boton1, boton2;
    private GridBagConstraints gbc1 = new GridBagConstraints();
    private GridBagConstraints gbc2 = new GridBagConstraints();
    private JFrame ventanaPrincipal = new JFrame();


    //*****************************************************Constructor de caracteristicas*********************************************************************

    public QuienEsQuien(String nombre, String tipo, String color, Boolean legendario, Boolean terrestre, Boolean volador, Boolean acuatico,
                        Boolean preevolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.legendario = legendario;
        this.terrestre = terrestre;
        this.volador = volador;
        this.acuatico = acuatico;
        this.preevolucion = preevolucion;


    }
    //***********************************************************clase creada por la cara pero funciona*************************************************


    public QuienEsQuien(ArrayList<QuienEsQuien> listaPokemons) {
    }


    //************************************************Metodos get de caracteristicas**********************************************************************

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getcolor() {
        return color;
    }

    public Boolean getLegendario() {
        return legendario;
    }


    public Boolean getTerrestre() {
        return terrestre;
    }

    public Boolean getVolador() {
        return volador;
    }

    public Boolean getAcuatico() {
        return acuatico;
    }

    public Boolean getPreevolucion() {
        return preevolucion;
    }


    //Metodos set de caracteristicas

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLegendario(Boolean legendario) {
        this.legendario = legendario;
    }


    public void setTerrestre(Boolean terrestre) {
        this.terrestre = terrestre;
    }

    public void setVolador(Boolean volador) {
        this.volador = volador;
    }

    public void setAcuatico(Boolean acuatico) {
        this.acuatico = acuatico;
    }

    public void setPreevolucion(Boolean preevolucion) {
        this.preevolucion = preevolucion;
    }

    //*********************************************************Escoger un pokemon del array*************************************************************


    public void escogerPokemon() {
        Scanner teclados = new Scanner(System.in);
        System.out.println("Elige un pokemon del 0 al 8");
        System.out.println("El numero 0 es Charidard \n" +
                "El numero 1 es Rayquaza \n" +
                "El numero 2 es Groudon \n" +
                "El numero 3 es Onix \n" +
                "El numero 4 es Steelix \n" +
                "El numero 5 es Kyogre \n" +
                "El numero 6 es Lugia \n" +
                "El numero 7 es Charmander \n" +
                "El numero 8 es Pikachu \n");
        int seleccionado = teclados.nextInt();
        pokemonSeleccionado = listaPokemons.get(seleccionado);
        System.out.println("EL pokemon seleccionado es: " + pokemonSeleccionado.getNombre());

    }


    //*********************************************************Preguntas***********************************************************************************
    public void esTipo() {
        teclado = new Scanner(System.in);
        System.out.println("El pokemon elegido de que tipo es?");
        tipo = teclado.nextLine();
        if (tipo.equalsIgnoreCase(pokemonSeleccionado.getTipo())) {
            for (int i = 0; i < listaPokemons.size(); i++) {
                listaPokemons.removeIf(pokemon -> !pokemon.getTipo().equalsIgnoreCase(tipo));
            }
            System.out.println("El pokemon si es de tipo " + tipo);
            System.out.println("Los pokemon que no eran de tipo " + tipo + " fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());
            }
            System.out.println("Enhorabuena, certaste la primera pregunta!!!!!!!!!!!, pasemos a la siguiente");
        } else {
            System.out.println("El pokemon que seleccionaste no es de el tipo descrito...");
            System.out.println("No se ha modificado la lista lo cual aun te quedan estos pokemons: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());
            }
            System.out.println("Lo siento, no acertaste la Segunda, pasemos a la siguiente...");
        }
        System.out.println();
        System.out.println("********************************************************************************************");
        System.out.println();
    }

    public void esColor() {
        teclado = new Scanner(System.in);
        System.out.println("De que color es el pokemon que seleccionaste? ");
        color = teclado.next();
        if (color.equalsIgnoreCase(pokemonSeleccionado.getcolor())) {
            for (int i = 0; i < listaPokemons.size(); i++) {
                listaPokemons.removeIf(pokemon -> !pokemon.getcolor().equalsIgnoreCase(color));
            }
            System.out.println("El pokemon que seleccionaste si es de color: " + color);
            System.out.println("Los pokemon que no es de tipo " + color + " fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());
            }
        } else {
            System.out.println("El pokemon que seleccionaste no era del color descrito....");
            System.out.println("Lo siento, no acertaste la Tercera pregunta, pasemos a la siguiente...");
        }
        System.out.println();
        System.out.println("********************************************************************************************");
        System.out.println();
    }

    public void esLegendario() {
        teclado = new Scanner(System.in);
        System.out.println("EL pokemon es 'legendario'?");
        legendario = false;
        String respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("si")) {
            legendario = true;
        }
        if (legendario) {
            listaPokemons.removeIf(pokemon -> !pokemon.getLegendario());
            System.out.println("El pokemon que seleccionaste si es legendario");
            System.out.println("Los pokemon no 'Legendarios' fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());
            }
        } else {
            if (legendario == false) {
                System.out.println("El pokemon que seleccionaste no es legendario....");

                System.out.println();
                System.out.println("Lo siento, no acertaste la primera pregunta, pasemos a la siguiente...");
                System.out.println("********************************************************************************************");
                System.out.println();
            }
        }
    }

    public void esVolador() {
        teclado = new Scanner(System.in);
        volador = false;
        System.out.println("EL pokemon es de tipo volador? ");
        String respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("si")) {
            volador = true;
        }
        if (volador) {
            listaPokemons.removeIf(pokemon -> !pokemon.getVolador());
            System.out.println("El pokemon que seleccionaste si es Volador");
            System.out.println("Los pokemon no 'Voladored' fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());
            }

        } else {
            if (volador == false) {
                System.out.println("El pokemon que seleccionaste no es Volador....");

                System.out.println();
                System.out.println("Lo siento, no acertaste la cuarta pregunta, pasemos a la siguiente...");
                System.out.println("********************************************************************************************");
                System.out.println();
            }
        }

    }

    public void esPreevolucion() {
        teclado = new Scanner(System.in);
        preevolucion = false;
        System.out.println("El pokemon tiene preevolucion?");
        String respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("si")) {
            terrestre = true;
        }
        if (terrestre) {
            listaPokemons.removeIf(pokemon -> !pokemon.getPreevolucion());
            System.out.println("El pokemon que seleccionaste si es preevolucion");
            System.out.println("Los pokemon que no tienen 'preevolucion' fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());

            }

        } else {
            if (preevolucion == false) {
                preevolucion = false;
                System.out.println("El pokemon que seleccionaste no es Terrestre....");

                System.out.println();
                System.out.println("Lo siento, no acertaste la sexta pregunta, pasemos a la siguiente...");
                System.out.println("********************************************************************************************");
                System.out.println();
            }

        }
    }

    public void esTerrestre() {
        teclado = new Scanner(System.in);
        terrestre = false;
        System.out.println("El pokemon es terrestre?");
        String respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("si")) {
            terrestre = true;
        }
        if (terrestre) {
            listaPokemons.removeIf(pokemon -> !pokemon.getTerrestre());
            System.out.println("El pokemon que seleccionaste si es terrestre");
            System.out.println("Los pokemon que no  son 'Terrestres' fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());

            }

        } else {
            if (terrestre == false) {
                terrestre = false;
                System.out.println("El pokemon que seleccionaste no es Terrestre....");

                System.out.println();
                System.out.println("Lo siento, no acertaste la sexta pregunta, pasemos a la siguiente...");
                System.out.println("********************************************************************************************");
                System.out.println();
            }

        }
    }


    public void esAcuatico() {
        teclado = new Scanner(System.in);
        acuatico = false;
        System.out.println("El pokemon es Acuatico?");
        String respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("si")) {
            acuatico = true;
        }
        if (acuatico) {
            listaPokemons.removeIf(pokemon -> !pokemon.getAcuatico());
            System.out.println("El pokemon que seleccionaste si es Acuatico");
            System.out.println("Los pokemon que no  son 'Acuatico' fueron eliminados: ");
            System.out.println("Pokemons restantes de la lista: ");
            for (QuienEsQuien pokemon : listaPokemons) {
                System.out.println(pokemon.getNombre());

            }

        } else {
            if (acuatico == false) {
                acuatico = false;
                System.out.println("El pokemon que seleccionaste no es Acuatico....");

                System.out.println();
                System.out.println("Lo siento, no acertaste la Septima pregunta, pasemos a la siguiente...");
                System.out.println("********************************************************************************************");
                System.out.println();
            }

        }
    }

    public void adivinarPokemon() {
        teclado = new Scanner(System.in);
        String respuesta;
        System.out.println("No te quedan mas preguntas, tienes que adivinar el pokemon, indica su nombre");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase(pokemonSeleccionado.getNombre())) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Te has fumado un porro y despues de 90 preguntas sigues fallando");
        }
    }

    public void ventanaPrincipal() {

         Icon imagenFondo = new ImageIcon(getClass().getResource("fondo.jpg"));
         
         JLabel labelfondo = new JLabel(imagenFondo);
         labelfondo.setBounds(0,0,getWidth(),getHeight());
         add(labelfondo);
         setComponentZOrder(labelfondo,0);
         labelfondo.setVisible(true);


        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        GridBagConstraints gbc2 = new GridBagConstraints();
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.insets = new Insets(10, 10, 10, 10);
        panel.add(labelfondo);
        panel.add(new JLabel("Bienvenido"), gbc1);

        //******************************************************************Propiedades boton1
        JButton boton1 = new JButton("Jugar");
        boton1.setPreferredSize(new Dimension(100, 30));
        boton1.setMinimumSize(new Dimension(100, 30));
        boton1.setMaximumSize(new Dimension(100, 30));
        boton1.setFont(new Font("Arial",Font.BOLD,20));
        boton1.setFocusPainted(false);
        gbc2.insets = new Insets(10, 0, 10, 0);
        gbc2.gridy = 1; // Se cambia gbc1 por gbc2
        panel.add(boton1, gbc2);

        //******************************************************************Propiedades boton2
        JButton boton2 = new JButton("salir");
        boton2.setPreferredSize(new Dimension(100, 30));
        boton2.setMinimumSize(new Dimension(100, 30));
        boton2.setMaximumSize(new Dimension(100, 30));
        boton2.setFont(new Font("Arial",Font.BOLD,20));
        boton2.setFocusPainted(false);
        gbc3.gridy = 2;
        panel.add(boton2, gbc3); // Se usa gbc3 para boton2

        //******************************************************************Propiedades ventana principal

      
        ventanaPrincipal.setMinimumSize(new Dimension(900,600));
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setTitle("QuienEsQuien");
        ventanaPrincipal.add(panel);
         // ventanaPrincipal.add(labelfondo);
        ventanaPrincipal.pack();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        //***************************************************************Constructor pokemons y añadirlos a la lista**********************************************************
        QuienEsQuien pikachu = new QuienEsQuien("Pikachu", "Electrico", "Amarillo", true, true, false, false, true);
        QuienEsQuien charizard = new QuienEsQuien("Charizard", "Fuego", "Naraja", true, false, true, false, true);
        QuienEsQuien rayquaza = new QuienEsQuien("Rayquaza", "Dragon", "Verde", false, false, true, false, false);
        QuienEsQuien groudon = new QuienEsQuien("Groudon", "Tierra", "Rojo", false, true, false, false, false);
        QuienEsQuien onix = new QuienEsQuien("Onix", "Roca", "Gris", true, true, false, false, false);
        QuienEsQuien steelix = new QuienEsQuien("Steelix", "Acero", "Gris", true, true, false, false, true);
        QuienEsQuien kyogre = new QuienEsQuien("Kyogre", "Agua", "Azul", false, false, false, true, false);
        QuienEsQuien lugia = new QuienEsQuien("Lugia", "Volador", "Blanco", false, false, true, false, false);
        QuienEsQuien charmander = new QuienEsQuien("Charmander", "Fuego", "Naranja", true, true, false, false, false);

        listaPokemons.add(charizard);
        listaPokemons.add(rayquaza);
        listaPokemons.add(groudon);
        listaPokemons.add(onix);
        listaPokemons.add(steelix);
        listaPokemons.add(kyogre);
        listaPokemons.add(lugia);
        listaPokemons.add(charmander);
        listaPokemons.add(pikachu);

        //***************************************************************************Constructor de ventana*********************************************************************


        QuienEsQuien pokemon = new QuienEsQuien(listaPokemons);
        pokemon.ventanaPrincipal();
        pokemon.escogerPokemon();
        pokemon.esLegendario();
        pokemon.esTipo();
        pokemon.esColor();
        pokemon.esVolador();
        pokemon.esTerrestre();
        pokemon.esPreevolucion();
        pokemon.esAcuatico();
        pokemon.adivinarPokemon();


    }
}
