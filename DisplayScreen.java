public class DisplayScreen {
    //
    private String Messages;
    public String Notifications;

    public static void main(String args[]) {
        System.out.println("Program begins.");
        mainChat();
        System.out.println("Program ends.");
    }

    // Since mainChat is private, it will likely contain most of the logic for chat functionality
    private void mainChat()
    {
        // Implement here
    }

    //
    public void sendMessage()
    {
        // Logic to send message to another client... but where is the client?
    }

    public void receiveMessage()
    {
        // Logic to receive message from another client... but where is the client?
    }

    public void notifPopUp()
    {
        // What notification?
    }

    public void displayChat()
    {
        // Logic likely used by the mainChat method
    }

    public void serverList()
    {
        Server.serverList();
    }
}