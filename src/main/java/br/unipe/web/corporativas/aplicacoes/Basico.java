package br.unipe.web.corporativas.aplicacoes;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("basico")
public class Basico {

	private List<Usuario> listaString;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarJson() {

		List<Usuario> listaUsuario = geradorUsuarios();

		return listaUsuario;
	}

	@GET
	@Path("/lista/xml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Usuario> listarXml() {

		List<Usuario> listaUsuario = geradorUsuarios();

		return listaUsuario;
	}

	private List<Usuario> geradorUsuarios() {
		
			listaString = new ArrayList<Usuario>();

			Usuario u1 = new Usuario();
			Usuario u2 = new Usuario();
			Usuario u3 = new Usuario();

			u1.setCpf("000.000.000-00");
			u1.setEmail("Fulano@fulano.com");
			u1.setNome("Fulano");

			u2.setCpf("111.111.111-11");
			u2.setEmail("Beltrano@beltrano.com.br");
			u2.setNome("Beltrano");

			u3.setCpf("222.222.222-22");
			u3.setEmail("Maria@chiquinha.net");
			u3.setNome("Josefa");

			listaString.add(u1);
			listaString.add(u2);
			listaString.add(u3);
			
		return listaString;
	}

	@GET
	@Path("/lista/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarJson2() {

		List<Usuario> listaUsuario = geradorUsuarios();

		return listaUsuario;
	}
}
