package com.sic.formulario.encuesta.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "formularios")
public class Formulario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 20)
	private String documento;
	@Column(nullable = false, length = 50)
	private String correo;
	private String comentarios;
	
	@ManyToOne
	@JoinColumn(name = "fk_marca_pc")
	private MarcaPC marcaPC;
	
	@Column(name = "fecha_respuesta")
	@Temporal(TemporalType.DATE)
	private Date fechaRespuesta;
	
	@PrePersist
	public void prePersist() {
		fechaRespuesta = new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public MarcaPC getMarcaPC() {
		return marcaPC;
	}
	public void setMarcaPC(MarcaPC marcaPC) {
		this.marcaPC = marcaPC;
	}
	public Date getFecha() {
		return fechaRespuesta;
	}
	public void setFecha(Date fecha) {
		this.fechaRespuesta = fecha;
	}
	
	private static final long serialVersionUID = 1L;
	
}
