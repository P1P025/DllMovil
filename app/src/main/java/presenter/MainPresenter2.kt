package com.example.rappi_u.ui.main

class MainPresenter2(private val view: MainView2) {

    fun onImageButtonClick() {
        view.navigateToMainActivity()
    }

    fun onImageButton2Click() {
        view.navigateToMainActivity3()
    }
}
