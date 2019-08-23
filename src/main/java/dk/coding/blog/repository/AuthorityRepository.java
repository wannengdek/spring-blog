package dk.coding.blog.repository;

import dk.coding.blog.bean.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Authority 仓库.
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
