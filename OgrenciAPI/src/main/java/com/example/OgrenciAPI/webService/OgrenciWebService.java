package com.example.OgrenciAPI.webService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebService {

    public record Ogrenci(String adSoyad, String numara) {};

    private static List<Ogrenci> ogrenciler = new ArrayList<>();
    static {
        ogrenciler.add(new Ogrenci("Ali", "100000000001"));
        ogrenciler.add(new Ogrenci("Ayse", "100000000002"));
        ogrenciler.add(new Ogrenci("Fatma", "100000000003"));
    }

    @GetMapping("/listele")
    public List<Ogrenci> listele() {
        return ogrenciler;
    }

    @PostMapping("/ekle")
    public Ogrenci ekle(@RequestBody Ogrenci yeniOgrenci) {
        ogrenciler.add(yeniOgrenci);
        return yeniOgrenci;
    }

}