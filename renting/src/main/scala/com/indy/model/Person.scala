package main.scala.com.indy.model

import scala.beans.BeanProperty

class Person(@BeanProperty id: Int,
             @BeanProperty name: String,
             @BeanProperty phone: String) {

}
