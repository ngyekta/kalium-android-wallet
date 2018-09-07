package com.banano.kaliumwallet.ui.home;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;

import com.banano.kaliumwallet.network.model.response.AccountHistoryResponseItem;

import java.util.List;

public class AccountHistoryDiffCallback extends DiffUtil.Callback{

    List<AccountHistoryResponseItem> oldItems;
    List<AccountHistoryResponseItem> newItems;

    public AccountHistoryDiffCallback(List<AccountHistoryResponseItem> oldItems, List<AccountHistoryResponseItem> newItems) {
        this.newItems = newItems;
        this.oldItems = oldItems;
    }

    @Override
    public int getOldListSize() {
        return oldItems.size();
    }

    @Override
    public int getNewListSize() {
        return newItems.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldItems.get(oldItemPosition).equals(newItems.get(newItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldItems.get(oldItemPosition).getHash().equals(newItems.get(newItemPosition).getHash());
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}