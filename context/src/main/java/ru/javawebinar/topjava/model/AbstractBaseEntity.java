package ru.javawebinar.topjava.model;

public class AbstractBaseEntity {
    protected Integer id;

    protected AbstractBaseEntity(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
