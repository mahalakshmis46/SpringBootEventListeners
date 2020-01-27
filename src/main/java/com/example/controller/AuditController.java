package com.example.controller;

import com.example.model.Audit;
import com.example.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {
    @Autowired
    private AuditRepository auditRepository;

    @RequestMapping(value = "/getAudit" , method = RequestMethod.GET)
    public ResponseEntity<Iterable<Audit>> getAudit() {
        return new ResponseEntity<Iterable<Audit>>(auditRepository.findAll(), HttpStatus.OK);
    }
}
