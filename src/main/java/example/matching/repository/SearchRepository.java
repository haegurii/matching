package example.matching.repository;
import example.matching.entity.Search;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;
public interface SearchRepository extends CrudRepository<Search,Long>{
    @Override
    ArrayList<Search> findAll();
}
