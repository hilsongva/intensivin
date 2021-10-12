package ifpe.recife.intensivin.dao;


import ifpe.recife.intensivin.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersDAO extends JpaRepository<Users, Long>{

}
