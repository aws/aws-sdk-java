/*
 * Copyright 2011 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth;

import java.util.Date;

import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;

/**
 * Session credentials periodically refreshed by AWS SecurityTokenService
 */
public class STSSessionCredentials implements AWSSessionCredentials {

    private final AWSSecurityTokenService securityTokenService;
    private final int sessionDurationSeconds;
    
    private Credentials sessionCredentials;
        
    public static final int DEFAULT_DURATION_SECONDS = 3600;

    /**
     * Create a new credentials object that will periodically and automatically
     * obtain a session from STS.
     * 
     * @param credentials
     *            Primary AWS account credentials.
     */
    public STSSessionCredentials(AWSCredentials credentials) {
        this(credentials, DEFAULT_DURATION_SECONDS);
    }

	/**
	 * Create a new credentials object that will periodically and automatically
	 * obtain a session from STS.
	 * 
	 * @param credentials
	 *            Primary AWS account credentials.
	 * @param sessionDurationSeconds
	 *            The duration, in seconds, for each session to last.
	 */
    public STSSessionCredentials(AWSCredentials credentials, int sessionDurationSeconds) {
        this.securityTokenService = new AWSSecurityTokenServiceClient(credentials);
        this.sessionDurationSeconds = sessionDurationSeconds;
    }

    /**
     * Create a new credentials object that will periodically and automatically
     * obtain a session from STS, using a preconfigured STS client.
     * 
     * @param stsClient
     *            A pre-configured STS client from which to get credentials.
     */
    public STSSessionCredentials(AWSSecurityTokenService stsClient) {
        this(stsClient, DEFAULT_DURATION_SECONDS);
    }

    /**
     * Create a new credentials object that will periodically and automatically
     * obtain a session from STS, using a preconfigured STS client.
     * 
     * @param stsClient
     *            A pre-configured STS client from which to get credentials.
     * @param settings
     *            Session settings for all sessions created
     */
    public STSSessionCredentials(AWSSecurityTokenService stsClient, int sessionDuratinSeconds) {
        this.securityTokenService = stsClient;
        this.sessionDurationSeconds = sessionDuratinSeconds;
    }

    /**
     * Returns the AWS access key for the current STS session, beginning a new
     * one if necessary.
     * <p>
     * Clients are encouraged to call the atomic
     * {@link RenewableAWSSessionCredentials#getImmutableCredentials()} as a proxy to this method.
     */
    @Override
    public String getAWSAccessKeyId() {
        return getSessionCredentials().getAccessKeyId();
    }

    /**
     * Returns the AWS secret key for the current STS session, beginning a new
     * one if necessary.
     * <p>
     * Clients are encouraged to call the atomic
     * {@link RenewableAWSSessionCredentials#getImmutableCredentials()} as a proxy to this method.
     */
    @Override
    public String getAWSSecretKey() {
        return getSessionCredentials().getSecretAccessKey();
    }

    /**
     * Returns the session token for the current STS session, beginning a new
     * one if necessary.
     * <p>
     * Clients are encouraged to call the atomic
     * {@link RenewableAWSSessionCredentials#getImmutableCredentials()} as a proxy to this method.
     */
    @Override
    public String getSessionToken() {
        return getSessionCredentials().getSessionToken();
    }

    /**
     * Returns immutable session credentials for this session, beginning a new one if necessary.
     */
    public synchronized AWSSessionCredentials getImmutableCredentials() {
        Credentials creds = getSessionCredentials();
        return new BasicSessionCredentials(creds.getAccessKeyId(), creds.getSecretAccessKey(), creds.getSessionToken());
    }

    /**
     * Gets a current session credentials object, reinitializing if necessary.
     */
    private synchronized Credentials getSessionCredentials() {
        if ( needsNewSession() )
            startSession();
        return sessionCredentials;
    }

    private void startSession() {
        GetSessionTokenResult sessionTokenResult = securityTokenService
                .getSessionToken(new GetSessionTokenRequest().withDurationSeconds(sessionDurationSeconds));
        sessionCredentials = sessionTokenResult.getCredentials();
    }

    private boolean needsNewSession() {
        if ( sessionCredentials == null )
            return true;

        Date expiration = sessionCredentials.getExpiration();
        long timeRemaining = expiration.getTime() - System.currentTimeMillis();
        if ( timeRemaining < (60 * 1000) )
            return true;

        return false;
    }
}
