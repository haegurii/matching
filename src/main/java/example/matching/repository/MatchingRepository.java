package example.matching.repository;

import example.matching.entity.Matching;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MatchingRepository extends CrudRepository<Matching,Long> {
@Override
    ArrayList<Matching> findAll();
}
