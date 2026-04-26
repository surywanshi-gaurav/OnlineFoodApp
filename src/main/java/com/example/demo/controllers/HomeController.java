package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.loginCredentials.AdminLogin;
import com.example.demo.loginCredentials.UserDto;
import com.example.demo.services.ProductServices;
import com.example.demo.services.UserServices;

import jakarta.validation.Valid;

@Controller
public class HomeController 
{
	@Autowired
	private ProductServices productServices;
	
	@Autowired
	private UserServices userService;
	
	@GetMapping(value = {"/home", "/"})
	public String home()
	{
		return "Home";
	}

	@GetMapping("/products")
	public String products( Model model)
	{ 
		List<Product> allProducts = this.productServices.getAllProducts();
		model.addAttribute("products", allProducts);
		return "Products";
	}

	@GetMapping("/location")
	public String location()
	{
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about()
	{
		return "About";
	}

	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("adminLogin",new AdminLogin());
		return "Login";
	}
	 // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("userRegistration", user);
        return "register";
    }

    // handler method to handle register user form submit request
   /* @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("userRegistration") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.getUserByEmail(user.getUserEmail());
		
		 if (existing != null) { result.rejectValue("userEmail", null,
		 "There is already an account registered with that email"); }
	
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
         userService.addUser(user);
        return "redirect:/register?success";
    }*/

}



















