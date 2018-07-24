package com.ochiengolanga.tuts.bootstandalonescala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootstandaloneScalaApplication {
}

object BootstandaloneScalaApplication {
  def main(args : Array[String]): Unit = SpringApplication.run(classOf[BootstandaloneScalaApplication], args: _*)
}
