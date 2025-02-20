
package ec.edu.espoch.claseuno.clases;

//aqui van los atributos
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int fechaNacimiento;
    
    //constructor

    public Persona() {
    }
    //setter y getter

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    
    //aqui van los metodos
    public void imprimir() {
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Apellido:"+this.apellido);
        System.out.println("Nacionalidad:"+this.nacionalidad);
        System.out.println("Fecha de nacimiento:"+this.fechaNacimiento);
    }
    
    public String imprimirDatos (){
        
        return "Nombre:"+this.nombre+"\n Apellido:"+this.apellido+"\n";
        
    }

    public String calcularEdad(int edad){
        String msm;
        if(edad >0){
                    if(edad>18){
            msm="ERES MAYOR DE EDAD ....";
        }else{
            msm="ERES MENOR DE EDAD....";
            }
         }else{
                msm="no existen edades negativas";
        }

        return msm;
    }

    public String situacionTrabajo(Horario objHorario){
        String msm;
        if(objHorario.getNumeroHorasTrabajo()>8){
            msm="ESTAS TRABAJANDO MAS DE LO ESTABLECIDO...";
        }else if(objHorario.getNumeroHorasTrabajo()==8){
            msm="ESTAS TRABAJANDO NORMAL....";
        }else{
            msm="NO AS TRABAJADO LO SUFICIENTE...";
        }
        return msm;
    }
    
    public String identificarDiaTrabajado(Horario objdiaLaborable){
       String msm;
       switch(objdiaLaborable.getDiaLaborable()){
           case"sabado":
               msm="no es un dia laborable";
               break;
               
           case"domingo":
               msm="no es un dia laborable";
               break;
           default:
               msm="Es un dia laborable";
       }

       return msm; 
    }
}
