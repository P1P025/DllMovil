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

    fun loadItems() {

        val items = listOf(
                Item("Manzana", "Fresca"),
                Item("Pera", "Fresca"),
                Item("Banano", "Fresca")
        )
        view.showItems(items)
    }
}
