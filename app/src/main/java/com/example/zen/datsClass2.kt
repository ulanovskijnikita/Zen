package com.example.zen

data class dataClass2(val Title:String, val Text1:String, val Img1:Int)
class collection2 {
    val col2= listOf(dataClass2("Новости понедельника", "Понедельник, недели новой начало.\nВыходные закончились - печаль", R.drawable.persons1),
        dataClass2("Новости вторника", "Вторник, недели новой продолжение.\nВыходные закончились\n- все еще печаль", R.drawable.persons2),
        dataClass2("Новости среды", "Среда, недели новой середина.\nВыходные далеко - уже достал петель", R.drawable.persons3),
        dataClass2("Новости четверга", "Четверг, недели рабочей развитие.\nВыходные еще далеко \n- уже прикупил мыло", R.drawable.persons2),
        dataClass2("Новости пятницы", "Пятница, недели рабочей завершение.\nВыходные завтра - хорошо,\nчто не дошло до греха...", R.drawable.persons1),
        dataClass2("Новости субботы", "Суббота, недели выходной начало.\nВыходные!", R.drawable.persons2),
        dataClass2("Новости воскресения", "Воскресенье, недели выходной конец.\nЗавтра понедельник - ура?", R.drawable.persons2)
        )
}
