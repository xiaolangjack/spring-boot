package com.jack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By: yy
 * Created At: 2022/5/6 17:35
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

@RestController
@RequestMapping("/redis")
public class RedisTestController {

	@GetMapping("/get/{key}")
	public Map<String, Object> get(@PathVariable(required = false) String key) {
		HashMap<String, Object> data = new HashMap<>();
		data.put("data", key);
		data.put("code", HttpStatus.OK.value());
		data.put("msg", "success");
		return data;
	}

	@GetMapping("/set/{key}/{value}")
	public Map<String, Object> set(@PathVariable(required = false) String key, @PathVariable(required = false) String value) {
		HashMap<String, Object> data = new HashMap<>();
		data.put("data", true);
		data.put("code", HttpStatus.OK.value());
		data.put("msg", "success");
		return data;
	}
}
