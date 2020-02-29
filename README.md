The application makes use of the following technologies:

* MVI (Model-View-Intent) design pattern (Similar to MVVM).
* Repository pattern to ensure separation of concerns.
* Kotlin Coroutines for network calls off the main thread.
* Dagger 2 for Dependency Injection.
* MQTT publish-subscribe network protocol, syncing all logged in users' views.
* SQLite database using Room.
* Navigation using Android Jetpack Navigation Graph.

The application is used as a tool for the user to control a minature smart-house controlled by an Arduino.

Using the MQTT protocol, it ensures that any number of devices connected to the same broker will be given a live update of the latest state of the house, while also allowing them to update the state themselves by using sliders, buttons etc.
