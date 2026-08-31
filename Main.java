public class Main {

    public static void main(String[] args) {

        GameTicker ticker = new GameTicker();

        MobilePushNotification mobile = new MobilePushNotification(ticker);
        StadiumDisplay stadium = new StadiumDisplay(ticker);
        SocialMediaBot socialMedia = new SocialMediaBot(ticker);

        ticker.register(mobile);
        ticker.register(stadium);
        ticker.register(socialMedia);

        ticker.addUpdate("The game has started!");

        System.out.println();

        ticker.addUpdate("GOAL! Home team scores!");
    }
}