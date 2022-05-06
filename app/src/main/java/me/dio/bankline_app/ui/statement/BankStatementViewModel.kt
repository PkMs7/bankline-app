package me.dio.bankline_app.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline_app.data.BanklineRepository


class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}