package org.ict.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// �� �����̳ʿ� �־��ּ���.(��ϵ� ��Ʈ�ѷ��� ������ �۵���)
@Controller
public class MvcController {
	
	// �⺻�ּ� (localhost:8181)�ڿ� /goA�� ���̸� goA()�޼��� ����
	@RequestMapping(value = "/goA")
	// returnŸ���� String�� ��� ��� �������� ������ �� ����
	public String goA() {
		System.out.println("goA �ּ� ���� ����");
		// ��� �������� views ���� �Ʒ��� A.jsp
		return "A";
	}
	
	// goB�� �������ּ���.
	// ��� �������� B.jsp�Դϴ�.
	@RequestMapping(value = "/goB")
	public String goB() {
		System.out.println("goB �ּ� ���� ����");
		return "B";
	}
	
	// goC�� �Ķ���͸� �Է¹��� �� �ֵ��� �غ��ڽ��ϴ�.
	@RequestMapping(value = "/goC")
	// �ּ� �� ?cNum=�� ���·� ������ ���� ������ cNum���� ó���մϴ�.
	// ���� �Ķ���͸� .jsp���Ϸ� �����ϱ� ���ؼ���
	// Model model�� �Ķ���Ϳ� �߰��� �������ݴϴ�.
	public String goC(int cNum, Model model) {
		System.out.println("�ּҷ� ���޹��� �� : " + cNum);
		
		// ���޹��� cNum�� C.jsp�� ����ϴ� ������ �ۼ����ּ���.
		model.addAttribute("cNum", cNum);
		return "C";
	}
	
	// goD�� requestParam�� �̿��� ������� �޴� �̸��� ��ġ���� �ʰ� �غ��ڽ��ϴ�.
	@RequestMapping(value = "/goD")
	// @RequestParam("��ü�̸�")�� ���� ���ʿ� �����մϴ�.
	// �̷��� �Ǹ� ���� ������ ��� ��ü�̸����� ġȯ�� �޾��ݴϴ�.
	public String goD(@RequestParam("d") int dNum, Model model) {
		
		System.out.println("d ���������� ������ dNum�� ���� : " + dNum);
		
		model.addAttribute("dNum", dNum);
		
		return "D";
	}
	
	// cToF �޼��带 ����ڽ��ϴ�.
	// ���� �µ��� �Է¹޾� ȭ���µ��� �ٲ㼭 ������ִ� ���� �ۼ�
	// (ȭ�� - 32) / 1.8 = ����
	// ȭ�� = ���� * 1.8 + 32
	// �����̸��� ctof.jsp
	// ������ post������� �������������� ����������� �Ѿ������ ����
	@RequestMapping(value = "/ctof", method=RequestMethod.POST)
	public String cToF(double cel, Model model) {
//		public String cToF(@RequestParam("cel") double cel , Model model) {

		  double faren = cel * 1.8 + 32;

		  model.addAttribute("cel", cel);

		  model.addAttribute("faren", faren);

		  return "ctof";
	 }
	
	// ������ �����ϴ� �޼��嵵 ����ڽ��ϴ�.
	// ���� ����������� ���� �ּҸ� �����ϰ� �ϱ� ���ؼ� ������ �ٹ�� ���� ���
	@RequestMapping(value = "/ctof", method=RequestMethod.GET)
	public String cToFForm() {
		// ctofform�� �̿��� �����µ��� �Է��ϰ� �����ư�� ������
		// ������� ������ ������ �ۼ����ּ���.
		// input�±��� name�Ӽ��� cel��
		// action�� value�� ���� �ּҰ����� �Ѱ��ֽø� �˴ϴ�.
		
		return "ctofform";
	}
	
	
	// ���� ���� ������� bmi���� �������� �����ڽ��ϴ�.
	// ���� ����������� �����ϰ�
	// bmi������ ü�� / (Ű(m) ^2)���� ������ ����Դϴ�.
	@RequestMapping(value = "/getbmi", method = RequestMethod.POST)
	public String getBmi(double cm, double kg, Model model) {
		// ���������
		// Ű�� cm�� ���°��� �Ϲ���
		double m = cm / 100;
		// ü���� m�� �������� ����
		double bmi = kg/ (m*m);
		model.addAttribute("kg", kg);
		model.addAttribute("cm", cm);
		model.addAttribute("bmi", bmi);
		
		return "getbmi";
	}
	@RequestMapping(value = "/getbmi", method = RequestMethod.GET)
	public String bmiForm() {
		// ������ �̵�
		return "bmiform";
	}
	
	// PathVariable�� �̿��ϸ� url���Ҹ����ε� Ư�� �Ķ���͸� �޾ƿ� �� �ֽ��ϴ�.
	// rest������� url�� ó���� �� �ַ� ����ϴ� ����Դϴ�.
	// /pathtest/���� 	�� ���� ��ġ�� �� ���� page��� ���������� ����
	@RequestMapping(value = "/pathtest/{page}")
	public String pathTest(@PathVariable int page, Model model) {
		
		// �޾ƿ� page������ path.jsp�� �����ּ���.
		// path.jsp���� {path}������ ��ȸ���Դϴ�. ��� ������ �߰� ���ּ���.
		model.addAttribute("page", page);
		return "path";
	}
	
	// ctof ������ PathVariable�� �����ؼ� ������ּ���.
	// ctofpv.jsp �� ����� ��������.
	@RequestMapping(value = "/ctof/{cel}")
	public String cToFPath(@PathVariable double cel, Model model) {
		// cel ������ �޾Ƽ�, ȭ���� ���� faren�� ���� 
		  double faren = cel * 1.8 + 32;
		  // .jsp(view)�� ����
		  model.addAttribute("cel", cel);

		  model.addAttribute("faren", faren);

		  return "ctofpv";
	 }
	
	// voidŸ�� ��Ʈ�ѷ��� Ư¡
	// voidŸ���� return���� �ڿ� �ڷḦ ������ �� ���� ��ŭ
	// view������ �̸��� �׳� url����.jsp ���� �ڵ����� �ع����ϴ�.
	// ������ �ۼ��� voidŸ������ �ص� ������ �޼���� ������ ���ܼ� �� �Ⱦ���.
	@RequestMapping(value = "/voidreturn")
	public void voidTest(int num, Model model) {
		System.out.println("void ��Ʈ�ѷ��� ���ϱ����� �ʿ�����ϴ�." + num);
		
		model.addAttribute("num", num);
		
		// 1. �Ķ���͸� �ƹ��ų� �޾ƿ��� ���Ƿ� �������ּ���.
		// 2. �� �޼��忡 �´� �������� �������ּ���.
		// 3. 1���� ���� �Ķ���͸� 2�� ��µǵ��� �������ּ���.
		
	}
	
	
	

}
