package zerobase.newweather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.newweather.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo,Integer> {

}
