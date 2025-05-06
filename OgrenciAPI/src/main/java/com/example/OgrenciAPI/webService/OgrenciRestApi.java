package com.example.OgrenciAPI.webService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {

    private static final List<String> OGRENCILER = new ArrayList<>();
    {
        OGRENCILER.add("Jane");
        OGRENCILER.add("Joe");
    }

    @GetMapping("/ad/listele")
    public List<String> listele() {
        return OGRENCILER;
    }

}