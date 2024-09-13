package com.example.rappi_u.ui.main

interface MainView {
    val adapter: MainAdapter
    abstract var recyclerView: Any

    fun navigateToActivity2()
    fun navigateToActivity3()
    fun navigateToRegisterActivity()
    fun showMessage(message: String)
    fun showItems(items: List<Item>)
}