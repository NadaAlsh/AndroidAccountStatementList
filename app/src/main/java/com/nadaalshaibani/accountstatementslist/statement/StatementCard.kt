package com.nadaalshaibani.accountstatementslist.statement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nadaalshaibani.accountstatementslist.ui.theme.AccountStatementsListTheme


@Composable
fun StatementCard(
    transactionType: String,
    accountName: String,
    amount: Double,
    balance: Double,
    date: String,
    modifier: Modifier = Modifier,

) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp),
            colors = CardDefaults.cardColors(containerColor =
            MaterialTheme.colorScheme.primaryContainer
            )
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column {
                Text(text = "$accountName Account ")
                Text(text = "$date")
            }
            Text(text = "$transactionType")

            Column {
                Text(text = "$amount KWD")
                Text(text = "$balance KWD")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatementCardPreview() {
    AccountStatementsListTheme {
        StatementCard(
            transactionType = "Deposit",
            accountName = "Saving",
            amount = 15.0,
            balance = 30.5,
            date = "1/23"
        )
    }
}
