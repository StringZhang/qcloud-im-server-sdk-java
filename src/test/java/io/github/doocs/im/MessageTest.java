package io.github.doocs.im;

import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 10:37
 */
public class MessageTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        //InputStream resourceAsStream = MessageTest.class.getClassLoader().getResourceAsStream("app.properties");
        //根据自己的配置文件名称填写,取自"src/test/resources/XXXX.yml"文件
        InputStream resourceAsStream = MessageTest.class.getClassLoader().getResourceAsStream("application-pre.yml");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String key = properties.getProperty("key");
        String identifier = properties.getProperty("identifier");
        Long appId = Long.parseLong(properties.getProperty("appId"));
        client = IMClient.getInstance(appId, identifier, key);
    }

    /*
    消息 - 发送文本消息
     */
    @Test
    public void testSendMsg() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("fuck 敏感词过滤");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }


    /*
    消息 - 发送 - 地理位置消息
     */
    @Test
    public void testSendMsgLocation() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMLocationElem");
        MsgContentLocationItem contentItem = new MsgContentLocationItem();
        contentItem.setDesc("单元测试 - 地理信息");
        contentItem.setLatitude(29.340656774469956);
        contentItem.setLongitude(116.77497920478824);
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }


    /*
    消息 - 发送 - 表情
     */
    @Test
    public void testSendMsgFace() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMFaceElem");
        MsgContentFaceItem contentItem = new MsgContentFaceItem();
        contentItem.setIndex(3);
        contentItem.setData("[调皮]");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    /*
     消息 - 发送 - 自定义消息
     */
    @Test
    public void testSendMsgCustomer() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMCustomElem");
        MsgContentCustomerItem contentItem = new MsgContentCustomerItem();
        contentItem.setExt("ExtStr");
        contentItem.setData("[调皮]");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    /*
 消息 - 发送 - 语音消息
 */
    @Test
    public void testSendMsgSound() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMCustomElem");
        MsgContentCustomerItem contentItem = new MsgContentCustomerItem();
        contentItem.setExt("ExtStr");
        contentItem.setData("[调皮]");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }


    /*
     消息 - 发送 - 图像消息
     */
    @Test
    public void testSendMsgImage() throws IOException {
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("user0");
        request.setToAccount("user1");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMCustomElem");
        MsgContentImageItem contentItem = new MsgContentImageItem();
        contentItem.setUUID("1853095_D61040894AC3DE44CDFFFB3EC7EB720F");
        contentItem.setImageFormat(3);
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBatchSendMsg() throws IOException {
        BatchSendMsgRequest request = new BatchSendMsgRequest();
        request.setSyncOtherMachine(2);
        request.setToAccount(Arrays.asList("test1", "test2"));
        request.setMsgSeq(28460);
        request.setMsgRandom(1992121);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hi bingo");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        BatchSendMsgResult result = client.message.batchSendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImportMsg() throws IOException {
        ImportMsgRequest request = new ImportMsgRequest();
        request.setSyncFromOldSystem(1);
        request.setFromAccount("bingo");
        request.setToAccount("test1");
        request.setMsgSeq(123);
        request.setMsgRandom(122);
        request.setMsgTimeStamp(1557387418);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hello bingo");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        ImportMsgResult result = client.message.importMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminGetRoamMsg() throws IOException {
        AdminRoamMsgRequest request = new AdminRoamMsgRequest();
        request.setFromAccount("test1");
        request.setToAccount("test2");
        request.setMaxCnt(123);
        request.setMinTime(1584669600);
        request.setMaxTime(1584673200);
        AdminRoamMsgResult result = client.message.getRoamMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminMsgWithdraw() throws IOException {
        AdminMsgWithdrawRequest request = new AdminMsgWithdrawRequest();
        request.setFromAccount("test1");
        request.setMsgKey("31906_833502_1572869830");
        request.setToAccount("bingo");
        AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminSetMsgRead() throws IOException {
        AdminSetMsgReadRequest request = new AdminSetMsgReadRequest();
        request.setPeerAccount("test1");
        request.setReportAccount("test2");
        AdminSetMsgReadResult result = client.message.setMsgRead(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGetC2CUnreadMsgNum() throws IOException {
        GetC2CUnreadMsgRequest request = new GetC2CUnreadMsgRequest();
        request.setPeerAccount(Arrays.asList("test1", "bingo"));
        request.setToAccount("test2");
        C2CUnreadMsgNumResult result = client.message.getC2CUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
