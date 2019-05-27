package ru.xpendence.kotlincrudexample.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.xpendence.kotlincrudexample.entity.User

/**
 * Author: Vyacheslav Chernyshov
 * Date: 5/27/19
 * Time: 5:05 PM
 * e-mail: v.chernyshov@pflb.ru
 */
@Repository
interface UserRepository : JpaRepository<User, Long>