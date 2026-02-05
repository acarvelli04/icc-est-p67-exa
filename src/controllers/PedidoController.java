package controllers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Pedido;

public class PedidoController {

   public Stack<Pedido> filtrarPorZona(List<Pedido> pedidos,int umbral){
        Stack<Pedido> pila = new Stack<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getZona() > umbral) {
                pila.push(pedido);
            }
          }
        return pila;
   }

   

   public TreeSet<Pedido> ordenarPorZona(Stack<Pedido> pila){
        TreeSet<Pedido> setOrdZona = new TreeSet<>();
        for (Pedido pedido : pila) {
          
        }
        return setOrdZona;
   }

   public TreeMap<Integer, Queue<Pedido>> agruparPorUrgencia(List<Pedido> pila){
        TreeMap<Integer, Queue<Pedido>> mapa = new TreeMap<>();
        for (Pedido pedido : pila) {
            int urgencia = pedido.getUrgencia();
            if (!mapa.containsKey(urgencia)) {
                mapa.put(urgencia, new LinkedList<>());
            }
            mapa.get(urgencia).add(pedido);
          }
        return mapa;
     }

   public Stack<Pedido> explotarGrupo(Map<Integer, Queue<Pedido>> mapa){
        Stack<Pedido> pilaExplota = new Stack<>();
        return pilaExplota;
   }
}
