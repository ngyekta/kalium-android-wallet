package com.banano.kaliumwallet.network.model.response;

import com.banano.kaliumwallet.network.model.BaseResponse;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class AccountsBalancesResponse extends BaseResponse {
    @SerializedName("balances")
    private HashMap<String, AccountBalanceItem> balances;

    public AccountsBalancesResponse() {
    }

    public HashMap<String, AccountBalanceItem> getBalances() {
        return balances;
    }

    public void setBlocks(HashMap<String, AccountBalanceItem> balances) {
        this.balances = balances;
    }
}
