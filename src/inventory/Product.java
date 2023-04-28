package inventory;

public class Product {
    private int numElementos;
    private String nombreProducto;
    private int numUnidades;
    private double precioUnidades;
    
    
    public Product(){
        
    }

    public Product(int numElementos, String nombreProducto, int numUnidades, double precioUnidades) {
        this.numElementos = numElementos;
        this.nombreProducto = nombreProducto;
        this.numUnidades = numUnidades;
        this.precioUnidades = precioUnidades;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    public double getPrecioUnidades() {
        return precioUnidades;
    }

    public void setPrecioUnidades(double precioUnidades) {
        this.precioUnidades = precioUnidades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto: \t").append(nombreProducto).append("\n");
        sb.append("numero de elementos : \t").append(numElementos).append("\n");
        sb.append("Unidades en stock : \t").append(numUnidades).append("\n");
        sb.append("Precio : \t").append(precioUnidades).append("\n");
        sb.append("==========================\n");
        
        return sb.toString();
    }
    
    
    
    
    
}
