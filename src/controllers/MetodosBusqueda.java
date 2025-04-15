package controllers;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showcConsole;
    private Person [] people;

    public MetodosBusqueda(Person [] persons){
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

    public int findPersonByCode (int code){
        int cont = 0;
        for (Person person : people) {
            if (){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public void showPersonByCode (int code){
        int codeToFind = showcConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson){
            showcConsole.showMessage ("Persona encontrada");
            showcConsole.showMessage (people[indexPerson]);
        } else {
            showcConsole.showMessage("Persona con codigo " + codeToFind + " no encontrado. ")
        }
    }
}