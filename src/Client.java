public class Client {
    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }

    public void shareOnFacebook(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.shareOnFaceBook(message);
    }

    public void shareOnTwitter(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.shareOnTwitter(message);
    }

    public void shareOnLinkedIn(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.shareOnLinkedIn(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("Hello every body");
        System.out.println();
        client.shareOnFacebook("Hello every body");
        client.shareOnTwitter("Hello every body");
        client.shareOnLinkedIn("Hello every body");
    }
}
