package com.indy.service

import org.springframework.stereotype.Component
import com.indy.model.Person

/**
 * a fake example service which just does people lookups. in real life you'd get
 * this to talk to a data store of some kind
 */
@Component
class PersonServiceImpl extends PersonService {

  private val knownPeople = Map(
    3 -> Person(3, "Indy", "555-123-1234"),
    4 -> Person(4, "Reddy", "555-321-4321")
  )

  override def findById(id: Int) = {
    knownPeople get id
  }

}
