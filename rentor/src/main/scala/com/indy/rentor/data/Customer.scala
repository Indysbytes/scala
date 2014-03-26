package com.indy.rentor.data

import beans.BeanProperty
import javax.persistence.{Table, Entity}

@Entity
@Table(name = "customer", schema = "rentor")
class Customer extends AbstractEntity {

  @BeanProperty
  var name: String = _
  
  override def toString = "[Customer: id = " + id + ", name = " + name + "]"
}
