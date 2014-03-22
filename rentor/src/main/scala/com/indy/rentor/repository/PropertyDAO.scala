package com.indy.rentor.repository

import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.hibernate.SessionFactory
import com.indy.rentor.data.Property

trait PropertyDAO {
    def getAll: java.util.List[Property]
    def save(property: Property): Long
    def update(property: Property)
    def get(propertyId: Long): Property
    def delete(propertyId: Long)
}

@Repository
class PropertyDAOImpl extends PropertyDAO {
    @Autowired
    var sessionFactory: SessionFactory = null

    @Transactional
    def save(property: Property): Long = Long.unbox(getCurrentSession.save(property).asInstanceOf[Object])

    @Transactional
    def update(property: Property): Unit = getCurrentSession.saveOrUpdate(property)

    @Transactional
    def delete(propertyId: Long): Unit = getCurrentSession.delete(get(propertyId))

    @Transactional(readOnly = true)
    def get(propertyId: Long): Property = getCurrentSession.get(classOf[Property], Long.box(propertyId)).asInstanceOf[Property]

    @Transactional(readOnly = true)
    def getAll: java.util.List[Property] = getCurrentSession.createCriteria(classOf[Property]).list().asInstanceOf[java.util.List[Property]]

    def setSessionFactory(sessionFactory: SessionFactory): Unit = {
        this.sessionFactory = sessionFactory
    }

    def getCurrentSession = sessionFactory.getCurrentSession
}
