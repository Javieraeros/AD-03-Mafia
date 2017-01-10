package model;

import javax.persistence.*;
//ToDo hacer la clase con anotaciones y hacer también el mapeado
@Entity
@Table(name="dbo.Famiglias")
public class Famiglia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nombre")
	private String nombre;

	@Column(name="CiudadPrincipal")
	private String ciudadPrincipal;

	@Column(name="Miembros")
	private short miembros;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_Don")
	private Don don;

	public Famiglia(){}
	
	public Famiglia(int id, String nombre, String ciudadPrincipal, short miembros, Don don) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudadPrincipal = ciudadPrincipal;
		this.miembros = miembros;
		this.don = don;
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

	public String getCiudadPrincipal() {
		return ciudadPrincipal;
	}

	public void setCiudadPrincipal(String ciudadPrincipal) {
		this.ciudadPrincipal = ciudadPrincipal;
	}

	public short getMiembros() {
		return miembros;
	}

	public void setMiembros(short miembros) {
		this.miembros = miembros;
	}

	public Don getDon() {
		return don;
	}

	public void setDon(Don don) {
		this.don = don;
	}
	
	
	
	
}
