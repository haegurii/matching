package example.matching.dto;

import example.matching.entity.Matching;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class matchingDto {

    private Long id;
    private String teamName;
    private String event;
    private int people;
    private String ability;
    private String gameDay;
    private String phone;

    private String sido;
    private String gungu1;

    private String location;
    private String wish;

    public String remake(){
        this.location = this.sido+" "+this.gungu1+" "+this.location;
        return location;
    }



    public Matching toEntity() {
        remake();
        return new Matching(null,teamName,event,people,ability,gameDay,phone,location,wish);
    }
}
