package facultet

class Teacher(facultet_name : String, persons : Int, var name : String, var age : Int, var experience : Int) : Faculty (facultet_name, persons)
{
    override fun Info()
    {
        println("Преподаваталь ${name}\nВозраст ${age}\nОпыт работы ${experience} лет\nВ факультете ${facultet_name}")
    }

    override fun CloseFaculty()
    {
        println("Факультет заркыт, преподаватель ${name} больше не в факультете ${facultet_name}")
        facultet_name = "Неизвестно"
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
    fun Fire()
    {
        println("Преподаватель ${name} уволен")
        facultet_name = "Неизвестно"
    }
}