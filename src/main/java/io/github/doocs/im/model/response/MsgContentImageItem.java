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

//
//    enum MsgContentImageItemFormat {
//        /*
//        图片格式:JPG
//         */
//        JPG(1),
//        /*
//        图片格式:GIF
//         */
//        GIF (2),
//        /*
//        图片格式:PNG
//         */
//        PNG(3),
//        /*
//        图片格式:BMP
//         */
//        BMP(4),
//        /*
//        图片格式:其它
//         */
//        OTHNER(255);
//
//        private final Integer value;
//
//        private MsgContentImageItemFormat(Integer value){
//            this.value = value;
//        }
//
//        public MsgContentImageItemInfo.MsgContentImageItemType valueOf(Integer value){
//            switch (value){
//                case 1:
//                    return MsgContentImageItemInfo.MsgContentImageItemType.ORIGINAL;
//                case 2:
//                    return MsgContentImageItemInfo.MsgContentImageItemType.LARGER;
//                case 3:
//                    return MsgContentImageItemInfo.MsgContentImageItemType.THUMBNAIL;
//            }
//            return null;
//        }
//
//    }
}



