package mao;

/**
 * Project name(项目名称)：java设计模式_外观模式
 * Package(包名): mao
 * Class(类名): SmartAppliancesFacade
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 20:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SmartAppliancesFacade
{
    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    /**
     * Instantiates a new Smart appliances facade.
     */
    public SmartAppliancesFacade()
    {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    /**
     * Say.
     *
     * @param message the message
     */
    public void say(String message)
    {
        assert message != null;
        if (message.contains("打开"))
        {
            on(message);
        }
        else if (message.contains("关闭"))
        {
            off(message);
        }
        else
        {
            System.out.println("未知");
        }
    }

    private void on(String message)
    {
        if (message.contains("电视"))
        {
            tv.on();
        }
        else if (message.contains("灯"))
        {
            light.on();
        }
        else if (message.contains("空调"))
        {
            airCondition.on();
        }
        else if (message.contains("所有"))
        {
            tv.on();
            light.on();
            airCondition.on();
        }
        else
        {
            System.out.println("打开失败");
        }
    }

    private void off(String message)
    {
        if (message.contains("电视"))
        {
            tv.off();
        }
        else if (message.contains("灯"))
        {
            light.off();
        }
        else if (message.contains("空调"))
        {
            airCondition.off();
        }
        else if (message.contains("所有"))
        {
            tv.off();
            light.off();
            airCondition.off();
        }
        else
        {
            System.out.println("关闭失败");
        }
    }
}
