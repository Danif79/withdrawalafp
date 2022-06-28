package com.bootcamp20.withdrawalafp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WithdrawalafpMapper {

    com.bootcamp20.withdrawalafp.domain.Withdrawalafp withdrawalafpModelToWithdrawalafp (com.bootcamp20.withdrawalafp.model.WithdrawalafpModel model);

    com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpToWithdrawalafpModel (com.bootcamp20.withdrawalafp.domain.Withdrawalafp client);

    List<com.bootcamp20.withdrawalafp.model.WithdrawalafpModel> withdrawalafpsToWithdrawalafpModels(List<com.bootcamp20.withdrawalafp.domain.Withdrawalafp> clients);

    void update(@MappingTarget com.bootcamp20.withdrawalafp.domain.Withdrawalafp entity, com.bootcamp20.withdrawalafp.model.WithdrawalafpModel updateEntity);
}
