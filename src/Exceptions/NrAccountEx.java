package Exceptions;

public class NrAccountEx extends Exception {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
