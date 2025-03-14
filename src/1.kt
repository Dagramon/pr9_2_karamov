import avtobaza.Dispetcher as NewDispetcher
import avtobaza.Trip as NewTrip
import driver.Driver as NewDriver
import driver.Car as NewCar
fun main()
{
    try
    {
        var dispetcher = NewDispetcher("Иван", 30, 3, "Volkswagen Polo")
        var trip = NewTrip(dispetcher.name, dispetcher.age, dispetcher.experience, dispetcher.assignedCar, "Ленина 17", "Первомайская 73", "Нет")
        var driver = NewDriver("Алижон", 40, 10, "Volkswagen Polo", "Нет")
        var car = NewCar(driver.name, driver.age, driver.experience, driver.car, driver.isWorking, "В порядке")
        do {
            println("1 - Информация о диспетчере\n2 - Информация о поездке\n3 - Информация о водителе\n4 - Информация о машине\n5 - Начать поездку")
            print("Выберите действие: ")
            var selection = readln().toInt()
            when (selection) {
                1 -> {
                    dispetcher.Info()
                }

                2 -> {
                    trip.Info()
                }

                3 -> {
                    driver.Info()
                }

                4 -> {
                    car.Info()
                }

                5 -> {
                    break
                }

                else -> {
                    break
                }
            }
        } while (true)
        driver.isWorking = dispetcher.AssignTrip(driver.name, trip.startPoint, trip.destination)
        println("--------------------------------------------------")
        driver.Report(car.status)
        trip.isCompleted = "Да"
        do {
            println("Доп. функции\n----------------------------------------------------")
            println("1 - Пропустить год для диспетчера\n2 - Отстранить водителя от работы\n3 - Изменить пункт назначения\n4 - Пропустить год для водителя\n5 - Запросить починку автомобиля\n6 - Сломать автомобиль")
            print("Выберите действие: ")
            when (readln().toInt()) {
                1 -> {
                    dispetcher.YearPassed()
                    dispetcher.Info()
                }

                2 -> {
                    driver.isWorking = dispetcher.UnnasignDriver()
                    driver.Info()
                }

                3 -> {
                    trip.ChangeDestination()
                    trip.Info()
                }

                4 -> {
                    driver.YearPassed()
                    driver.Info()
                }

                5 -> {
                    driver.AskForRepair()
                    driver.Info()
                }
                6 ->
                {
                    car.Break()
                    car.Info()
                }

                else -> {
                    println("Неверно выбрано действие")
                }
            }
        } while (true)
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}