package com.thoughtworks.capability.gtb.controller;

import com.thoughtworks.capability.gtb.vo.PersonVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @GetMapping("/persons/{id}")
  public PersonVo getPerson(@PathVariable("id") String id) {
    return new PersonVo(id, null, "张三", "打篮球");
  }
}
