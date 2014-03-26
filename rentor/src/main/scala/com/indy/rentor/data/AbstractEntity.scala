package com.indy.rentor.data

import javax.persistence.{GenerationType, MappedSuperclass, GeneratedValue, Id}

@MappedSuperclass
abstract class AbstractEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _

  def getId: Long = id
}
