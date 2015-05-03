package main.java.br.com.codenight.homecenter.repository;

import main.java.br.com.codenight.homecenter.model.Place;

import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Place, Long> {
	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Place> S save(S s);

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long aLong);
}
