package lessons.lesson2;

public class Tree {
    //Поле, должно быть проинициализировано в конструкторе
    int height;
    Tree(){
        System.out.println("Сажаем дерево");
        height=0;
    }
    Tree(int initialHeight){
        System.out.println("Сажаем дерево c высотой = " + initialHeight);
        height=initialHeight;
    }
    void info(){
        System.out.println("Дерево высотой "+ height);
    }
    void info(String str){
        System.out.println(str+": Дерево высотой "+ height );
    }
}
