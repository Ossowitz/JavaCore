package ru.javawebinar.topjava.model;

import org.springframework.util.CollectionUtils;

import java.util.*;

import static ru.javawebinar.topjava.util.MealsUtil.DEFAULT_CALORIES_PER_DAY;

public class User extends AbstractNameEntity {
    private String email;

    private String password;

    private boolean enabled;

    private Date registered = new Date();

    private Set<Role> roles;

    private int caloriesPerDay;

    public User(Integer id, String name, String email, String password, Role... roles) {
        this(id, name, email, password, DEFAULT_CALORIES_PER_DAY, true, Arrays.asList(roles));
    }

    public User(Integer id, String name, String email, String password, int caloriesPerDay, boolean enabled, Collection<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.caloriesPerDay = caloriesPerDay;
        this.enabled = enabled;
        setRoles(roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public int getCaloriesPerDay() {
        return caloriesPerDay;
    }

    public void setCaloriesPerDay(int caloriesPerDay) {
        this.caloriesPerDay = caloriesPerDay;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? EnumSet.noneOf(Role.class) : EnumSet.copyOf(roles);
    }

    @Override
    public String toString() {
        return "User{" +
               "email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", enabled=" + enabled +
               ", registered=" + registered +
               ", roles=" + roles +
               ", caloriesPerDay=" + caloriesPerDay +
               '}';
    }
}
