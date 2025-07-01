package `in`.co.visiontek.userfetch_coroutines_retrofit.data.api


class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}