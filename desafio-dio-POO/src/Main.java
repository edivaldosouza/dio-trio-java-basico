import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição curso java");
		curso.setCargaHoraria(8);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Descrição curso js");
		curso1.setCargaHoraria(4);
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
	/*	System.out.println(curso);
		System.out.println(curso1);
		System.out.println(mentoria);*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudo().add(curso);
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(mentoria);
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila"+devCamila.getConteudoInscritos());
		
		
		Dev devJose = new Dev();
		devJose.setNome("Camila");
		devJose.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos José "+devJose.getConteudoInscritos());
		
		
		
		

	}

}
