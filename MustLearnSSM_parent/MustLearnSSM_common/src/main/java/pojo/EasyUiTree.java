package pojo;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/11 13:15
 */
public class EasyUiTree {
    
    private int id;
    private String text;
    private  String state;
    private  String attributes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public EasyUiTree() {
    }

    public EasyUiTree(int id, String text, String state, String attributes) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.attributes = attributes;
    }
}
