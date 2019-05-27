package ru.xpendence.kotlincrudexample.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.xpendence.kotlincrudexample.entity.User
import ru.xpendence.kotlincrudexample.service.UserService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 5/27/19
 * Time: 5:17 PM
 * e-mail: v.chernyshov@pflb.ru
 */
@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @PostMapping
    fun create(@RequestBody user: User): ResponseEntity<User> = ResponseEntity.ok(userService.create(user))

    @PutMapping
    fun update(@RequestBody user: User): ResponseEntity<User> = ResponseEntity.ok(userService.update(user))

    @GetMapping
    fun get(@RequestParam id: Long): ResponseEntity<User> = ResponseEntity.ok(userService.get(id))

    @GetMapping("/all")
    fun getAll(): ResponseEntity<List<User>> = ResponseEntity.ok(userService.getAll())

    @DeleteMapping
    fun delete(@RequestParam id: Long) = ResponseEntity.ok()
}