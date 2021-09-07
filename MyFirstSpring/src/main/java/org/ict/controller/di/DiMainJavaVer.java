package org.ict.controller.di;

import org.ict.controller.di.classfile.Broadcast;
import org.ict.controller.di.classfile.Singer;
import org.ict.controller.di.classfile.Stage;

public class DiMainJavaVer {

	public static void main(String[] args) {
		// 1. ���� ��ü�� main���� ������ ����� ȣ���ϼ���.
		Singer singer = new Singer();
		singer.sing();

		// 2. ���� ��ü�� ���� ������ ����, ����� ȣ�����ּ���.
		// ���밴ü�� ������ �ݵ�� singer�� ���� �־�� �ϹǷ�
		// ����� singer�� �����մϴ�.
		Stage stage = new Stage(singer);
		stage.perform();
		
		// 3. ��� ���븦 �����ϴ� ����� ȣ�����ּ���.
		// ��۰�ü ������ �ݵ�� stage�� ���� �־�� �Ѵ�.
		// broadcast��ü�� Stage�� ���Թ޴´�.
		Broadcast broadcast = new Broadcast(stage);
		broadcast.broadcast();
	}

}
