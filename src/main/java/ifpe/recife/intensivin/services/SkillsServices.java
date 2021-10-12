package ifpe.recife.intensivin.services;

import ifpe.recife.intensivin.dao.SkillsDAO;
import ifpe.recife.intensivin.entities.Skills;
import ifpe.recife.intensivin.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServices {
    @Autowired
    SkillsDAO skillsDAO;

    public void salvar(Skills skills){
        skillsDAO.save(skills);
    }

    //to do método para editar

    public void deletar(Skills skills){
        skillsDAO.delete(skills);
    }

    //to do método para consultar


}
