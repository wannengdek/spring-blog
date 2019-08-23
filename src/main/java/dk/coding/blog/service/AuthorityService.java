package dk.coding.blog.service;

import dk.coding.blog.bean.Authority;

/**
 * Authority 服务接口.
 * 
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
