package dev.xero.daggerhilt.data.remote

import retrofit2.http.GET

interface TestAPI {

	@GET("test")
	suspend fun networkCall()
}