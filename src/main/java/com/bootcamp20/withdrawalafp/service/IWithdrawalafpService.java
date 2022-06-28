package com.bootcamp20.withdrawalafp.service;

import java.util.List;

public interface IWithdrawalafpService {

    List<com.bootcamp20.withdrawalafp.model.WithdrawalafpModel> findAll() throws Exception;

    com.bootcamp20.withdrawalafp.model.WithdrawalafpModel create(com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception;

    void update(Long id, com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception;

    void deleteById(Long id) throws Exception;
}
