package com.butchjgo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class Upload {
    @Value("${upload.dir}")
    private String uploadDir;

    @GetMapping
    String doGet() {
        return "upload";
    }

    @PostMapping(value = "upload")
    @ResponseBody
    String doPost(@RequestParam(value = "file") MultipartFile file) {

        try {

            byte[] data = file.getBytes();

            File serverFile = new File(String.format("%s/%s", uploadDir, file.getOriginalFilename()));

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(serverFile));

            outputStream.write(data);

            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return String.format("%s uploaded",file.getOriginalFilename());
        }

    }
}
