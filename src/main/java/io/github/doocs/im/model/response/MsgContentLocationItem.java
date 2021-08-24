package io.github.doocs.im.model.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//
@Data
@Getter
@Setter
public class MsgContentLocationItem {

    /*
    地理位置描述信息
     */
    public String Desc;
    /*
    维度
     */
    public double Latitude;
    /*
    经度
     */
    public double Longitude;

}
