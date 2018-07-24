package com.ochiengolanga.tuts.bootstandalonescala.web

import org.springframework.util.StringUtils
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/hello"))
class HelloWorldController {

  @GetMapping
  def greeting(@RequestParam(name = "name", required = false) name: String) : String =
    if(StringUtils.isEmpty(name)) "Hello, Stranger" else s"Hello, $name"

}
