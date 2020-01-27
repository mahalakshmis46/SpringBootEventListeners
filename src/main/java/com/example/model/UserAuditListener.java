package com.example.model;

import com.example.Utility;
import com.example.repository.AuditRepository;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PreRemove;



import java.time.LocalDate;


public class UserAuditListener {
	
	

    @PostPersist
    public void actionBeforeSave(final User user) {
        
        Audit auditLog = new Audit();
        auditLog.setTableName("User");
        auditLog.setAction("Add new user");
        auditLog.setUpdateDate(LocalDate.now());

        AuditRepository auditRepository
        = (AuditRepository) Utility.getBean("auditRepository");

        auditRepository.save(auditLog);

    }

    @PostUpdate
    public void actionBeforeUpdate(final User user) {
        
        Audit auditLog = new Audit();
        auditLog.setTableName("User");
        auditLog.setAction("Update User : " + user.getName());
        auditLog.setUpdateDate(LocalDate.now());

        AuditRepository auditRepository
                = (AuditRepository) Utility.getBean("auditRepository");

        auditRepository.save(auditLog);

    }

    @PreRemove
    public void actionBeforeDelete(final User user) {
        
        Audit auditLog = new Audit();
        auditLog.setTableName("User");
        auditLog.setAction("Delete User : " + user.getName());
        auditLog.setUpdateDate(LocalDate.now());

       AuditRepository auditRepository
                = (AuditRepository) Utility.getBean("auditRepository");

        auditRepository.save(auditLog);


    }
}
