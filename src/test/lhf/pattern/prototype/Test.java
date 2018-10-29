package test.lhf.pattern.prototype;

import org.pattern.lhf.prototype.MessageBox;
import org.pattern.lhf.prototype.UnderlinePen;
import org.pattern.lhf.prototype.framework.Manager;
import org.pattern.lhf.prototype.framework.Product;

public class Test {
    public static void main(String[] args){
        Manager manager=new Manager();
        UnderlinePen underlinePen=new UnderlinePen('~');
        MessageBox messageBox=new MessageBox('*');
        MessageBox messageBox1=new MessageBox('`');
        manager.register("StrongMessage",underlinePen);
        manager.register("WarningBox",messageBox);
        manager.register("slashBox",messageBox1);

        Product product=manager.create("StrongMessage");
        product.use("Hello World");
        Product product1=manager.create("WarningBox");
        product1.use("My name");
        Product product2=manager.create("slashBox");
        product2.use("slash box");
    }
}
