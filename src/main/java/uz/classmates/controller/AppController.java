package uz.classmates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.classmates.dto.AppDTO;
import uz.classmates.entity.AppEntity;
import uz.classmates.service.AppService;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private final  AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @RequestMapping("/create")
    public ResponseEntity<?> create(@RequestBody AppDTO dto){
        service.create(dto);
        return ResponseEntity.ok("Created!");
    }


}