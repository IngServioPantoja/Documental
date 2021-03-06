package co.com.documentalLabs.controladores;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.com.documentalLabs.dto.Customer;

@Controller
@RequestMapping("/customer")
public class SignUpController {

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String addCustomer(
			@Valid Customer customers,
			BindingResult result) {

		/*for (Object object : result.getAllErrors()) {
			if (object instanceof FieldError) {
				FieldError fieldError = (FieldError) object;

				System.out.println(fieldError.getField() + ":"
						+ fieldError.getCode());

			}

			if (object instanceof ObjectError) {
				ObjectError objectError = (ObjectError) object;

			}
		}*/

		if (result.hasErrors()) {
			return "SignUpForm";
		} else {
			return "Done";
		}

	}

	@RequestMapping(method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {

		model.addAttribute("customer", new Customer());
		return "SignUpForm";

	}

}