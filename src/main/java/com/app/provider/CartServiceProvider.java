package com.app.provider;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Cart;

@RestController
@RequestMapping("/cart")
public class CartServiceProvider {

	@Value("${server.port}")
	private String port;
	@GetMapping("/info")
	public String getMsg() {
		return "CONSUMER:"+port;
	}
	@GetMapping("/data")
	public Cart getObj() {
		return new Cart(109, "ABC:"+port, 636.36);
	}
	@GetMapping("/list")
	public List<Cart> getBulk() {
		return Arrays.asList(
				new Cart(101, "A:"+port, 636.36),
				new Cart(102, "B:"+port, 526.46),
				new Cart(103, "C:"+port, 839.38)
				);
	}
}
