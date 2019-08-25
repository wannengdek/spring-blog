package dk.coding.blog.repository;

import dk.coding.blog.bean.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote Repository接口.
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
	
}
