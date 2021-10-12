package ifpe.recife.intensivin;

import ifpe.recife.intensivin.entities.Courses;
import ifpe.recife.intensivin.entities.Users;
import ifpe.recife.intensivin.services.CoursesService;
import ifpe.recife.intensivin.services.SkillsServices;
import ifpe.recife.intensivin.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntensivinMain implements CommandLineRunner {
    @Autowired
    private UsersService usersService;
    private CoursesService coursesService;
    private SkillsServices skillsServices;

    public static void main(String[] args) {
        SpringApplication.run(IntensivinMain.class, args);
    }
    @Override
    public void run(String... args)throws Exception {
        System.out.println("Início do Programa");
        Users estudante1 = new Users();
        estudante1.setNome("João");
        estudante1.setDeficiencia("cego");
        estudante1.setLingPrincipal("braile e português");
        estudante1.setCpf("123");
        estudante1.setEmail("joao@discente.ifpe.edu.br");
        estudante1.setPassword("1234");
        estudante1.setFone("81.999999999");
        estudante1.setDataNascimento("28/02/1981");
        estudante1.setEndCep("53090-040");
        estudante1.setEndNumero("110");


        Courses curso1 = new Courses();
        curso1.setNomeCurso("Eletrotécnica");
    }
}
