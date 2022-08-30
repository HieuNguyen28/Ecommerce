package J6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class Controller_ShoppingCart {
	
	@GetMapping("view")
	public String view() {
		return "user/pages/shopping-cart";
	}
}
