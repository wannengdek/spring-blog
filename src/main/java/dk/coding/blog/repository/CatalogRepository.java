package dk.coding.blog.repository;

import dk.coding.blog.bean.Catalog;
import dk.coding.blog.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Catalog Repository.
 * 
 * @since 1.0.0 2017年6月7日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    /**
     * 根据用户查询
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户、分类名称查询
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user, String name);
}
