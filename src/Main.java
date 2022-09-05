public class Main {
    public static void main(String[] args) {
        System.out.println("Курс 2 - Java Core");

        Gryffindor harry = new Gryffindor("Гарри Поттер", 78, 65, 68, 56, 67);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 71, 90, 77, 73, 70);
        Gryffindor ron = new Gryffindor("Рон Уизли", 66, 61, 60, 69, 75);
        Slytherin draco = new Slytherin("Драко Малфой", 69, 70, 80, 40, 77, 60, 80);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 50, 50, 50, 50, 50, 50, 50);
        Slytherin gregory = new Slytherin("Грегори Гойл", 51, 52, 49, 48, 47, 53, 55);
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 61, 38, 59, 60, 70);
        Hufflepuff sedrick = new Hufflepuff("Седрик Диггори", 74, 69, 59, 68, 71);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 60, 43, 57, 58, 59);
        Ravenclaw chjoy = new Ravenclaw("Чжоу Чанг", 68, 39, 64, 54, 60, 46);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 55, 44, 55, 66, 77, 65);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 45, 39, 66, 68, 74, 55);

        Gryffindor[] grfiindorsStudents = {harry, hermione, ron};
        Hufflepuff[] hufflepuffsStudents = {zaharia, sedrick, justin};
        Slytherin[] slytherinsStudents = {draco, graham, gregory};
        Ravenclaw[] ravenclawsStudents = {chjoy, padma, marcus};


        Hogwarts.printStudentDescription(harry);
        Hogwarts.printStudentDescription(chjoy);
        Hogwarts.printStudentDescription(draco);
        Hogwarts.printStudentDescription(sedrick);

        Gryffindor.findAndPrintBestStudent(grfiindorsStudents);
        Hufflepuff.findAndPrintBestStudent(hufflepuffsStudents);
        Ravenclaw.findAndPrintBestStudent(ravenclawsStudents);

//Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам.
// У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
//Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//Метод должен выводить в консоль сравнение учеников.
//Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
//У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
//Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
//Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.

    }
}