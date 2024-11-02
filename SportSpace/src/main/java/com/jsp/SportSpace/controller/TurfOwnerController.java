package com.jsp.SportSpace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SportSpace.service.TurfOwnerService;

@RestController
public class TurfOwnerController {

	@Autowired
	TurfOwnerService ownerService;
	
	
}
