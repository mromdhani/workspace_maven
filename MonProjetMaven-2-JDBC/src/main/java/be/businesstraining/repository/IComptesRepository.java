package be.businesstraining.repository;

import java.util.List;

import be.businesstraining.domain.Compte;

public interface IComptesRepository {

	// CRUD ...
	List<Compte> findAll();

}