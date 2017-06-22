package br.com.teste.application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Conta implements Serializable{

	
	private static final long serialVersionUID = -5763657881397740390L;
	
	@Id
	@GeneratedValue
	private Long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;	
	@Column(length = 50)
	private String cliente;
	@Column(length = 20)
	private String documento;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date vencimento;
	@Column( precision = 4, scale = 2)
	private Double valor;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataBaixa;
	@Column( precision = 4, scale = 2)
	private Double valorPago;
	@Column( precision = 4, scale = 2)
	private Double desconto;
	@Column( precision = 4, scale = 2)
	private Double juros;
	@Enumerated(EnumType.STRING)
	private TipoConta tipo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Date getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getJuros() {
		return juros;
	}
	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	
}
