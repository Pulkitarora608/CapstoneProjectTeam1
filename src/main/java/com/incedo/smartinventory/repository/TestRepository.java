package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
	

}
