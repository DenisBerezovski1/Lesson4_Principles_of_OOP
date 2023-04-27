public class Program {
    public static void main(String[] args) {
        ArrayListClass<Integer> intList = new ArrayListClass<>();
        intList.add(32); // Добавление элемента
        intList.add(46);
        intList.add(23);
        intList.add(58);
        intList.add(77);
        intList.add(14);
        intList.add(53);
        intList.add(11);
        intList.add(12);
        intList.add(13);
        intList.add(84);
        intList.add(1);
        intList.printArray(); // Печать массива
        intList.remForIdx(7); // Удаление элемента по индексу
        intList.remForIdx(7);
        intList.printArray();
        intList.removeData(12); // Удаление элемента по значению
        intList.removeData(84);
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multiData()); // Произведение элементов массива
        System.out.println(intList.findIDX(53)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(148)); // Проверка наличия элемента в массиве. Возвращает true, если элемент
                                                   // в массиве есть, false – нет.
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayListClass<String> stringList = new ArrayListClass<>();
        stringList.add("Компьютер"); // Добавление элемента
        stringList.add("Монитор");
        stringList.add("Мышка");
        stringList.add("Клавиатура");
        stringList.add("Наушники");
        stringList.add("Микрофон");
        stringList.add("Коврик");
        stringList.add("Проектор");
        stringList.add("Камера");
        stringList.add("Кабель");
        stringList.add("Датчик");
        stringList.add("Системный блок");
        stringList.printArray(); // Печать
        stringList.remForIdx(1);
        stringList.printArray();


    }
}
