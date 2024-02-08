fun main()
{
    try {
        print("Введите значение числа x: ")
        var x = readLine()!!.toDouble()
        print("Введите значение числа y: ")
        var y = readLine()!!.toDouble()
        print("Введите значение числа z: ")
        var z = readLine()!!.toDouble()
        var max = 0.0
        var min = 0.0

        if (x > z) {
            max = x
        }
        else {
            max = z
        }

        if ((x <= y) and (x <= z)) {
            min = x
        }
        else if ((y <= x) and (y <= z)) {
            min = y
        }
        else if ((z <= x) and (z <= y)) {
            min = z
        }

        var L = 2 * max - 3 * min
        println("Результат вычисления = $L")
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}