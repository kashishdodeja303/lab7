class Message {
    String text;

    Message(String text) {
   this.text = text;
    }
     }

class SMS extends Message {
    String rec_contact;

    SMS(String text, String rec_contact) {
    super(text);
    this.rec_contact = rec_contact;
    }

    void display() {
        System.out.println(super.text);
        System.out.println(this.rec_contact);
    }
        }

    public static void main(String[] args) {
    SMS sms = new SMS("Hey!", "098379021");
   sms.display();
    }
