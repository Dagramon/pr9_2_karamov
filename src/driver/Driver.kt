package driver

open class Driver(var name : String, var age : Int, var experience : Int, var car : String, var isWorking : String)
{
    open fun Info()
    {
        println("Водитель ${name} Лет ${age} Стаж ${experience}\nМашина ${car}\nРаботает? ${isWorking}")
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
    fun AskForRepair()
    {
        println("Водитель ${name} создал заявку на ремонт автомобиля ${car}")
        isWorking = "Нет"
    }
    fun Report(status : String)
    {
        println("Водитель ${name} завершил поездку! \nСостояние машины ${status}")
        isWorking = "Нет"
    }
}