package cz.ivosahlik.controller;

import cz.ivosahlik.constants.WebRequestConstants;
import cz.ivosahlik.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Intellij Idea
 * Created by ivosahlik on 03/07/2018
 */
@Controller
public class UserServiceController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {
			WebRequestConstants.USER_REQUEST_PARAM + "/{name}/{surname}.json"
	}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
    User getUserJson(@PathVariable String name, @PathVariable String surname) {
		logger.trace("Responding service request");
		User user = new User(1L, name, surname);
		return user;
	}
	
	@RequestMapping(value = {
			WebRequestConstants.USER_REQUEST_PARAM + "/{name}/{surname}.xml"
	}, method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody User getUserXml(@PathVariable String name, @PathVariable String surname) {
		logger.trace("Responding service request");
		User user = new User(1L, name, surname);
		return user;
	}

}
