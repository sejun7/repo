package study.spring.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring.practice.Entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
