package com.example.rappi_u.ui.main

class HomePresenter(private val view: HomeView) {

    fun onImageButton1Click() {
        view.navigateToActivity2()
    }

    fun onImageButton2Click() {
        view.navigateToActivity3()
    }

    fun onRegisterButtonClick() {
        view.navigateToRegisterActivity()
    }

    fun onSearchFocus() {
        view.navigateToSearch()
    }

}
