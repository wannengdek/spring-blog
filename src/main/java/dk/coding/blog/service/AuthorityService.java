package dk.coding.blog.service;

import dk.coding.blog.domain.Authority;

/**
 * Authority 服务接口.
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 */
	Authority getAuthorityById(Long id);
}
