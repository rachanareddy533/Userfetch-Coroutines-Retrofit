package `in`.co.visiontek.userfetch_coroutines_retrofit.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import `in`.co.visiontek.userfetch_coroutines_retrofit.data.api.ApiHelper
import `in`.co.visiontek.userfetch_coroutines_retrofit.data.repository.MainRepository
import `in`.co.visiontek.userfetch_coroutines_retrofit.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            val repository = MainRepository(apiHelper) // ✅ FIX
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}
