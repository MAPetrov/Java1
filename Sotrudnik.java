package ru.geekbrains.java1.dz.dz5;

public class Sotrudnik {

    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private int zarplata;
    private int vozrast;

    public Sotrudnik(String _fio, String _dolzhnost, String _email, String _telefon, int _zarplata, int _vozrast) {
        fio = _fio;
        dolzhnost = _dolzhnost;
        email = _email;
        telefon = _telefon;
        zarplata = _zarplata;
        vozrast = _vozrast;
    }

    public void display() {
        System.out.println("ФИО: " + fio + "; должность: " + dolzhnost + "; e-mail: " + email
                + "; телефон: " + telefon + "; зарплата: " + zarplata + "; возраст: " + vozrast);
    }

    public static void main(String[] args) {
        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = new Sotrudnik("Иванов А.А.", "директор", "ivanov@mail.ru",
                "+7921111223344", 100000,30);
        sotrArray[1] = new Sotrudnik("Петров А.А.", "начальник управления", "petrov@mail.ru",
                "+7921111223345", 90000,41);
        sotrArray[2] = new Sotrudnik("Сидоров А.А.", "начальник отдела", "sidorov@mail.ru",
                "+7921111223344", 80000,45);
        sotrArray[3] = new Sotrudnik("Козлов А.А.", "старший менеджер", "kozlov@mail.ru",
                "+7921111223344", 70000,28);
        sotrArray[4] = new Sotrudnik("Смирнов А.А.", "менеджер", "smirnov@mail.ru",
                "+7921111223344", 60000,50);

        for (int i = 0; i < sotrArray.length; i++ ) {
            if (sotrArray[i].vozrast > 40) sotrArray[i].display();
        }
    }
}
