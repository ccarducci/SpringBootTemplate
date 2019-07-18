package com.crick.artcomm.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crick.artcomm.model.Progetti;
import com.crick.artcomm.repository.ProgettiRepository;

@RestController
@RequestMapping("/rest/progetti")
public class ProgettiRestController {
	private static final Logger log = LoggerFactory.getLogger(ProgettiRestController.class);

	@Autowired
	private ProgettiRepository progettiRepository;

	@RequestMapping(value = "/findAll", method = { RequestMethod.POST })
	public Iterable<Progetti> findAll() {
		log.debug("findAll");
		return progettiRepository.findAll();
	}

}
