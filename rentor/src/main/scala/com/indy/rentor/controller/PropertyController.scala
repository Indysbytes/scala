package com.indy.rentor.controller

import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import com.indy.rentor.repository.{PropertyDAO, CustomerRepository}
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod._
import org.springframework.web.servlet.ModelAndView

@Controller
class PropertyController {

    import ControllerTools._

    @Autowired
    val propertyRepository: PropertyDAO = null

    @RequestMapping(value = Array("/customers/new"), method = Array(GET))
    def showNewPropertyForm() = new ModelAndView("customer/customer-new", "customerData", new PropertyPage())
}
