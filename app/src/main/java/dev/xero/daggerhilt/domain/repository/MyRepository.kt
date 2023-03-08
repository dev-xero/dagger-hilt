package dev.xero.daggerhilt.domain.repository

interface MyRepository {
	suspend fun networkCall()
}