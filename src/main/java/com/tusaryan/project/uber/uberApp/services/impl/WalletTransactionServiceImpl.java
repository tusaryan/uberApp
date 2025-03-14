package com.tusaryan.project.uber.uberApp.services.impl;

import com.tusaryan.project.uber.uberApp.entities.WalletTransaction;
import com.tusaryan.project.uber.uberApp.repositories.WalletTransactionRepository;
import com.tusaryan.project.uber.uberApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
