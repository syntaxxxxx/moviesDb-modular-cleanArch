package id.co.rezkyauliapratama.lib_uicomponent.presenter.common

import androidx.lifecycle.Observer

class SafeObserver<T>(private val notifier: (T) -> Unit) : Observer<T> {
    override fun onChanged(t: T?) {
        t?.let { notifier(t) }
    }
}