package com.bootcamp20.withdrawalafp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class WithdrawalafpController {
    private final com.bootcamp20.withdrawalafp.service.IWithdrawalafpService withdrawalafpService;

    @GetMapping(path = { "withdrawalafp" }, produces = { "application/json" })
    public ResponseEntity<Object> getAll() throws Exception {
        List<com.bootcamp20.withdrawalafp.model.WithdrawalafpModel> response =  withdrawalafpService.findAll();
        log.info("getAll" + "OK");
        log.debug(response.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "client")
    public ResponseEntity<Object> create(@RequestBody com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception {
        com.bootcamp20.withdrawalafp.model.WithdrawalafpModel response = withdrawalafpService.create(withdrawalafpModel);
        log.info("create" + "OK");
        log.debug(withdrawalafpModel.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping(path = { "withdrawalafp/{id}" }, produces = { "application/json" })
    public void update(
            @PathVariable("id") Long id,
            @RequestBody com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception {
        withdrawalafpService.update(id, withdrawalafpModel);
        log.info("update" + "OK");
        log.debug(id.toString()+ "/" + withdrawalafpModel.toString());
    }


    @DeleteMapping({ "client/{id}" })
    public void deleteById(@PathVariable("id") Long id) throws Exception {
        withdrawalafpService.deleteById(id);
        log.info("deleteById" + "OK");
        log.debug(id.toString());
    }
}
