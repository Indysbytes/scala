package com.indy.rentor.data

import scala.beans.BeanProperty
import javax.persistence.Entity
import org.joda.time.DateTime


@Entity
class Property extends AbstractEntity {

    @BeanProperty
    var name : String

    @BeanProperty
    var tenant_name : String

    @BeanProperty
    var rent_start_date : DateTime

    @BeanProperty
    var rent_charge: BigDecimal

    @BeanProperty
    var address : String

    @BeanProperty
    var area_code : String

    override def toString: String = "[Customer: id = " + id + ", name = " + name + "]"
}
