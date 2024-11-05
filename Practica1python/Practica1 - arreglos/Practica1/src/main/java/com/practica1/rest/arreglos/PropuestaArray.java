package com.practica1.rest.arreglos;

import com.practica1.rest.controller.tda.list.LinkedList;
import com.practica1.rest.controller.tda.list.Exception.ListEmptyException;
import com.practica1.rest.models.Propuesta;

public class PropuestaArray {
    private LinkedList<Propuesta> propuestaList;

    // Constructor
    public PropuestaArray() {
        this.propuestaList = new LinkedList<>();
    }

    // Método para agregar una propuesta
    public void addPropuesta(Propuesta propuesta) {
        propuestaList.add(propuesta);
    }

    // Método para obtener una propuesta por índice
    public Propuesta getPropuesta(int index) throws ListEmptyException, IndexOutOfBoundsException {
        return propuestaList.get(index);
    }

    // Método para actualizar una propuesta
    public void updatePropuesta(Propuesta propuesta, int index) throws ListEmptyException, IndexOutOfBoundsException {
        propuestaList.update(propuesta, index);
    }

    // Método para convertir la lista a un arreglo
    public Propuesta[] toArray() {
        return propuestaList.toArray();
    }

    // Método para mostrar todas las propuestas
    public void mostrarPropuestas() {
        System.out.println(propuestaList.toString());
    }
}

