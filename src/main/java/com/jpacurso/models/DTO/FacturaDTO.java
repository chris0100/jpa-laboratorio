package com.jpacurso.models.DTO;

import com.jpacurso.models.Cliente;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class FacturaDTO implements Serializable {

	private Long id;
	private String descripcion;
	private String observacion;
	private Date createAt;
	private Cliente cliente;
	private List<ItemFacturaDTO> items;

	public FacturaDTO() {
		this.items = new ArrayList<>();
	}


	public static final long serialVersionUID = 1L;


}