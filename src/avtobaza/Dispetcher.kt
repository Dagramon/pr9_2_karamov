package avtobaza

import driver.Driver

open class Dispetcher(var name : String, var age : Int, var experience : Int, var assignedCar : String)
{
    open fun Info()
    {
        println("Диспетчер ${name} Лет ${age} Стаж ${experience}\nНазначенная машина ${assignedCar}")
    }
    fun YearPassed()
    {
        experience += 1
        age += 1
        if (age < 75) {
            println("Прошёл год")
        }
        else
        {
            println("Прошёл год, уже пора на пенсию")
        }
    }
    fun AssignTrip(driver_name : String, startpoint : String, destination : String): String
    {
        println("Водитель ${driver_name} назначен\nНачальная точка ${startpoint}\nКонечная точка ${destination}")
        return "Да"
    }
    fun UnnasignDriver(): String {
        println("Водитель отстранён от работы")
        return "Отстранён"
    }
}