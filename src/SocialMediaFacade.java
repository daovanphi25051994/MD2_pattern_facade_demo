public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
    public void shareOnFaceBook(String message){
        this.facebook.setMessage(message);
        this.facebook.share();
    }
    public void shareOnTwitter(String message){
        this.twitter.setMessage(message);
        this.twitter.share();
    }
    public void shareOnLinkedIn(String message){
        this.linkedIn.setMessage(message);
        this.linkedIn.share();
    }
}
