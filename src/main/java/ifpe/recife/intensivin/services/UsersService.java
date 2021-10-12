package ifpe.recife.intensivin.services;

import ifpe.recife.intensivin.dao.UsersDAO;
import ifpe.recife.intensivin.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersDAO usersDAO;

    public void salvar(Users user){
        usersDAO.save(user);
    }

    //to do método para editar

    public void deletar(Users user){
        usersDAO.delete(user);
    }

    //to do método para consultar


}
