package example.matching.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
public class Qna {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long qna_id;
    @Column
    private String qna_name;
    @Column
    private String qna_phone;
    @Column
    private String qna_email;
    @Column
    private String qna_content;

}