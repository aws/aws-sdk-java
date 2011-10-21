package com.amazonaws.auth;

/**
 * Session credentials that can be refreshed upon request.
 */
public interface AWSRefreshableSessionCredentials extends AWSSessionCredentials {
    
    /**
     * Forces a refresh of these session credentials.
     */
    public void refreshCredentials();
    
}