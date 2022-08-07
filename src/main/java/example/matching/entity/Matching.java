package example.matching.entity;


import example.matching.dto.matchingDto;
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
public class Matching {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;



    @Column
    private String teamName;
    @Column
    private String event;
    @Column
    private int people;
    @Column
    private String ability;
    @Column
    private String gameDay;
    @Column
    private String phone;
    @Column
    private String location;
    @Column
    private String wish;








}
