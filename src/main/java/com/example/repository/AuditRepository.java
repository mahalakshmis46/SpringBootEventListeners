package com.example.repository;


import com.example.model.Audit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuditRepository extends CrudRepository<Audit, Long> {
}
