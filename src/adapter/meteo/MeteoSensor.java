package adapter.meteo;

import java.time.LocalDateTime;

interface MeteoSensor {
    int getId(); // ������������� �������

    Float getTemperature(); // ����������� �������

    Float getHumidity(); // ���������

    Float getPressure(); // ��������

    LocalDateTime getDateTime(); // ����� ������ ������ �������
}
