package abst_factory_main;

import abst_concrete.FactoryInstance;
import abst_factory.Button;
import abst_factory.GuiFactory;
import abst_factory.TextArea;

public class Main_gui {

	public static void main(String[] args) throws Exception {
		//GuiFactory fac = new LinuxGuiFactory();
		//GuiFactory fac = new WinGuiFactory();
		//GuiFactory fac = new MacGuiFactory();
		GuiFactory fac = FactoryInstance.getGuiFac();
		//위처럼 factoryinstance에서 해당 환경의 guifactory를 넘겨준다면 아래는 매번 구현하지 않고 그대로 사용할 수 있다.

		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		button.click();
		System.out.println(area.getText());

	}

}
