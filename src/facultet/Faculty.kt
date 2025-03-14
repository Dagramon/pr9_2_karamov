package facultet

open class Faculty( var facultet_name : String, var persons : Int)
{
    open fun Info()
    {
        println("Факультет ${facultet_name}\nКоличество абитуриентов: ${persons}")
    }
    open fun Add_people()
    {
        try
        {
            print("Сколько человек добавить или отчислить? ")
            var number = readln().toInt()
            if (persons + number > 0 && persons + number < 5000)
            {
                persons += number
            }
            else
            {
                println("Ошибка")
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
    open fun CloseFaculty()
    {
        println("Факультет ${facultet_name} теперь закрыт")
        persons = 0
    }
}