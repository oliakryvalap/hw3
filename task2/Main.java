package task2;
/*Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение,
если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try {
            FileManager fr = new FileManager();
            fr.reader("file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}