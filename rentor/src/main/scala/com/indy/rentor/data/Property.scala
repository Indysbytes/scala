package com.indy.rentor.data

import scala.beans.BeanProperty
import javax.persistence.Entity
import org.joda.time.DateTime


@Entity
class Property extends AbstractEntity{

    @BeanProperty
    var name : String = _

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



    override def toString: String = "[Customer: id = " + id + ", name = " + name + "]"
}
