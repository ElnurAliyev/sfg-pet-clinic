package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface Vet {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
