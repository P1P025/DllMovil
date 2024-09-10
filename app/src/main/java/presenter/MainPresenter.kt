package com.example.rappi_u.ui.main

class MainPresenter(private val view: MainView) {

    fun onImageButton1Click() {
        view.navigateToActivity2()
    }

    fun onImageButton2Click() {
        view.navigateToActivity3()
    }

    fun onRegisterButtonClick() {
        view.navigateToRegisterActivity()
    }
}
