package `in`.co.visiontek.userfetch_coroutines_retrofit.data.repository

import `in`.co.visiontek.userfetch_coroutines_retrofit.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}
