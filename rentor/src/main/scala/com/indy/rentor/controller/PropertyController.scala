package com.indy.rentor.controller

import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestParam, PathVariable, ModelAttribute, RequestMapping}
import org.springframework.web.bind.annotation.RequestMethod._
import org.springframework.web.servlet.ModelAndView
import scala.beans.BeanProperty
import javax.validation.constraints.NotNull
import org.hibernate.validator.constraints.NotEmpty
import org.joda.time.DateTime
import com.indy.rentor.repository.PropertyDAO
import com.indy.rentor.data.{Customer, Property}
import javax.validation.Valid
import org.springframework.validation.BindingResult

@Controller
class PropertyController {

    import ControllerTools._

    @Autowired
    var propertyDAO: PropertyDAO = _

    @RequestMapping(value = Array("/property/new"), method = Array(GET))
    def showNewPropertyForm() = new ModelAndView("property/property-new", "propertyData", new PropertyPageData())

    @RequestMapping(value = Array("/property/new"), method = Array(POST))
    def createNewProperty(   @Valid @ModelAttribute("propertyData") propertyData: PropertyPageData, bindingResult: BindingResult): String = {
        if (bindingResult.hasErrors) {
            "property/property-new"
        }
        else {
            val newProperty = new Property
            propertyData.copyTo(newProperty)
            "redirect:/properties/" + propertyDAO.save(newProperty) + ".html"
        }
    }

    @RequestMapping(value = Array("/properties/{propertyId}"), method = Array(GET))
    def viewProperty(@PathVariable propertyId: Long, @RequestParam(required = false) edit: String) = {
        val property : Property = propertyDAO.get(propertyId)
        if (edit == null) {
            new ModelAndView("property/property-view", "property", property)
        }
        else {
            new ModelAndView("property/property-edit", Map("property" -> property, "propertyData" -> PropertyPageData(property)))
        }
    }

}


class PropertyPageData {
    @BeanProperty
    @NotNull
    @NotEmpty
    var name: String = _

    @BeanProperty
    var tenant_name : String = _

    @BeanProperty
    var rent_start_date : DateTime = _

    @BeanProperty
    var rent_charge: BigDecimal = _

    @BeanProperty
    var address : String = _

    @BeanProperty
    var area_code : String = _


    override def toString = "[PropertyPageData: name = " + name + ", tenant_name = "+ tenant_name +", "   + "]"

    def copyTo(property: Property): Unit = {
        property.name = name
        property.tenant_name = tenant_name
        property.rent_start_date = rent_start_date
        property.rent_charge = rent_charge
        property.address = address
        property.area_code = area_code
    }

    def copyFrom(property: Property): Unit = {
        name = property.name
        tenant_name = property.tenant_name
        rent_start_date = property.rent_start_date
        rent_charge = property.rent_charge
        address = property.address
        area_code = property.area_code
    }
}

object PropertyPageData {
    def apply(property: Property): PropertyPageData = {
        val data = new PropertyPageData
        data.copyFrom(property)
        data
    }
}
