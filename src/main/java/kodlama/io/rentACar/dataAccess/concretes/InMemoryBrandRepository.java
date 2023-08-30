package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository // bu sınıf bir data access nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{
	List<Brand> brands;

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand("BMW", 1));
		brands.add(new Brand("Mercedes", 2));
		brands.add(new Brand("Ford", 3));
		brands.add(new Brand("Audi", 4));
		brands.add(new Brand("Renault", 5));
		
	}

	@Override
	public List<Brand> getall() {
		return brands;
	}

}
