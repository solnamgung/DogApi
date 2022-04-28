package com.project.DogAPIs.repository;

import com.project.DogAPIs.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
    //The @Query annotation declares finder queries directly on repository methods.
    //When I use an id as input to findBreedById, I needed to add a : into the query line to feed in from my method.
    @Query("select id, breed from Dog  where id=:id")
    String findBreedById(Long id);

    @Query("select id, breed from Dog  ")
    List<String> findAllBreed();

    @Query("select id, name from Dog ")
    List<String> findAllName();
}
