package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public TypeAddress Type;
    public varType varType;
    public AddressType addressType;


    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
        this.addressType =
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public String toString() {
        switch (Type) {
            case Direct:
                return num + "";
            case Indirect:
                return "@" + num;
            case Imidiate:
                return "#" + num;
        }
        return num + "";
    }
}
abstract  class AddressType extends  Address{
    public int num;

    public AddressType(int num) {
        this.num = num;
    }

    public abstract String toString();

}
class Direct extends AddressType{

    public Direct(int num) {
        super(num);
    }

    @Override

    public String toString() {
        return num + "";
    }
}
class Indirect extends AddressType{

    public Indirect(int num) {
        super(num);
    }
    @Override
    public String toString() {
        return "@" + num;
    }
}
class Imidiate extends AddressType{

    public Imidiate(int num) {
        super(num);
    }

    @Override
    public String toString() {
        return "#" + num;
    }
}