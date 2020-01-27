package com.example.model;

import javax.persistence.*;

import java.time.LocalDate;


@Entity
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="table_name")
    private String tableName;

    @Column(name="action")
    private String action;

    @Column(name="update_date")
    private LocalDate updateDate;

    public Audit(String tableName, String action, LocalDate updateDate) {
        this.tableName = tableName;
        this.action = action;
        this.updateDate = updateDate;
    }

    public Audit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate localDate) {
        this.updateDate = localDate;
    }

    @Override
    public String toString() {
        return "AuditLog{" +
                "tableName='" + tableName + '\'' +
                ", action='" + action + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
