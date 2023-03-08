package dev.xero.daggerhilt.core.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.xero.daggerhilt.data.remote.TestAPI
import dev.xero.daggerhilt.data.repository.MyRepositoryImpl
import dev.xero.daggerhilt.domain.repository.MyRepository
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)  // provide the dependencies during the app's lifetime
object AppModule {

	// a dependency that dagger hilt can provide
	@Provides
	@Singleton // scope annotation
	fun providesTestAPI(): TestAPI {
		return Retrofit.Builder()
			.baseUrl("https://test.api.com/")
			.build()
			.create(TestAPI::class.java)
	}
}