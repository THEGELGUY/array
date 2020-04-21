

public class Persona
{
   String nombre;
   String apellido;
   String genero;
   String telefono;
   String direccion;
   String fecha_de_nacimiento;
   String lugar_de_nacimiento;
   
    public Persona()
    {
    
    }

    public Persona(String nm,String ap,String gen, String tel, String dir, String fecha, String lugar){
      this.nombre = nm;
      this.apellido = ap;
      this.genero = gen;
      this.telefono = tel;
      this.direccion = dir;
      this.fecha_de_nacimiento = fecha;
      this.lugar_de_nacimiento = lugar;
    } 
    public void setnombre(String nm){
        this.nombre = nm;
    }
    public void setapellido(String ap){
        this.apellido = ap;
    }   
    public void setgenero(String gen){
        this.genero = gen;
    }
    public void settelefono(String tel){
        this.telefono = tel;
    }
    public void setdireccion(String dir){
        this.direccion = dir;
    }
    public void setfecha_de_nacimiento(String fecha){
        this.fecha_de_nacimiento = fecha;
    }
    public void setlugar_de_nacimiento(String lugar){
        this.nombre = lugar;
    }
    
    
    
    
    
    
    public String getnombre(){
        return this.nombre;
    }
    public String getapellido(){
        return this.apellido;
    }
    public String getgenero(){
        return this.genero;
    }
    public String gettelefono(){
        return this.telefono;
    }
    public String getdireccion(){
        return this.direccion;
    }
    public String getfecha_de_nacimiento(){
        return this.fecha_de_nacimiento;
    }
    public String getlugar_de_nacimiento(){
        return this.lugar_de_nacimiento;
    }}
