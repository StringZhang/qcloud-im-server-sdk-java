package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
/*
文件消息元素
 */
public class MsgContentFileItem {

    /*
    文件下载地址，可通过该 URL 地址直接下载相应文件。
     */
    public  String Url;

    /*
    文件数据大小，单位：字节。
    备注:如果文件数据大小计算错误,文件会损坏,消息接收者会出现问题;
     */
    public Integer FileSize;

    /*
    文件名称。
     */
    public String FileName;

    /*
    文件下载方式标记。目前 Download_Flag 取值只能为2，表示可通过Url字段值的 URL 地址直接下载文件。
     */
    @JsonProperty("Download_Flag")
    public Integer DownloadFlag;

}
