package com.nadaalshaibani.accountstatementslist.repo

import com.nadaalshaibani.accountstatementslist.data.AccountStatement
import com.nadaalshaibani.accountstatementslist.statement.StatementCard

class Repo {
    companion object {

        var dummyAccountStatement = listOf(
            AccountStatement(
                transactionType = "Deposit",
                accountName = "AlNada",
                amount = 10.0,
                balance = 600.5,
                date = "1/23"
            ),
            AccountStatement(
                transactionType = "Withdrawal",
                accountName = "AlFatma",
                amount = 20.0,
                balance = 1000.5,
                date = "1/23"
            )

        )
    }

}