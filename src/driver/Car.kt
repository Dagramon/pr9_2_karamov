package driver

class Car(name : String, age : Int, experience : Int, car : String, isWorking : String, var status : String) : Driver(name, age, experience, car, isWorking)
{
    override fun Info()
    {
        println("Машина ${car}\nСтатус ${status}")
    }
    fun Break()
    {
        println("Автомобиль сломался")
        status = "Сломан"
    }
}