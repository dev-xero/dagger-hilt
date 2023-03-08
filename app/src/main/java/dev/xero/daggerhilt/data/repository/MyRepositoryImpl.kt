package dev.xero.daggerhilt.data.repository

import android.app.Application
import dev.xero.daggerhilt.data.remote.TestAPI
import dev.xero.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
	private val api: TestAPI,
	private val appContext: Application
) : MyRepository {
	override suspend fun networkCall() {

	}
}