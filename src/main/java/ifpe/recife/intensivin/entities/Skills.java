package ifpe.recife.intensivin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="SKILLS")

public class Skills implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SKILLS_ID",nullable = false)
    private Long COURSE_ID;

    @Column(name = "TIPO_SKILL", nullable = false)
    private String tipoSkill;

    @Column(name = "NOME_SKILL", nullable = false)
    private String nomeSkill;

    @Column(name = "DATA_SKILL", nullable = false)
    private String dataSkill;

    @Column(name = "RESUMO_SKILL", nullable = false)
    private String resumoSkill;

    @Column(name = "AVALIACAO_SKILL", nullable = false)
    private Long avaliacaoSkill;







}
