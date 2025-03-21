
public class Repuesto {

        private String Marca;
        private String Referencia;
        private int Precio;
        private int Cantidad;
    
        public Repuesto(String marca, String referencia, int precio, int cantidad) {
            Marca = marca;
            Referencia = referencia;
            Precio = precio;
            Cantidad = cantidad;
        }
    
        public Repuesto () {
        }
    
        public String getMarca() {
            return Marca;
        }
    
        public void setMarca(String marca) {
            Marca = marca;
        }
    
        public String getReferencia() {
            return Referencia;
        }
    
        public void setReferencia(String referencia) {
            Referencia = referencia;
        }
    
        public int getPrecio() {
            return Precio;
        }
    
        public void setPrecio(int precio) {
            Precio = precio;
        }

        public int getCantidad() {
            return Cantidad;
        }
    
        public void setCantidad(int cantidad) {
            Cantidad = cantidad;
        }
    
    }
    
