package org.sujix.pdfx.pdfutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PDFController {
    
    @GetMapping
    public void check(){
        
    }

}
