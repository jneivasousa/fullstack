package br.com.fullstack.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_musica")

public class Musica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titulo", length=50)
	private String titulo;
	
	@Column(name="cadastro")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy" , shape = JsonFormat.Shape.STRING)
	private Date cadastro;
	
	@Column(name="lancamento", length=50)
	private int lancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("musicas")
	private Artista artista;
	
	
	
	
	@Override
	public String toString() {
		return "Musica [id=" + id + ", titulo=" + titulo + ", cadastro=" + cadastro + ", lancamento=" + lancamento
				+ ", artista=" + artista + "]";
	}
	public Musica() {
		super();
	}
	public Musica(int id, String titulo, Date cadastro, int lancamento, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cadastro = cadastro;
		this.lancamento = lancamento;
		this.artista = artista;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getCadastro() {
		return cadastro;
	}
	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
	public int getLancamento() {
		return lancamento;
	}
	public void setLançamento(int lancamento) {
		this.lancamento = lancamento;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	
	
	
	

}
