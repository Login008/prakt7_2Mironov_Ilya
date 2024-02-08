import kotlin.math.sqrt

fun main() {
    try {
    print("Введите значение k в уравнении y = kx + b: ")
    var k = readLine()!!.toDouble()
    print("Введите значение b в уравнении y = kx + b: ")
    var b = readLine()!!.toDouble()
    print("Введите значение радиуса окружности: ")
    var R = readLine()!!.toDouble()
        if (R > 0)
        {
    var d = 4 * k * k * b * b - 4 * (k * k + 1) * (b * b - R * R)

    var points = when {
        d < 0 -> 0
        d == 0.00 -> 1
        else -> 2
    }
    println("Количество точек пересечения в первой координатной четверти = $points")
        }
        else
        {
            println("Радиус не может быть меньше ии равен нулю")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}