package me.dio.bankline_app.data.remote

import me.dio.bankline_app.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accontHolderId: Int): List<Movimentacao>
}