package com.carlos.hamburgeria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HamburgeriaApplication

fun main(args: Array<String>) {
	runApplication<HamburgeriaApplication>(*args)
}
