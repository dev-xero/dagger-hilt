package dev.xero.daggerhilt.data.repository

import dev.xero.daggerhilt.data.remote.TestAPI
import dev.xero.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
	private val api: TestAPI
) : MyRepository {
	override suspend fun networkCall() {

	}
}