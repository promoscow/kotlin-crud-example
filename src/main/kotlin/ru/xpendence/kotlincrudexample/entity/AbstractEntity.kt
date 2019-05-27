package ru.xpendence.kotlincrudexample.entity

import java.time.LocalDateTime

/**
 * Author: Vyacheslav Chernyshov
 * Date: 5/27/19
 * Time: 4:53 PM
 * e-mail: v.chernyshov@pflb.ru
 */
abstract class AbstractEntity {

    abstract var id: Long?
    abstract var created: LocalDateTime?
}