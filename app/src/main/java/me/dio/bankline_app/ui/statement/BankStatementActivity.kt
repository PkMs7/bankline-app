package me.dio.bankline_app.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import me.dio.bankline_app.databinding.ActivityBankStatementBinding
import me.dio.bankline_app.domain.Correntista
import java.lang.IllegalArgumentException


class BankStatementActivity : AppCompatActivity() {

    companion object{
       const val EXTRA_ACCOUNT_HOLDER = "package me.dio.bankline_app.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    private val viewModel by viewModels<BankStatementViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()
    }
    private fun findBankStatement(){
        viewModel.findBankStatement(accountHolder.id).observe(this){ state -> when(state)
        {
            
        }
    }
}
