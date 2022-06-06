package viewmodels

import android.widget.Button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import pojos.Actor
import pojos.ActorResponse
import pojos.SampleRetrofitBody
import repository.ListRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FragmentListViewModel(var parentViewModel:ListActivityViewModel):ViewModel() {
    private var mActors:MutableLiveData<List<Actor>> = MutableLiveData()
    fun getActors():LiveData<List<Actor>>{
        return mActors
    }

    private var isFetchingData:MutableLiveData<Boolean> = MutableLiveData()
    fun getDataFetchStatus():LiveData<Boolean>{
        return isFetchingData
    }

    private val viewModelJob = SupervisorJob()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var noResponse:MutableLiveData<String> = MutableLiveData()
    fun getNoResponse():LiveData<String>{
        viewModelScope.launch{

        }
        return noResponse
    }

    val actorsCallBack = object : Callback<ActorResponse> {
        override fun onResponse(call: Call<ActorResponse>, response: Response<ActorResponse>) {
            if(response.body() != null) {
                val actorResponse: ActorResponse = response.body() as ActorResponse
                mActors.postValue(actorResponse.actors)
            }else{
                noResponse.postValue("Not a valid response")
            }
            isFetchingData.postValue(false)
        }

        override fun onFailure(call: Call<ActorResponse>, t: Throwable) {
            noResponse.postValue("Something went wrong. Unable to fetch the response")
            isFetchingData.postValue(false)
        }
    }

    init {
        isFetchingData.postValue(true)
        callActorsApi()
    }

    private fun callActorsApi(){
        val industry = "all"
        val priority = "sandalwood"
        val token = "abcdefgh"
        val url = "/actors?industry=all&priority=sandalwood"
//        ListRepository.fetchActors(actorsCallBack, industry, priority)
//        ListRepository.fetchActorsWithHeader(actorsCallBack, token, industry, priority)
//        ListRepository.fetchActorsDynamicUrl(actorsCallBack, url)
//        ListRepository.fetchActorsDynamicUrlWithHeader(actorsCallBack, token ,url)
        ListRepository.fetchActorsWithHeaderPost(actorsCallBack, token , SampleRetrofitBody("Rajkumar", 77, "Sandalwood"))
    }

    fun addActor() {
        var actors:MutableList<Actor> = mActors.value!!.toMutableList()
        actors.add(Actor("Soma", "Sunil Kumar", 33, "Harihar", "May 11, 1988",
            "https://media-exp1.licdn.com/dms/image/C5603AQGgHlFMgBhMGA/profile-displayphoto-shrink_800_800/0/1627566028598?e=1658966400&v=beta&t=JkEev4OPDK2JbTKkGm00AfogDHxM_h_XuMKDaDgaHVE",
             "Sandalwood"))
        mActors.postValue(actors)
    }

    fun onItemClicked(position:Int, actor: Actor){
      parentViewModel.onItemClicked(actor)
    }
}