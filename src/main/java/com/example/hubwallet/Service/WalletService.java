package com.example.hubwallet.Service;

import com.example.hubwallet.Model.Wallet;

import java.util.List;
import java.util.Optional;

public interface WalletService {

    public List<Wallet> getAllWallets();

    public Optional<Wallet> getWalletById(Long id);
}
