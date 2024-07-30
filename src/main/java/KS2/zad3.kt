package KS2
/*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
 а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.

 */
fun main() {
    val startHour = 9
    val startMinute = 39
    val startTimeMinute = startHour * 60 + startMinute + 457
    val driveTimeHour = startTimeMinute / 60
    val driveTimeMinute = startTimeMinute % 60
    print(driveTimeHour)
    print(":")
    print(driveTimeMinute)



    //var finishMinute = driveTime / 60
    //finishMinute = finishHour - finishMinute


}