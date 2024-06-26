import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição de mentoria em java...");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaul = new Dev();
        devRaul.setNome("Raul");
        devRaul.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devRaul.getConteudosInscritos());
        devRaul.progredir();
        System.out.println("Conteudos Concluidos: " + devRaul.getConteudosConcluidos());
        System.out.println("XP: " + devRaul.calcularTotaXp());

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devJessica.getConteudosInscritos());
        devJessica.progredir();
        System.out.println("Conteudos Concluidos: " + devRaul.getConteudosConcluidos());
        System.out.println("XP: " + devJessica.calcularTotaXp());
    }
}
