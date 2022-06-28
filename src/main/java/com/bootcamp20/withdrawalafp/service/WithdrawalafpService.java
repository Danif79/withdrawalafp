package com.bootcamp20.withdrawalafp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WithdrawalafpService implements IWithdrawalafpService{

    private final com.bootcamp20.withdrawalafp.repository.WithdrawalafpRepository withdrawalafpRepository;

    private final com.bootcamp20.withdrawalafp.mapper.WithdrawalafpMapper withdrawalafpMapper;

    @Override
    public List<com.bootcamp20.withdrawalafp.model.WithdrawalafpModel> findAll() throws Exception {
        List<com.bootcamp20.withdrawalafp.domain.Withdrawalafp> withdrawalafps = withdrawalafpRepository.findAll();
        return withdrawalafpMapper.withdrawalafpsToWithdrawalafpModels(withdrawalafps);
    }

    @Override
    public com.bootcamp20.withdrawalafp.model.WithdrawalafpModel create(com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception {
        com.bootcamp20.withdrawalafp.domain.Withdrawalafp withdrawalafp = withdrawalafpRepository.save(withdrawalafpMapper.withdrawalafpModelToWithdrawalafp(withdrawalafpModel));
        return withdrawalafpMapper.withdrawalafpToWithdrawalafpModel(withdrawalafp);
    }

    @Override
    public void update(Long id, com.bootcamp20.withdrawalafp.model.WithdrawalafpModel withdrawalafpModel) throws Exception {
        Optional<com.bootcamp20.withdrawalafp.domain.Withdrawalafp> withdrawalafpOptional = withdrawalafpRepository.findById(id);

        if(withdrawalafpOptional.isPresent()) {
            com.bootcamp20.withdrawalafp.domain.Withdrawalafp withdrawalafpToUpdate = withdrawalafpOptional.get();
            withdrawalafpMapper.update(withdrawalafpToUpdate, withdrawalafpModel);
            withdrawalafpRepository.save(withdrawalafpToUpdate);
        }
        else throw new Exception("No se encontraron datos");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        withdrawalafpRepository.deleteById(id);
    }
}
