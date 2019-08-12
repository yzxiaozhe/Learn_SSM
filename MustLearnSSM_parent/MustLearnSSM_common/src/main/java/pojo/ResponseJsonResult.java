package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/12 10:11
 * 
 * 用来封装crud操作时候需要的属性
 */
public class ResponseJsonResult {
    private int status =200;
    private String msg;
    private Object obj;
    private List<?> list=new ArrayList<Object>();

    public ResponseJsonResult() {
    }

    public ResponseJsonResult(int status, String msg, Object obj, List<?> list) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
        this.list = list;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
