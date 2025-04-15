package views;

public class ShowConsole {
    private Scanner scanner = new Scanner (System.in);
    
    public void showMenu(){
        System.out.println("Metodo Busqueda: ")
    }
    public int getCode(){
        System.out.println("Ingrese codigo: ")
        int codigo = scanner.nextInt();
        System.out.println("Codigo Ingresado: " + codigo);
        return codigo;
    }
    
}
