package observer.jobagency;

// �����������, �� ����� �������� �����������
// � ������ ������ ��� �������, ������ ������, �������� ����������� �� ���������������� ��������
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
