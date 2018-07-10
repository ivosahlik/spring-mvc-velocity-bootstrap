package cz.ivosahlik.controller;

import cz.ivosahlik.constants.WebRequestConstants;
import cz.ivosahlik.services.TrainingServices;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Intellij Idea
 * Created by ivosahlik on 08/07/2018
 */
@Controller
public class TrainingController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TrainingServices trainingServices;

    @RequestMapping(value = WebRequestConstants.TRAINING_REQUEST_PARAM, method = RequestMethod.GET)
    public String getOne(Model model) {
        model.addAttribute("training", trainingServices.getOne());
        logger.info(trainingServices.getOne());
        return "training/training";
    }

    @RequestMapping(value = {
            WebRequestConstants.TRAININGALL_REQUEST_PARAM,
            WebRequestConstants.TRAININGALL1_REQUEST_PARAM
    }, method = RequestMethod.GET)
    public String getAllUser(Model model) {
        model.addAttribute("trainingAll", trainingServices.getAllUser());
        logger.info(trainingServices.getAllUser().toString());
        return "training/trainingAll";
    }

}
