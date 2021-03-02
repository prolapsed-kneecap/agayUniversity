package com.polich.kneecap

object LevelDif {
     val easyLevelEvent: MutableList<Event> = mutableListOf(naturalEventForLevel.naturalEvent[0], climateEventForLevel.climateEvent[2], bugsEventForLevel.bugsEvent[0])
     val mediumLevelEvent: MutableList<Event> = mutableListOf(naturalEventForLevel.naturalEvent[0], climateEventForLevel.climateEvent[1], bugsEventForLevel.bugsEvent[4])
     val hardLevelEvent: MutableList<Event> = mutableListOf(naturalEventForLevel.naturalEvent[1], climateEventForLevel.climateEvent[0], bugsEventForLevel.bugsEvent[3])

    val LevelSection: List<Level> = listOf(
        Level("1", 3, 4, easyLevelEvent),
        Level("2", 4, 6, mediumLevelEvent),
        Level("3", 6, 8, hardLevelEvent),
        )
}
class Level(val name:String, val amountOfEvents:Int, val years:Int, var events:MutableList<Event>)

object naturalEventForLevel {
    val naturalEvent = mutableListOf<NaturalDisasters>(
        NaturalDisasters(
            "Смерч", 1,
            "На ваши поля надвигается смерч. " +
                    "Вздымая тучи земли и пыли, смерчи могут пронести " +
                    "песчанную смесь несколько сотен метров и потерять"
        ),
        NaturalDisasters(
            "Наводнение", 3,
            "Река, протекющая мимо вашего хозйства вышла из берегов." +
                    "Любое затопление площадей, предназначенных для выращивания " +
                    "сельскохозяйственных культур, приводит к вытеснению из почвы воздуха. " +
                    "При этом в почве прекращается нормальный газообмен и в воду от корней " +
                    "растений поступает углекислота, которая вредно влияет на растения. " +
                    "Это обстоятельство — главная причина падения урожайности или гибели " +
                    "сельскохозяйственных культур в результате наводнения."
        ),
        NaturalDisasters(
            "Ливни и грозы", 1,
            "Над степью нависли тучи. Ожидаются продолжительные дожди. " +
                    "Затяжные дожди могут привести к частичной или полной потере урожаяю. " +
                    "Почва становится плотной и воздух не проникает в почву. Света и тепла становится меньше. " +
                    "Дожди способствуют увеличению слизней и улиток."
        ),
        NaturalDisasters(
            "Пыльная буря", 2,
            "Разрушение почвенного покрова негативно влияет на урожйности."
        ),
    )
}
object climateEventForLevel {
    val climateEvent = mutableListOf<ClimateDisasters>(
        ClimateDisasters(
            "Засуха", 3,
            " Палящее солнце иссушило сочные, высотой по колено золотистые травы до" +
                    " самой сердцевины, каждая травинка стала хрусткой и ломкой. Это " +
                    "агрометеорологическое явление, вызывающее резкое несоответствие " +
                    "между потребностью растений во влаге и ее поступлением из почвы в результате" +
                    " недостаточного количества осадков и повышенной испаряемости, что " +
                    "нарушает нормальное водоснабжение растений."
        ),
        ClimateDisasters(
            "Град", 2,
            "Получая повреждения растения начинают испытывать стресс. Стресс " +
                    "заставляет растение тратить энергию на выживание в экстремальных " +
                    "условиях в ущерб урожаю и его качеству. Сократить потери может только " +
                    "своевременная помощь растениям в преодолении стресса."
        ),
        ClimateDisasters(
            "Похолодание", 1,
            "Заморозки наносят существенный материальный ущерб сельскому хозяйству. " +
                    "Особенно чувствительны к заморозкам теплолюбивые культуры."
        )
    )
}
object bugsEventForLevel {
    val bugsEvent = mutableListOf<Bugsss>(
        Bugsss(
            "Cаранча", 3,
            "Ваше хойзяйстов под большой угрозой. Нашестиве саранчи! Всеядный вредитель, с наибольшей активностью питания в ранние утренние и " +
                    "вечерние часы, когда отсутствует пик жары. Одна особь съедает до 500 г растений" +
                    " с разной плотностью вегетативных и генеративных органов (листьев, цветов, " +
                    "молодых веток, стеблей, плодов)."
        ),
        Bugsss(
            "Совка", 3,
            "В старину Cовку за ее вредоносность называли северной саранчой и озимым червем. " +
                    "Личинки выедают прорастающие семена пшеницы, отчего происходит прореживание всходов, " +
                    "и образуются оголенные участки поля."
        ),
        Bugsss(
            "Хлебный жук", 3,
            "Цепкими лапками эти хлебные жуки перебирают колоски и перелетают на новые " +
                    "растения в поисках пищи. В просторечье этого жука называют «хлебным кузькой». " +
                    "Но, не смотря на такое милое название, этот жук является одним из самых злостных" +
                    " массовых вредителей посевов. Эти вредители наносят колоссальный урон сельскому хозяйству."
        ),
        Bugsss(
            "Шведская мушка", 3,
            "Самый большой вред сельскохозяйственным культурам причиняют личинки шведских мух, " +
                    "которые выедают злаки и близлежащие ткани. В результате у злаков отмирают центральные " +
                    "листья, что приводит к замедлению роста растения или к полной его гибели. Личинки поедают " +
                    "зерна, не давая им созреть, что приводит к снижению урожая."
        ),
        Bugsss(
            "Жук-щелкун", 3,
            "Ваши растения под большой угрозой. " +
                    "Жук-щелкун причиняет огромный вред сельскохозяйственным угодьям. " +
                    "В частности, не сам жук, а его потомство личинок. " +
                    "Проволочники находятся в верхнем слое почвы, " +
                    "где поедают сначала семена растений, а затем пробирается внутрь " +
                    "самой корневой системы. Поврежденные растения становятся жертвой " +
                    "сапротрофов, в результате чего они быстро загнивают. Для защиты от " +
                    "этих вредителей следует принимать предупредительные меры, поскольку " +
                    "если он уже заведется, то избавиться от него будет крайне проблематично."
        ),
        Bugsss("", 3, ""),
    )
}