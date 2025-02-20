
package ec.edu.espoch.claseuno;

import ec.edu.espoch.claseuno.clases.Horario;
import ec.edu.espoch.claseuno.clases.Persona;


public class ClaseUno {
    
    public static void main(String[] args){
       
        //instanciar una clase
        Persona objPersona=new Persona();
        objPersona.setNombre("Willian");
        objPersona.setApellido("Caisaguano");
        objPersona.setFechaNacimiento(3);
        objPersona.setNacionalidad("ECUATORIANO");
        objPersona.imprimir();
        String result=objPersona.calcularEdad(3);
        
        System.out.println("Resultado:"+result);
        System.out.println("Datos"+objPersona.imprimirDatos());
       
     /*  
       Horario objHorario= new Horario();
       objHorario.setNumeroHorasTrabajo(5);
       Persona objPersonaa= new Persona();
        System.out.println("Resultado"+objPersona.situacionTrabajo(objHorario));
*/
       Horario objHorario= new Horario();
       objHorario.setDiaLaborable("lunes");
       Persona objPersonaa= new Persona();
        System.out.println("Resultado"+objPersona.identificarDiaTrabajado(objHorario));
    }
    
    
    
}
