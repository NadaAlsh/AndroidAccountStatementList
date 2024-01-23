@file:OptIn(ExperimentalMaterial3Api::class)

package com.nadaalshaibani.accountstatementslist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nadaalshaibani.accountstatementslist.data.AccountStatement
import com.nadaalshaibani.accountstatementslist.repo.Repo
import com.nadaalshaibani.accountstatementslist.statement.StatementCard
import com.nadaalshaibani.accountstatementslist.ui.theme.AccountStatementsListTheme

class MainActivity : ComponentActivity() {
    var statementList = Repo.dummyAccountStatement
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountStatementsListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(title = { Text(text = "Bank Statement") })
                        }
                        
               ) {
                       StatementListScreen(modifier = Modifier.padding(it),
                            statementList = statementList)
                   }
                }
            }
        }
    }
}

@Composable
fun StatementListScreen(statementList: List<AccountStatement>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier)
    {
        items(statementList){
            StatementCard( accountName = it.accountName, transactionType = it.transactionType,
            amount = it.amount, balance = it.balance, date = it.date)

        }
}}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccountStatementsListTheme {

    }
}