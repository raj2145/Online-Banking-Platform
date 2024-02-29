package com.opq.controller;

import com.opq.view.BankView;
import com.oqp.model.Bank;

public class BankController {
    public static void main(String[] args) {
        Bank model = new Bank(0.0);
        BankView view = new BankView(model);
        view.run();
    }
}