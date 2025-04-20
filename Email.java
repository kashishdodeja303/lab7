class Email extends Message {
    String Sender;
    String Receiver;
    String subject;

    Email(String text, String Sender, String Receiver, String subject) {
        super(text);
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.subject = subject;
    }

    void display() {
        System.out.println(super.text);
        System.out.println(this.Sender);
        System.out.println(this.Receiver);
        System.out.println(this.subject);
    }
}

public class EmailMain {
    public static void main(String[] args) {
        Email email = new Email("Hello!", "Alice", "Bob", "Meeting");
        email.display();
    }
}