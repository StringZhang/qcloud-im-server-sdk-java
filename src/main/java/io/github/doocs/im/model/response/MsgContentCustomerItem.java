package io.github.doocs.im.model.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MsgContentCustomerItem {
    /*
    自定义消息数据。 不作为 APNs 的 payload 字段下发，故从 payload 中无法获取 Data 字段。
     */
    public String Data;
    /*
    自定义消息描述信息。当接收方为 iOS 或 Android 后台在线时，做离线推送文本展示。
    若发送自定义消息的同时设置了 OfflinePushInfo.Desc 字段，此字段会被覆盖，请优先填 OfflinePushInfo.Desc 字段。
     */
    public String Desc;
    /*
    扩展字段。当接收方为 iOS 系统且应用处在后台时，此字段作为 APNs 请求包 Payloads 中的 Ext 键值下发，Ext 的协议格式由业务方确定，APNs 只做透传。
     */
    public String Ext;

    /*
    自定义 APNs 推送铃音。
     */
    public String Sound;

}
