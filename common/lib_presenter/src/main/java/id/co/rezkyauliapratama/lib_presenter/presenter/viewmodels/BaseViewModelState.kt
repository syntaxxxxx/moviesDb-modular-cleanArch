package id.co.rezkyauliapratama.lib_presenter.presenter.viewmodels

import androidx.lifecycle.MediatorLiveData

abstract class BaseViewModelState<STATE>: BaseViewModel() {
    val stateLiveData: MediatorLiveData<STATE> = MediatorLiveData()

}