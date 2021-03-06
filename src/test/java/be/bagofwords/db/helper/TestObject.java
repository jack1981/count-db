package be.bagofwords.db.helper;

import be.bagofwords.exec.RemoteClass;

/**
 * Used in TestDataInterface unit tests
 */

@RemoteClass
public class TestObject {

    private int value1;
    private String value2;

    public TestObject() {
    }

    public TestObject(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestObject that = (TestObject) o;

        return value1 == that.value1 && value2.equals(that.value2);

    }

    @Override
    public int hashCode() {
        int result = value1;
        result = 31 * result + value2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return value1 + " " + value2;
    }
}
