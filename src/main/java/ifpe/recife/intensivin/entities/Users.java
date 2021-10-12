package ifpe.recife.intensivin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="USERS")

public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID",nullable = false)
    private Long USER_ID;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "DEFICIENCIA", nullable = false)
    private String deficiencia;
    @Column(name = "LING_PRINCIPAL", nullable = false)
    private String lingPrincipal;
    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private String dataNascimento;
    @Column(name = "END_CEP", nullable = false)
    private String endCep;
    @Column(name = "END_NUMERO", nullable = false)
    private String endNumero;
    //mapeamento 1:n (usuários : cursos)








}
