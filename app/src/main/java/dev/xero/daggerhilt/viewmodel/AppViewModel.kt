package dev.xero.daggerhilt.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.xero.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor (
	private val repository: MyRepository
) : ViewModel() {

}