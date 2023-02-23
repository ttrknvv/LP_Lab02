package by.belstu.it.Tarakanov.basejava;

import java.util.Objects;

public class WrapperString {
    String str1 = "TTRKNVV";
    public WrapperString() {
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str1, that.str1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str1);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "str1='" + str1 + '\'' +
                '}';
    }
    public void replace(char oldchar, char newchar)
    {
        System.out.println("Replaced symbol '" + oldchar + "' on '" + newchar + "'");
    }
}
