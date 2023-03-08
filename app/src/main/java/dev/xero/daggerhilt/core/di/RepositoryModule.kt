package dev.xero.daggerhilt.core.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.xero.daggerhilt.data.repository.MyRepositoryImpl
import dev.xero.daggerhilt.domain.repository.MyRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

	@Binds
	@Singleton
	abstract fun bindRepository(
		repositoryImpl: MyRepositoryImpl
	): MyRepository
}