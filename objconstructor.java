public class objconstructor {

    private String Nombre;
    private int cedula;
    private int edad;
    private String auxilio;
    private String desplazado;
    private int estracto;
    public objconstructor() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getAuxilio() {
        return auxilio;
    }
    public void setAuxilio(String auxilio) {
        this.auxilio = auxilio;
    }
    public String getDesplazado() {
        return desplazado;
    }
    public void setDesplazado(String desplazado) {
        this.desplazado = desplazado;
    }
    public int getEstracto() {
        return estracto;
    }
    public void setEstracto(int estracto) {
        this.estracto = estracto;
    }
    
}