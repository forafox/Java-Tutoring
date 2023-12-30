package lessons.lesson5;

import static lessons.lesson5.Music.tune;
import static lessons.lesson5.Music3.tuneAll;

public class Lesson5 {
    public void start(){
        //Полиморфизм
//        Wind flute = new Wind();
//        tune(flute); // Upcasting //Восходящее преобразование

        //Позднее связывание (late binding)
//        Wind flute = new Wind();
//        Stringed violin = new Stringed();
//        Brass frenchHorn = new Brass();
//        Instrument instrument = new Instrument();
//        tune(instrument);
//        tune(flute); // No upcasting
//        tune(violin);
//        tune(frenchHorn);

        // Upcasting during addition to the array:
//        Instrument3[] orchestra = {
//                new Wind3(),//Духовые
//                new Percussion3(),//Ударные
//                new Stringed3(),//Струнный
//                new Brass3(),
//                new Woodwind3(),
//                new Test()
//        };
//        tuneAll(orchestra);

        //Порядок вызовов конструкторов
//        new Sandwich();

        //Полиморфные методы при инициализации
        //Так не надо
//        new RoundGlyph(5);
        //Так надо
//        RoundGlyph test =new RoundGlyph(5);
//        test.draw();
        //Выделяется память под новый объект
        //Вызывается конструкторы в нужном порядке

        //Стоит избегать вызов методов в момент иницилазии(внутри конструктора)
        //Не наделяй конструктор чем-то большим, чем инициализация

//        run-time type identification

//            Useful[] x = {
//                    new Useful(),
//                    new MoreUseful()
//            };
//            x[0].f();
//            x[1].g();
//            // Compile time: method not found in Useful:
////            ! x[1].u();
//            ((MoreUseful)x[1]).u(); // Downcast/RTTI
//            ((MoreUseful)x[0]).u(); // Exception thrown
    }


}
