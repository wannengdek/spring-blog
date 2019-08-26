package dk.coding.blog.service;

import dk.coding.blog.domain.Catalog;
import dk.coding.blog.domain.User;
import dk.coding.blog.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Catalog 服务.
 */
@Service
public class CatalogServiceImpl implements CatalogService{

	private final CatalogRepository catalogRepository;

	@Autowired
	public CatalogServiceImpl(CatalogRepository catalogRepository) {
		this.catalogRepository = catalogRepository;
	}

	@Override
	public void saveCatalog(Catalog catalog) {
		// 判断重复
		List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
		if(list !=null && !list.isEmpty()) {
			throw new IllegalArgumentException("该分类已经存在了");
		}
		catalogRepository.save(catalog);
	}

	@Override
	public void removeCatalog(Long id) {
		catalogRepository.deleteById(id);
	}

	@Override
	public Catalog getCatalogById(Long id) {
		return catalogRepository.findById(id).orElse(null);
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

}
