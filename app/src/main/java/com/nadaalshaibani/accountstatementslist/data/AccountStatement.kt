package com.nadaalshaibani.accountstatementslist.data

data class AccountStatement(
    val transactionType: String,
    val accountName: String,
    val amount: Double,
    val balance: Double,
    val date: String

)
