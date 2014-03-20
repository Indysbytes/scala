package com.indy.service

import com.indy.model.Person

trait PersonService {
  def findById(id: Int): Option[Person]
}
