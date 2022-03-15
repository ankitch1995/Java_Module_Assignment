package com.cybage.controller;

import java.util.List;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Book;

import com.cybage.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/getAllBooks")
	public ModelAndView getAllEmployees()
	{
		List<Book> bookList = bookService.getAllBooks();
		return new ModelAndView("displayBooks","listBook",bookList);
	}
	

	@GetMapping("/addBook")
	public String showForm(Model model)
	{
		
		
		model.addAttribute("book",new Book());
		return "addBook";
	}
	
	@PostMapping("/addBook")
	public ModelAndView addEmployee(@Valid @ModelAttribute("book")Book book,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("addBook","book",book);
		}
		
		bookService.addBook(book);
		return new ModelAndView("displayBooks","listBook",bookService.getAllBooks());
	}
	

	@GetMapping("/edit/{id}")
	public ModelAndView showUpdateForm(@PathVariable int id)
	{
		
		Book book = bookService.getBookById(id);
		return new ModelAndView("updateBook","book", book);
	}
	
	
	@PostMapping("/updateBook")
	public ModelAndView updateBook( @ModelAttribute("employee")Book book,BindingResult result)
	{
		
		bookService.updateEmployee(book);
		return new ModelAndView("displayBooks","listBook",bookService.getAllBooks());
	}
	
	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id)
	{
		bookService.deleteBook(id);;
		return new ModelAndView("displayBooks","listBook",bookService.getAllBooks());
	}
	
	@GetMapping("/getBookById")
	public String showFormId()
	{
	
		return "book";
	}
	@PostMapping("/getBook")
	public ModelAndView getBookById(@RequestParam("bookId")int id)
	{
		Book book = bookService.getBookById(id);
		return new ModelAndView("bookDetails","bookInfo",book);
	}
}
