package model;

import javax.persistence.*;
//ToDo hacer la clase con anotaciones y hacer también el mapeado
@Entity
@Table(name="dbo.Dons")   //En mi casa necesito dbo
public class Don {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Necesario para qeu el GBD me de el id
	private int id;
	
	//http://stackoverflow.com/questions/32968527/hibernate-sequence-doesnt-exist
	
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Apellidos")
	private String apellidos;
	@Column(name="Apodo")
	private String apodo;
	@Column(name="Procedencia")
	private String procedencia;
	
	public Don(){}
	
	public Don(int id, String nombre, String apellidos, String apodo, String procedencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.procedencia = procedencia;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
}
