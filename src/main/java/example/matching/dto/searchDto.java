package example.matching.dto;

import example.matching.entity.Search;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class searchDto {
    private String searchContent;
    public Search toEntity() {
        return new Search(null,searchContent);
    }
}
