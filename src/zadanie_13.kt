import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    try
    {
        print("Введите сторону a: ")
        var a = readLine()!!.toDouble()
        if (a > 0) {
            print("Введите сторону b: ")
            var b = readLine()!!.toDouble()
            if (b > 0) {
                print("Введите сторону c: ")
                var c = readLine()!!.toDouble()
                if (c > 0)
                {
                    if ((a + b >= c) and (a + c >= b) and (b + c >= a)) {
                        var p = (a + b + c) / 2
                        var h = (2 / a) * sqrt(p * (p - a) * (p - b) * (p - c))
                        var m = 0.5 * sqrt(2 * b.pow(2) * 2 * c.pow(2) - a.pow(2))
                        var bis = (2 * sqrt(b * c * p * (p - a))) / (b + c)
                        println("Высота к стороне a = ${String.format("%.2f", h)}\nМедиана к стороне a = ${String.format("%.2f", m)}\nБисскетриса угла A = ${String.format("%.2f", bis)}")
                    } else {
                        println("Не существует треугольника с такими сторонами")
                    }
                } else
                {
                    println("Сторона треугольника не может быть меньше или равна нулю")
                }
            } else
            {
                println("Сторона треугольника не может быть меньше или равна нулю")
            }
        } else
        {
            println("Сторона треугольника не может быть меньше или равна нулю")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}