package io.github.doocs.im.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
原图、缩略图或者大图下载信息。
 */
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgContentImageItemInfo {

    /*
 图片类型： 1-原图，2-大图，3-缩略图
  */
    public Integer Type;
    /*
    图片数据大小，单位：字节
     */
    public Integer Size;
    /*
    图片宽度
     */
    public Integer Width;
    /*
    图片高度
     */
    public Integer Height;
    /*
    图片下载地址
     */
    public String URL;



     enum MsgContentImageItemType {
        /*
        原图
         */
        ORIGINAL(1),
        /*
        大图
         */
        LARGER (2),
        /*
        缩略图
         */
        THUMBNAIL(3);

        private final Integer value;

        private MsgContentImageItemType(Integer value){
            this.value = value;
        }

        public MsgContentImageItemType valueOf(Integer value){
            switch (value){
                case 1:
                    return MsgContentImageItemType.ORIGINAL;
                case 2:
                    return MsgContentImageItemType.LARGER;
                case 3:
                    return MsgContentImageItemType.THUMBNAIL;
            }
            return null;
        }

    }
}
