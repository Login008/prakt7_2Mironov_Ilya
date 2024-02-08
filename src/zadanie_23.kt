import kotlin.math.tan

fun main()
{
    try {
        print("Введите количество углов многоугольника: ")
        var n = readLine()!!.toInt()
        if (n > 2) {
            print("Введите радиус окружности: ")
            var r = readLine()!!.toDouble()
            if (r > 0) {
                var p = 2 * n * r * tan(3.14 / n)
                println("Периметр данного многоугольника = ${String.format("%.2f", p)}")
            } else {
                println("Радиус должен быть больше нуля")
            }
        } else {
            println("Не существует геометрической фигуры, у которой меньше, чем 3 угла")
        }
    } catch (e:Exception) {
        println("Неверный формат данных")
    }
}