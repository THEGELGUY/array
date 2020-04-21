import java.util.ArrayList;

 public class Principal
 {
 
    public static void Principal(String[] args)
    {
    ArrayList<Empleado> contratistas = new ArrayList<Empleado>(); 

     Empleado Empleado1 = new Empleado();
     Empleado1.setnombre("Colacho");
     Empleado1.setapellido("Mendoza");
     Empleado1.setgenero("Masculino");
     Empleado1.setdireccion("CRA 7b# 18-37");
     Empleado1.settelefono("3165898");
     Empleado1.setfecha_de_nacimiento("14/01/1937");
     Empleado1.setlugar_de_nacimiento("Barranquilla");


     Empleado Empleado2 = new Empleado();
     Empleado2.setnombre("Jair");
     Empleado2.setapellido("Sanchez");
     Empleado2.setgenero("Masculino");
     Empleado2.setdireccion("CRA 18# 37-04");
     Empleado2.settelefono("3023451687");
     Empleado2.setfecha_de_nacimiento("01/05/1997");
     Empleado2.setlugar_de_nacimiento("Barranquilla");

     contratistas.add(Empleado1);
     contratistas.add(Empleado2);
     contratistas.forEach((emp) -> System.out.println(emp.getnombre() + "  " + emp.getapellido() + " | " + emp.getgenero() + " | " + emp.gettelefono() + " | " + emp.getfecha_de_nacimiento() + " | " + emp.getlugar_de_nacimiento() ));
    
    }

   }