package adapter.meteo;

interface SensorTemperature{
    int identifier(); // ������������� �������
    double temperature(); // ����������� �������
    int year();			 // ���
    int day();			 // ���� ����
    int second();		 // ������� ���
}
