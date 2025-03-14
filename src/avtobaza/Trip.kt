package avtobaza

class Trip(name : String, age : Int, experience : Int, assignedCar : String, var startPoint : String, var destination : String, var isCompleted : String) : Dispetcher(name, age, experience, assignedCar)
{
    override fun Info()
    {
        println("Назначенная машина ${assignedCar}\nНачальная точка ${startPoint}\nКонечая точка ${destination}\nСтатус ${isCompleted}")
    }
    fun ChangeDestination()
    {
        print("Введите новую конечную точку: ")
        destination = readln()
    }
}