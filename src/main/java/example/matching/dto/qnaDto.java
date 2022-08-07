package example.matching.dto;

import example.matching.entity.Qna;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class qnaDto {

    private Long qna_id;
    private String qna_name;
    private String qna_phone;
    private String qna_email;
    private String qna_content;


    public Qna toEntity() {
        return new Qna(null,qna_name,qna_phone,qna_email,qna_content);
    }
}