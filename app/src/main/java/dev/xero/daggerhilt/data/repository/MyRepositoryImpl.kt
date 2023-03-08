package dev.xero.daggerhilt.data.repository

import android.app.Application
import dev.xero.daggerhilt.R
import dev.xero.daggerhilt.data.remote.TestAPI
import dev.xero.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor (
	private val api: TestAPI,
	private val appContext: Application
) : MyRepository {
	init {
		val appName = appContext.getString(R.string.app_name)
		println("Hello, the app name is: $appName")
	}

	override suspend fun networkCall() {

	}
}