package io.github.doocs.im.model.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MsgContentFaceItem {
    /*
    表情索引，用户自定义。
     */
    public Integer Index;
    /*
    额外数据
     */
    public String Data;
}
