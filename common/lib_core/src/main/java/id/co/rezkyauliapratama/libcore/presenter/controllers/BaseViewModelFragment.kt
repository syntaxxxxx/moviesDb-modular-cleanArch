package id.co.rezkyauliapratama.libcore.presenter.controllers

import android.os.Bundle
import id.co.rezkyauliapratama.libcore.presenter.common.BaseViewMvcFactory
import id.co.rezkyauliapratama.libcore.presenter.viewmodels.BaseViewModel
import id.co.rezkyauliapratama.libcore.presenter.views.ViewMvc


abstract class BaseViewModelFragment<
        MVCFACTORY : BaseViewMvcFactory,
        VIEWMODEL : BaseViewModel,
        CONTROLLER : BaseViewModelController<VIEWMVC, VIEWMODEL>,
        VIEWMVC : ViewMvc
        >
    : BaseFragment<MVCFACTORY, CONTROLLER, VIEWMVC>() {

    protected val viewModel by lazy { buildViewModel() }

    protected abstract fun buildViewModel(): VIEWMODEL

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mController.onCreated()
    }

    override fun onStart() {
        super.onStart()
        mController.onStart()
    }

    override fun onStop() {
        super.onStop()
        mController.onStop()
    }

    override fun onDetach() {
        super.onDetach()
        mController.onDestroyed()
    }
}