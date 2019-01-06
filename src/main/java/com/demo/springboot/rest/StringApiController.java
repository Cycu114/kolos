package com.demo.springboot.rest;


import com.demo.springboot.domain.dto.Count;
import com.demo.springboot.domain.dto.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StringApiController {


    @RequestMapping(value="/text/reverse", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map<String, String>> reverse(@RequestParam (value = "text", required = false) String text) {
        Map<String, String> serverTestMessage = new HashMap<>();
        String reverse = new StringBuilder(text).reverse().toString();
        serverTestMessage.put("reverse", reverse);
        return new ResponseEntity<>(serverTestMessage, HttpStatus.OK);
    }


    @RequestMapping(value="/text/length", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map<String, String>> count(@RequestParam (value = "text", required = false)String text, @RequestParam (value = "character", required = false) Character character){
        Map<String, String> serverTestMessage = new HashMap<>();

        serverTestMessage.put("length", String.valueOf(Count.countLength(text,character)));
        return new ResponseEntity<>(serverTestMessage, HttpStatus.OK);
    }

    @RequestMapping(value="/math/sort/{numbers}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map<String, String>> sort(@PathVariable ("numbers") String numbers){
        Map<String, String> serverTestMessage = new HashMap<>();

        serverTestMessage.put("sort", Sort.sort(numbers));
        return new ResponseEntity<>(serverTestMessage, HttpStatus.OK);
    }

}
