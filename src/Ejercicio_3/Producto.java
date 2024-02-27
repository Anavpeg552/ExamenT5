package Ejercicio_3;

public class Producto {

    private String codigo;

    //Al crear una instancia el codigo del producto  debe tener
    // -> dos letras y tres numeros.


    public Producto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
