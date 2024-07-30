package KS2
/*В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
 которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
 который будет считать: Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */
fun main() {
    val staff = 50
    val salaryStaff = 30000
    val intern = 30
    val salaryIntern = 20000
    val moneyForStaff = staff * salaryStaff
    val moneyForAll = moneyForStaff + intern * salaryIntern
    val averageSalary = moneyForAll / (staff + intern)
    println(moneyForStaff)
    println(moneyForAll)
    println(averageSalary)
}

