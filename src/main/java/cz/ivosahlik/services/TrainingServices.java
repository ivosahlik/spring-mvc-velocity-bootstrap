package cz.ivosahlik.services;

import cz.ivosahlik.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 08/07/2018
 */
public interface TrainingServices {

    public String getOne();

    public List<User> getAllUser();

}
