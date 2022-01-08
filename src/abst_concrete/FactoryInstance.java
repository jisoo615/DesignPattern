package abst_concrete;

import abst_factory.Button;
import abst_factory.GuiFactory;
import abst_factory.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFac() throws Exception {
		switch(getOsCode()) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		case 2:
			return new WinGuiFactory();
		default:
			throw new Exception();
		}
	}

	private static int getOsCode() {
		String str = System.getProperty("os.name");
		if(str.contains("Mac")) {
			return 0;
		}else if(str.contains("Windows")) {
			return 2;
		}else if(str.contains("Linux")) {
			return 1;
		}else {
			return -1;
		}
	}


}

	class LinuxGuiFactory implements GuiFactory {

		@Override
		public Button createButton() {
			return new LinuxButton();
		}

		@Override
		public TextArea createTextArea() {
			return new LinuxTextArea();
		}
	}
	class LinuxButton implements Button {

		@Override
		public void click() {
			System.out.println("리눅스 버튼");

		}
	}
	class LinuxTextArea implements TextArea{

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "리눅스 텍스트에어리어";
		}
	}

	class MacGuiFactory implements GuiFactory{

		@Override
		public Button createButton() {
			// TODO Auto-generated method stub
			return new MacButton();
		}

		@Override
		public TextArea createTextArea() {
			// TODO Auto-generated method stub
			return new MacTextArea();
		}
	}
	class MacButton implements Button {

		@Override
		public void click() {
			System.out.println("맥 버튼");

		}
	}
	class MacTextArea implements TextArea{

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "맥 텍스트에어리어";
		}
	}

	class WinGuiFactory implements GuiFactory{

		@Override
		public Button createButton() {
			// TODO Auto-generated method stub
			return new WinButton();
		}

		@Override
		public TextArea createTextArea() {
			// TODO Auto-generated method stub
			return new WinTextArea();
		}
	}
	class WinButton implements Button {

		@Override
		public void click() {
			System.out.println("윈도우 버튼");
		}
	}
	class WinTextArea implements TextArea{

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "윈도우 텍스트에어리어";
		}
	}
