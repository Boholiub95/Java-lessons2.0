/*
    public class Message <T> {
        private T value;
        public Message() {}
        public Message(T value) {
            this.value = value;
        }
        public T getValue() {
            JAVA FROM EPAM
            90
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        public String toString() {
            if (value == null) {
                return null;
            }
            return value.getClass().getName() + " : " + value;
        }
    }
package by.epam.learn.messenger.main;
import by.epam.learn.messenger.entity.Message;
    public class MessageMain {
        public static void main(String[ ] args) {
            Message<Integer> ob1 = new Message<>();
            ob1.setValue(1); // only Integer or int
            int v1 = ob1.getValue();
            System.out.println(v1);
            Message<String> ob2 = new Message<>("Java");
            String v2 = ob2.getValue();
            System.out.println(v2);
            // ob1 = ob2; // compile error – parameterization is not covariant
            // default parameterization – Object
            Message ob3 = new Message(); // warning – raw type
            ob3 = ob1; // no compilation error - no parameterization
            System.out.println(ob3.getValue());
            ob3.setValue(new Byte((byte)1));
            ob3.setValue("Java SE 12");
            System.out.println(ob3);/* the type of the object is displayed, not the type of
 parameterization *//*
            ob3.setValue(71);
            System.out.println(ob3);
            ob3.setValue(null);
        }
    }
}
*/