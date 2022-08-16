package mao;

/**
 * Project name(项目名称)：java设计模式_外观模式
 * Package(包名): mao
 * Interface(接口名): HouseholdEquipment
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 20:41
 * Version(版本): 1.0
 * Description(描述)： 家用设备
 */

public interface HouseholdEquipment
{
    /**
     * 打开某个设备
     */
    void on();

    /**
     * 关闭某个设备
     */
    void off();
}
