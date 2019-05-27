package ru.xpendence.kotlincrudexample.service

import org.springframework.stereotype.Service
import ru.xpendence.kotlincrudexample.entity.User
import ru.xpendence.kotlincrudexample.repository.UserRepository

/**
 * Author: Vyacheslav Chernyshov
 * Date: 5/27/19
 * Time: 5:07 PM
 * e-mail: v.chernyshov@pflb.ru
 */
interface UserService {
    fun create(user: User): User
    fun update(user: User): User
    fun get(id: Long): User
    fun getAll(): List<User>
    fun delete(id: Long)
}

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun create(user: User): User = userRepository.save(user)

    override fun update(user: User): User = userRepository.save(user)

    override fun get(id: Long): User = userRepository.getOne(id)

    override fun getAll(): List<User> = userRepository.findAll()

    override fun delete(id: Long) = userRepository.deleteById(id)
}