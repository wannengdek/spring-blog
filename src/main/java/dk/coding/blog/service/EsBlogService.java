package dk.coding.blog.service;


import dk.coding.blog.domain.User;
import dk.coding.blog.domain.es.EsBlog;
import dk.coding.blog.vo.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Blog 服务接口.
 */
public interface EsBlogService {
 	
	/**
	 * 删除Blog
	 */
	void removeEsBlog(String id);
	
	/**
	 * 更新 EsBlog
	 * @return
	 */
	EsBlog updateEsBlog(EsBlog esBlog);
	
	/**
	 * 根据id获取Blog
	 */
	EsBlog getEsBlogByBlogId(Long blogId);
 
	/**
	 * 最新博客列表，分页
	 */
	Page<EsBlog> listNewestEsBlogs(String keyword, Pageable pageable);
 
	/**
	 * 最热博客列表，分页
	 */
	Page<EsBlog> listHotestEsBlogs(String keyword, Pageable pageable);
	
	/**
	 * 博客列表，分页
	 */
	Page<EsBlog> listEsBlogs(Pageable pageable);
	/**
	 * 最新前5
	 */
	List<EsBlog> listTop5NewestEsBlogs();
	
	/**
	 * 最热前5
	 */
	List<EsBlog> listTop5HotestEsBlogs();
	
	/**
	 * 最热前 30 标签
	 */
	List<TagVO> listTop30Tags();

	/**
	 * 最热前12用户
	 */
	List<User> listTop12Users();
}
