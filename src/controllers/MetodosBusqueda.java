package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showcConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {
        showcConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado)
                return i;
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        int cont = 0;
        for (Persona person : people) {
            if (person.getCode() == code) {
                return cont;
            }
            cont++;
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFind = showcConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson != -1) {
            showcConsole.showMessage("Persona encontrada:");
            showcConsole.showMessage(people[indexPerson].toString());
        } else {
            showcConsole.showMessage("Persona con código " + codeToFind + " no encontrada.");
        }
    }
}
