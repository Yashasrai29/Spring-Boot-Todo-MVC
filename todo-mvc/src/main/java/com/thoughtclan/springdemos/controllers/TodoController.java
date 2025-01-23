package com.thoughtclan.springdemos.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thoughtclan.springdemos.model.Todo;
import com.thoughtclan.springdemos.services.TodoService;

/**
 * Handles requests for the Add Todo page.
 */
@Controller
@RequestMapping("/todos")
public class TodoController {
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	private TodoService todoService;
	
	/**
	 * Adds given todo. Gets all todos from the service layer and adds as model
	 * attribute to be used to display them in show-todos.jspf.
	 */
	@PostMapping
	public String addTodo(Todo todo, Model model) {
		logger.info("Adding todo {}.", todo);
		
		todoService.addTodo(todo);

		// add all todos to response model
		model.addAttribute("todo", new Todo());
		model.addAttribute("todos", todoService.getTodos());
		return "todos";
	}
}
