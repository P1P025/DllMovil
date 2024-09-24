package com.example.rappi_u.ui.main

class Shopping_CartPresenter(private val view: Shopping_CartView) {

    fun onImageButtonClick() {
        view.navigateToMainActivity()
    }

    fun onImageButton2Click() {
        view.navigateToMainActivity3()
    }
}
