package cz.ivosahlik.services.impl;

import cz.ivosahlik.model.User;
import cz.ivosahlik.services.TrainingServices;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 08/07/2018
 */
@Service
public class TrainingServicesImpl implements TrainingServices {

    @Override
    public String getOne() {
        return "Hello World, how are you Ivo...";

    }

    @Override
    public List<User> getAllUser() {
        User user1 = new User(1L, "Ivo", "Vosahlik");
        User user2 = new User(2L, "Michaela", "Ruzickova");
        return Arrays.asList(user1, user2);
    }
}
