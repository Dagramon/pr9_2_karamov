import abiturient.Applicant as NewApplicant
import abiturient.Exam as NewExam
import facultet.Faculty as NewFacultet
import facultet.Teacher as NewTeacher

fun main() {
    try {
        var facultet = NewFacultet("Гриффиндор", 500)
        var applicant = NewApplicant("Дамир", 17, 0.0, "Программирование")
        var exam1 = NewExam(applicant.name, applicant.age, applicant.sr_ball, applicant.hobby, "Теория вероятности", 0)
        var exam2 = NewExam(applicant.name, applicant.age, applicant.sr_ball, applicant.hobby, "Численные методы", 0)
        var teacher = NewTeacher(facultet.facultet_name, facultet.persons, "Николай Николаевич", 40, 5)
        do {
            println("1 - Информация о факультете\n2 - Информация о абитуриенте\n3 - Информация о первом экзамене\n4 - Информация о втором экзамене\n5 - Информация о учителе, который проводит экзамен\n6 - Начать экзамен")
            print("Выберите действие: ")
            var selection = readln().toInt()
            when (selection) {
                1 -> {
                    facultet.Info()
                }

                2 -> {
                    applicant.Info()
                }

                3 -> {
                    exam1.Info()
                }

                4 -> {
                    exam2.Info()
                }

                5 -> {
                    teacher.Info()
                }

                6 -> {
                    break
                }

                else -> {
                    break
                }
            }
        } while (true)
        exam1.Examen()
        exam2.Examen()
        applicant.SetSr_ball((exam1.sr_ball + exam2.sr_ball))
        if (applicant.Enroll() == 1) {
            facultet.persons += 1
            println("${teacher.name} дал разрешение на зачисление ${applicant.name} в факультет ${facultet.facultet_name}")
        }
        do {
            println("Доп. функции\n----------------------------------------------------")
            println("1 - Зачислить или отчислить людей из факультета\n2 - Закрыть факультет\n3 - Изменить хобби абитуриента\n4 - Пропустить год для преподавателя\n5 - Уволить преподавателя")
            print("Выберите действие: ")
            when (readln().toInt()) {
                1 -> {
                    facultet.Add_people()
                    facultet.Info()
                }

                2 -> {
                    facultet.CloseFaculty()
                    facultet.Info()
                }

                3 -> {
                    applicant.ChangeHobby()
                    applicant.Info()
                }

                4 -> {
                    teacher.YearPassed()
                    teacher.Info()
                }

                5 -> {
                    teacher.Fire()
                    teacher.Info()
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