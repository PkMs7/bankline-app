package me.dio.bankline_app.ui.wellcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.bankline_app.R
import me.dio.bankline_app.databinding.ActivityWellcomeBinding
import me.dio.bankline_app.domain.Correntista
import me.dio.bankline_app.ui.statement.BankStatementActivity

class WellcomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityWellcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener {
            val accountHolderId = binding.etAccountHolderId.text.toString().toInt()
            val accontHolder = Correntista(accountHolderId)

            val intent = Intent(this, BankStatementActivity::class.java).apply {
               putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accontHolder)
            }
            startActivity(intent)
        }
    }
}