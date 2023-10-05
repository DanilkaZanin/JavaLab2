package org.example;
/**Объект класса Part будет содержать в себе так называемую часть выражения */
public class Part {

    Part part;
    char sign;
    String expression;

    public Part(){
        part = null;
        sign = ' ';
        expression = null;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

}
