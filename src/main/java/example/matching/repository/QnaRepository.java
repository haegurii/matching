package example.matching.repository;

import example.matching.entity.Qna;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

public interface QnaRepository extends CrudRepository<Qna,Long>{
    @Override
    ArrayList<Qna> findAll();
}