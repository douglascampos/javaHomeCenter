package main.java.br.com.codenight.homecenter.repository;

import main.java.br.com.codenight.homecenter.model.Scanner;
import org.springframework.data.repository.CrudRepository;

public interface ScannerRepository extends CrudRepository<Scanner, Long> {

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	<S extends Scanner> S save(S s);

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void delete(Long aLong);
}
