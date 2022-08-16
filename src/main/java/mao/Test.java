package mao;

/**
 * Project name(项目名称)：java设计模式_外观模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 20:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开电视");
        smartAppliancesFacade.say("打开空调");
        smartAppliancesFacade.say("打开灯");
        smartAppliancesFacade.say("关闭电视");
        System.out.println("-----");
        smartAppliancesFacade.say("关闭所有设备");
        smartAppliancesFacade.say("打开所有设备");
        smartAppliancesFacade.say("关闭灯");
        smartAppliancesFacade.say("关闭空调");
    }
}
