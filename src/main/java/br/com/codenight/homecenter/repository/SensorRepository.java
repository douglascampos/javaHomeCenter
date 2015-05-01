package br.com.codenight.homecenter.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.codenight.homecenter.model.Sensor;

public interface SensorRepository extends CrudRepository<Sensor, Long> {

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Sensor> S save(S s);

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long aLong);
}