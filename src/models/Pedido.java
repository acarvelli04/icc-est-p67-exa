package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {
    private String cliente;
    private String codigoPostal;
    private List<Integer> prioridades;

    //Calculadas

    private int zona;
    private int urgencia;

    public Pedido(String cliente, String codigoPostal, List<Integer> prioridades) {
        this.cliente = cliente;
        this.codigoPostal = codigoPostal;
        this.prioridades = prioridades;
        calcularZona();
        calcularUrgencia();
    }

    private void calcularUrgencia() {
        int suma = 0;
        for (int i : prioridades) {
            if (i%3 == 0) {
                suma =+i;
            }
        }

        Set<Character> vocalesUnicas = new HashSet<>();
        String nombres = cliente.toLowerCase();

        for (char c : nombres.toCharArray()) {
            if ("aeiou".indexOf(c)>= 0) {
                vocalesUnicas.add(c);
            }
        }

        urgencia = suma*vocalesUnicas.size();
    }

    private void calcularZona() {
        String[] partes = codigoPostal.split("-");
        zona = Integer.parseInt(partes[1]);
        
    }

    public String getCliente() {
        return cliente;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public List<Integer> getPrioridades() {
        return prioridades;
    }

    public int getZona() {
        return zona;
    }

    public int getUrgencia() {
        return urgencia;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", zona=" + zona + ", urgencia=" + urgencia + "]";
    }
    
    

    
}
