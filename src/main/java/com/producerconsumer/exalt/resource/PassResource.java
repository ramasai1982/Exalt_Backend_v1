package com.producerconsumer.exalt.resource;

import com.producerconsumer.exalt.BatchPassGenerator;
import com.producerconsumer.exalt.Pass;
import com.producerconsumer.exalt.PassIn;
import com.producerconsumer.exalt.SinglePassGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PassResource {

    @Autowired
    private BatchPassGenerator batchPassGenerator;
    private final SinglePassGenerator singlePassGenerator;

    public PassResource(SinglePassGenerator singlePassGenerator) {
        this.singlePassGenerator = singlePassGenerator;
    }

    @GetMapping("batch/{numberOfPasses}/")
    public ResponseEntity<List<Pass>> generatePassBatch(@PathVariable("numberOfPasses") int numberOfPasses){

        List<Pass> passes = batchPassGenerator.generatePassBatch(numberOfPasses);
        return new ResponseEntity<>(passes, HttpStatus.CREATED);

    }

    @PostMapping("add/")
    public ResponseEntity<Pass> singlePassGeneration(@RequestBody PassIn passInput){
        Pass singlePass = singlePassGenerator.generatePass(passInput);
        return new ResponseEntity<>(singlePass, HttpStatus.CREATED);
    }

    @PostMapping("addMany/")
    public ResponseEntity<List<Pass>> singlePassGeneration(@RequestBody List<PassIn> passListInput){
        List<Pass> passes = batchPassGenerator.generatePassBatch(passListInput);
        return new ResponseEntity<>(passes, HttpStatus.CREATED);
    }


}
