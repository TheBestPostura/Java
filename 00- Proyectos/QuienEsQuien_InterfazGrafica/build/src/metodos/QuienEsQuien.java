/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.ArrayList;
import metodos.QuienEsQuien;

/**
 *
 * @author Postura
 */
public class QuienEsQuien {
    private String nombre;
    private String tipo;
    private String color;
    private Boolean legendario;
    private Boolean terrestre;
    private Boolean volador;
    private Boolean acuatico;
    private Boolean preevolucion;
    private static ArrayList<QuienEsQuien> listaPokemons = new ArrayList<>();

    static {
        QuienEsQuien charizard = new QuienEsQuien("Charizard", "Fuego", "Naraja", true, false, true, false, true); 
        QuienEsQuien rayquaza = new QuienEsQuien("Rayquaza", "Dragon", "Verde", false, false, true, false, false);
        QuienEsQuien groudon = new QuienEsQuien("Groudon", "Tierra", "Rojo", false, true, false, false, false);
        QuienEsQuien onix = new QuienEsQuien("Onix", "Roca", "Gris", true, true, false, false, false);
        QuienEsQuien steelix = new QuienEsQuien("Steelix", "Acero", "Gris", true, true, false, false, true);
        QuienEsQuien kyogre = new QuienEsQuien("Kyogre", "Agua", "Azul", false, false, false, true, false);
        QuienEsQuien lugia = new QuienEsQuien("Lugia", "Volador", "Blanco", false, false, true, false, false);
        QuienEsQuien charmander = new QuienEsQuien("Charmander", "Fuego", "Naranja", true, true, false, false, false); 
        QuienEsQuien pikachu = new QuienEsQuien("Pikachu", "Electrico", "Amarillo", true, true, false, false, true);
        
        listaPokemons.add(charizard);
        listaPokemons.add(rayquaza);
        listaPokemons.add(groudon);
        listaPokemons.add(onix);
        listaPokemons.add(steelix);
        listaPokemons.add(kyogre);
        listaPokemons.add(lugia);
        listaPokemons.add(charmander);
        listaPokemons.add(pikachu);
    }
    
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
 
  public QuienEsQuien(ArrayList<QuienEsQuien> listaPokemons) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getLegendario() {
        return legendario;
    }

    public void setLegendario(Boolean legendario) {
        this.legendario = legendario;
    }

    public Boolean getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(Boolean terrestre) {
        this.terrestre = terrestre;
    }

    public Boolean getVolador() {
        return volador;
    }

    public void setVolador(Boolean volador) {
        this.volador = volador;
    }

    public Boolean getAcuatico() {
        return acuatico;
    }

    public void setAcuatico(Boolean acuatico) {
        this.acuatico = acuatico;
    }

    public Boolean getPreevolucion() {
        return preevolucion;
    }

    public void setPreevolucion(Boolean preevolucion) {
        this.preevolucion = preevolucion;
    }

    public static ArrayList<QuienEsQuien> getListaPokemons() {
        return listaPokemons;
    }
}
