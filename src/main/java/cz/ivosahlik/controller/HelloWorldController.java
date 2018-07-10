package cz.ivosahlik.controller;

import cz.ivosahlik.constants.WebRequestConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Intellij Idea
 * Created by ivosahlik on 03/07/2018
 */
@Controller
public class HelloWorldController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {
			WebRequestConstants.HELLLO_REQUEST_PARAM
	}, method = RequestMethod.GET)
	public String hello() {
		logger.debug("Method hello");
		return "hello/hello";
	}

	@RequestMapping(value = {
			WebRequestConstants.HELLLO_WORLD_REQUEST_PARAM
	}, method = RequestMethod.GET)
	public String helloWorld() {
		logger.debug("Method helloWorld");
		return "hello/hello-world";
	}
	
	@RequestMapping(value = {
			WebRequestConstants.HELLLO_REDIRECT_REQUEST_PARAM
	}, method = RequestMethod.GET)
	public String helloRedirect() {
		logger.debug("Method helloRedirect");
		return "redirect:/hello-world";
	}

}
