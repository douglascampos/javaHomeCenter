package br.com.codenight.homecenter.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.codenight.homecenter.model.Temperature;

public interface TemperatureRepository extends CrudRepository<Temperature, Long> {

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Temperature> S save(S s);

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long aLong);
}