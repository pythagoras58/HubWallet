package com.example.hubwallet.ServiceImp;

import com.example.hubwallet.Model.Wallet;
import com.example.hubwallet.Repository.IWalletRepo;
import com.example.hubwallet.Service.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class IWalletService implements WalletService {

    private final IWalletRepo _repository;

    @Override
    public List<Wallet> getAllWallets() {
        var walletList = _repository.findAll();

        return walletList;
    }

    @Override
    public Optional<Wallet> getWalletById(Long id) {
        if(id == null){
            log.info("[ID is Required]");
        }

        var walletRes = _repository.findById(id);
        return walletRes;
    }
}
