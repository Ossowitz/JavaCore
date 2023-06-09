package ru.javawebinar.topjava.repository.inmemory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;

import java.util.Collections;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(InMemoryUserRepository.class);

    @Override
    public User save(User user) {
        log.info("save {}", user);
        return user;
    }

    @Override
    public boolean delete(int id) {
        log.info("delete {}", id);
        return true;
    }

    @Override
    public User get(int id) {
        log.info("get {}", id);
        return null;
    }

    @Override
    public User getByEmail(String email) {
        log.info("getAll");
        return null;
    }

    @Override
    public List<User> getAll() {
        log.info("getAll");
        return Collections.emptyList();
    }
}
