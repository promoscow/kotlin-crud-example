package ru.xpendence.kotlincrudexample.entity

import java.time.LocalDateTime
import javax.persistence.*

/**
 * Author: Vyacheslav Chernyshov
 * Date: 5/27/19
 * Time: 4:57 PM
 * e-mail: v.chernyshov@pflb.ru
 */
@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue
        override var id: Long?,

        @Column(name = "created", updatable = false)
        override var created: LocalDateTime?,

        @Column(name = "name")
        var name: String
) : AbstractEntity() {

    @PrePersist
    fun onCreate() {
        this.created = LocalDateTime.now()
    }
}