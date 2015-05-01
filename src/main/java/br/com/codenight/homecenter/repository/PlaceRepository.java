package br.com.codenight.homecenter.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.codenight.homecenter.model.Place;

public interface PlaceRepository extends CrudRepository<Place, Long> {
	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Place> S save(S s);

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long aLong);
}
