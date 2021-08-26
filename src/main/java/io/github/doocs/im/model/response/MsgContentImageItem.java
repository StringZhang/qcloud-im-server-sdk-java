package io.github.doocs.im.model.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class MsgContentImageItem {
    /*
    图片序列号。后台用于索引图片的键值
     */
    public String UUID;

    /*
    图片格式。JPG = 1，GIF = 2，PNG = 3，BMP = 4，其他 = 255
     */
    public Integer ImageFormat;

    /*
    原图、缩略图或者大图下载信息
     */
    public List<MsgContentImageItemInfo> ImageInfoArray;

}



