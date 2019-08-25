package dk.coding.blog.repository;

import dk.coding.blog.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comment Repository 接口. 
 * 
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
