package com.JobSearch.SearchForJobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JobSearch.SearchForJobs.service.TableService;
import com.JobSearch.SearchForJobs.entity.UrlTable;

@Controller
public class UrlController {
	
	@Autowired
    private TableService tableService;

    // Endpoint to list all links
	@GetMapping("/listAll")
	public String listAllLinks(Model model) {
	    List<UrlTable> allLinks = tableService.findAllEntity();
	    model.addAttribute("allLinks", allLinks);  // Add all links to the model
	    return "index";  // Return to the index page with all links listed
	}

    // Endpoint to search for a URL by ID using a query parameter
	@GetMapping("/search")
	public String searchById(@RequestParam int urlId, Model model) {
	    // Fetch the URL by its ID
	    UrlTable url = tableService.findById(urlId);

	    // Add the URL or null to the model
	    model.addAttribute("url", url);
	    model.addAttribute("enteredId", urlId);  // Add the searched ID to the model for the "not found" message

	    // Return the index page with the result
	    return "index";
	}

    // Main page for search input
	@GetMapping("/")
	public String showSearchPage() {
	    return "index";
	}
}
