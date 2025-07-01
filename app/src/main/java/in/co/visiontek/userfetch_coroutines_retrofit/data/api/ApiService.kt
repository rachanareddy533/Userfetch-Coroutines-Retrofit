package `in`.co.visiontek.userfetch_coroutines_retrofit.data.api

import `in`.co.visiontek.userfetch_coroutines_retrofit.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}