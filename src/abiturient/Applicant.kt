package abiturient

open class Applicant(var name : String, var age : Int, var sr_ball : Double, var hobby : String)
{
    open fun Info()
    {
        println("Абитуриент ${name}\nВозраст ${age}\nСредний балл ${sr_ball}\nХобби ${hobby}")
    }
    fun SetSr_ball(number : Double)
    {
        sr_ball = number / 2
        println("Средний балл: ${sr_ball}")
    }
    open fun Enroll(): Int {
        if (sr_ball >= 4)
        {
            println("Абитуриент ${name} зачислен")
            return 1
        }
        else
        {
            println("Слишком низкий средний балл")
            return 0
        }
    }
    open fun ChangeHobby()
    {
        print("Введите новое хобби: ")
        hobby = readln()
    }
}