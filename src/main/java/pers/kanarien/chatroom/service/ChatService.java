package pers.kanarien.chatroom.service;

import com.alibaba.fastjson.JSONObject;

import io.netty.channel.ChannelHandlerContext;

public interface ChatService {
    //注册
    public void register(JSONObject param, ChannelHandlerContext ctx);
    //私聊
    public void singleSend(JSONObject param, ChannelHandlerContext ctx);
    //群聊
    public void groupSend(JSONObject param, ChannelHandlerContext ctx);
    //私聊中的文件发送
    public void FileMsgSingleSend(JSONObject param, ChannelHandlerContext ctx);
    //群聊中的文件发送
    public void FileMsgGroupSend(JSONObject param, ChannelHandlerContext ctx);
    //删除
    public void remove(ChannelHandlerContext ctx);
    //类型错误/chat
    public void typeError(ChannelHandlerContext ctx);
        
}
