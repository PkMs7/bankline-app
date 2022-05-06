package me.dio.bankline_app.data

import androidx.lifecycle.liveData
import me.dio.bankline_app.data.remote.BanklineApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BanklineRepository {


    private val TAG = javaClass.simpleName

    private val restApi  by lazy{
        Retrofit.Builder()
        .baseUrl("http://localshost:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BanklineApi::class.java)

        fun findBankStatement(accountHolderId: Int) = liveData{
            emit(State.Wait)
            try {

            } catch (e: Exception) {

            }
        }
    }
}