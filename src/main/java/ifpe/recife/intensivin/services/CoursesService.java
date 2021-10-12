package ifpe.recife.intensivin.services;

import ifpe.recife.intensivin.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
    @Autowired
    CoursesService coursesDAO;

    public void salvar(Courses courses){
        coursesDAO.salvar(courses);
    }

    //to do método para editar

    public void deletar(Courses courses){
        coursesDAO.deletar(courses);
    }

    //to do método para consultar
}
