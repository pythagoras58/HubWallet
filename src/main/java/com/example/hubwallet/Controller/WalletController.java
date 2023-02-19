package com.example.hubwallet.Controller;


import com.example.hubwallet.ServiceImp.IWalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/wallets")
@RequiredArgsConstructor
public class WalletController {

    private final IWalletService _service;


    @GetMapping("/findAll")
    public ResponseEntity<?> fetchAllWallets(){
        var res = _service.getAllWallets();

        return ResponseEntity.ok(res);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findWalletById(@PathVariable Long id){

        var res = _service.getWalletById(id);

        return ResponseEntity.ok(res);
    }
}
