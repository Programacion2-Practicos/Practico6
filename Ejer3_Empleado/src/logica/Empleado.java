package logica;

public class Empleado {
		//Atributos
		private String apellido;
		private String nombre;
		private double salario;
		private double presentismo;
		
	//Constructor defecto
	public Empleado() {
					
	}
	
	//Constructor especifico
	public Empleado(String apellido,String nombre,double salario) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.salario=salario;
	}	
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
					
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
						
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	public String getApellido() {
		return apellido;
	}
						
	public String getNombre() {
		return nombre;
	}
						
	public double getSalario() {
		return salario;
	}
	
	public String toString() {
		return "El apellido es:"+apellido+"\n"+ "El nombre es:"+nombre+" El salario anual es: "+salario;	
	}
	
	public double sueldoAnual() {
		return salario*12;
	}				
	
	public double presentismo(){
	     presentismo =(int) (salario + salario*0.10);
	     return presentismo;
	}
}
