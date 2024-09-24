package com.example.rappi_u.ui.main

class PayPresenter(private val view: PayView) {

    fun onButtonClick() {
        view.navigateToMainActivity()
    }
}
