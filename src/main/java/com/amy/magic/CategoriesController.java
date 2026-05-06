package com.amy.magic;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @GetMapping
    public List<String> getCategories() {
        return List.of("classic", "coding", "artist");
}
}