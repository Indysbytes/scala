package com.indy.rentor.data

import javax.persistence.{ MappedSuperclass, GeneratedValue, Id }

@MappedSuperclass
abstract class AbstractEntity {
  @Id
  @GeneratedValue
  var id: Long = _

  def getId: Long = id
}
