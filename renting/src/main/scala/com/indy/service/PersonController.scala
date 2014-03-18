package main.scala.com.indy.service

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ResponseBody, RequestMapping}


@Controller
class PersonController {

    @RequestMapping(Array("/hello"))
    @ResponseBody
    def hello = { "Hello from the controller"}

}
