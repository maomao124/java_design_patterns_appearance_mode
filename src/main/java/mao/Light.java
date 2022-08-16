package mao;

/**
 * Project name(项目名称)：java设计模式_外观模式
 * Package(包名): mao
 * Class(类名): Light
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 20:39
 * Version(版本): 1.0
 * Description(描述)： 灯
 */

public class Light implements HouseholdEquipment
{
    @Override
    public void on()
    {
        System.out.println("打开了灯....");
    }

    @Override
    public void off()
    {
        System.out.println("关闭了灯....");
    }
}
