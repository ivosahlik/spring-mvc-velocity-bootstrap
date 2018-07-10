package cz.ivosahlik.controller;

import cz.ivosahlik.constants.WebRequestConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Intellij Idea
 * Created by ivosahlik on 03/07/2018
 */
@Controller
public class GreetingsController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {
			WebRequestConstants.GREETING_REQUEST_PARAM + "/{name}"
	}, method = RequestMethod.GET)
	public String greetPath(@PathVariable String name, ModelMap model) {
		logger.debug("Method greetPath");
		model.addAttribute("name", name);
		return "greeting/greetings";
	}

	@RequestMapping(value = WebRequestConstants.GREETING_REQUEST_PARAM, method = RequestMethod.GET)
	public String greetRequest(
			@RequestParam(required = false, defaultValue = "John Doe") String name,
			ModelMap model) {
		logger.debug("Method greetRequest");
		model.addAttribute("name", name);
		return "greeting/greetings";
	}
}
