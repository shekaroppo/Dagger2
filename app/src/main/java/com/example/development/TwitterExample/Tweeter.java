package com.example.development.TwitterExample;

/**
 * Created by Sekhar on 3/22/15.
 */
public class Tweeter {
    TwitterApi api;
    String user;

    public Tweeter(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void tweet(String tweet) {

        api.postTweet(user, tweet);
    }
}
