package io.github.doocs.im.model.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class MsgBodyCloudCustomData {
    /*
    真实消息发送方 UserID
     */
    public String FromAccountReal;
    /*
    操作者Id ( 员工Id )
     */
    public Integer OperatorId;
    /*
    操作者名称 ( 员工姓名 )
     */
    public String OperatorName;

}
