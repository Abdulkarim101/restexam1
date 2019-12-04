package restexamp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import productdto.ProductDto;

@RestController
@RequestMapping("product")
public class ProductController {

	@GetMapping(value = "get")
	public ProductDto getProduct() {
		System.out.println("i am inside get product");
		ProductDto pd = new ProductDto();
		pd.setId(20);
		pd.setName("Iohone 11");
		pd.setDescription("this is laterst iphone");

		return pd;

	}
}