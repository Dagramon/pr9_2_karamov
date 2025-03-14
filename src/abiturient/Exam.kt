package abiturient

import kotlin.random.Random

class Exam(name : String, age : Int, sr_ball : Double, hobby : String, var subject : String, var mark : Int) : Applicant(name, age, sr_ball, hobby)
{
    override fun Info()
    {
        println("Экзамен: ${subject}\nАбитуриент ${name}\nОценка ${mark}")
    }
    fun Examen()
    {
        mark = Random.nextInt(2, 6)
        println("Оценка на экзамене по ${subject} : ${mark}")
        sr_ball += mark
    }
}