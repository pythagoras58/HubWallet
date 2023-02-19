package com.example.hubwallet.Repository;

import com.example.hubwallet.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWalletRepo extends JpaRepository<Wallet, Long> {
}
