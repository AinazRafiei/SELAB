package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public TypeAddress Type;

    public varType varType;


    public void setNum(int num) {
        this.num = num;
    }

    public void setType(TypeAddress type) {
        Type = type;
    }

    public void setVarType(codegenerator.varType varType) {
        this.varType = varType;
    }

    public int getNum() {
        return num;
    }

    public TypeAddress getType() {
        return Type;
    }

    public codegenerator.varType getVarType() {
        return varType;
    }

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public String toString() {
        switch (getType()) {
            case Direct:
                return getNum() + "";
            case Indirect:
                return "@" + getNum();
            case Imidiate:
                return "#" + getNum();
            case default:
                return getNum() + "";
        }
    }
}

abstract class address_type{}

abstract  class AddressType extends  Address{

    public AddressType(int num, varType varType, TypeAddress Type) {super(num, varType, Type);}
    public AddressType(int num, varType varType) {super(num, varType);}

    public abstract String toString();

}
class Direct extends AddressType{

    public Direct(int num, varType varType, TypeAddress Type) {super(num, varType, Type);}
    public Direct(int num, varType varType) {super(num, varType);}

    @Override

    public String toString() {
        return getNum() + "";
    }
}
class Indirect extends AddressType{

    public Indirect(int num, varType varType, TypeAddress Type) {super(num, varType, Type);}
    public Indirect(int num, varType varType) {super(num, varType);}

    @Override
    public String toString() {
        return "@" + getNum();
    }
}
class Imidiate extends AddressType{

    public Imidiate(int num, varType varType, TypeAddress Type) {super(num, varType, Type);}
    public Imidiate(int num, varType varType) {super(num, varType);}


    @Override
    public String toString() {
        return "#" + getNum();
    }
}