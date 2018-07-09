package com.amazonaws.services.cognito.client;

public class CognitoTokenConstants {

    public static final String AUTH_TIME = "auth_time";
    public static final String CLIENT_ID = "client_id";
    public static final String DEVICE_KEY = "device_key";
    public static final String EMAIL = "email";
    public static final String EMAIL_VERIFIED = "email_verified";
    public static final String EVENT_ID = "event_id";
    public static final String SCOPE = "scope";
    public static final String TOKEN_USE = "token_use";
    public static final String USERNAME = "username";

    public static final String COGNITO_USERNAME = "cognito:username";

    static String COGNITO_JWKS_FORMAT = "https://cognito-idp.%s.amazonaws.com/%s/.well-known/jwks.json";
    static String COGNITO_ISSUER_FORMAT = "https://cognito-idp.%s.amazonaws.com/%s";
}
