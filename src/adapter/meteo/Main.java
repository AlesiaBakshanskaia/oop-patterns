package adapter.meteo;

public class Main {

    // ���� ���������� ����� ������ �� ��������. ��� ��� ���� ������� � ��������� � ���� �����������.
    // �������� ����� ������ �� ������ ��������, ��������� �������� ���������� �� ����������.
    // ���� �������� ���� ������ � �������.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // ����� ���� ������� ����� getData � ������ ST500Info. ���������� ������ ��������� � ����� save ������� meteoDb
    }
}
