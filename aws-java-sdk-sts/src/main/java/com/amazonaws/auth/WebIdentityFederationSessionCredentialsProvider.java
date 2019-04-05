/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.Credentials;

/**
 * AWSCredentialsProvider implementation that uses the AWS Security Token
 * Service to create temporary, short-lived sessions to use for authentication.
 */
public class WebIdentityFederationSessionCredentialsProvider implements AWSSessionCredentialsProvider {

    /** Default duration for started sessions */
    public static final int DEFAULT_DURATION_SECONDS = 3600;
    
    /** Default threshold for refreshing session credentials */
    public static final int DEFAULT_THRESHOLD_SECONDS = 500;

    /** The client for starting STS sessions */
    private final AWSSecurityTokenService securityTokenService;

    /** The current session credentials */
    private AWSSessionCredentials sessionCredentials;

    /** The expiration time for the current session credentials */
    private Date sessionCredentialsExpiration;

    private final String wifToken;
    private final String wifProvider;
    private final String roleArn;
    private int sessionDuration;
    private int refreshThreshold;
    private String subjectFromWIF;

    /**
     * Constructs a new WebIdentityFederationSessionCredentialsProvider, which will use the
     * specified 3rd-party web identity provider to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param wifToken 
     *            The OAuth/OpenID token from the the Identity Provider
     * @param wifProvider
     *            The name of the Identity Provider (null for OpenID providers)
     * @param roleArn 
     *            The ARN of the IAM Role that will be assumed 
     */
    public WebIdentityFederationSessionCredentialsProvider(String wifToken, String wifProvider, String roleArn) {
        this(wifToken, wifProvider, roleArn, new ClientConfiguration());
    }

    /**
     * Constructs a new WebIdentityFederationSessionCredentialsProvider, which will use the
     * specified 3rd-party web identity provider to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param wifToken 
     *            The OAuth/OpenID token from the the Identity Provider
     * @param wifProvider
     *            The name of the Identity Provider (null for OpenID providers)
     * @param roleArn 
     *            The ARN of the IAM Role that will be assumed
     * @param clientConfiguation
     *            Configuration to apply to STS client created
     */
    public WebIdentityFederationSessionCredentialsProvider(String wifToken, String wifProvider, String roleArn, ClientConfiguration clientConfiguration) {
        this(wifToken, wifProvider, roleArn, new AWSSecurityTokenServiceClient(new AnonymousAWSCredentials(), clientConfiguration));
    }

    /**
     * Constructs a new WebIdentityFederationSessionCredentialsProvider, which will use the
     * specified 3rd-party web identity provider to make a request to the AWS
     * Security Token Service (STS) using the provided client to request short 
     * lived session credentials, which will then be returned by this class's 
     * {@link #getCredentials()} method.
     *
     * @param wifToken 
     *            The OAuth/OpenID token from the the Identity Provider
     * @param wifProvider
     *            The name of the Identity Provider (null for OpenID providers)
     * @param roleArn 
     *            The ARN of the IAM Role that will be assumed
     * @param stsClient
     *            Preconfigured STS client to make requests with
     */
    public WebIdentityFederationSessionCredentialsProvider(String wifToken, String wifProvider, String roleArn, AWSSecurityTokenService stsClient) {
        this.securityTokenService = stsClient; 
        this.wifProvider = wifProvider;
        this.wifToken = wifToken;
        this.roleArn = roleArn;
        this.sessionDuration = DEFAULT_DURATION_SECONDS;
        this.refreshThreshold = DEFAULT_THRESHOLD_SECONDS;
    }

    @Override
    public AWSSessionCredentials getCredentials() {
        if (needsNewSession()) startSession();

        return sessionCredentials;
    }

    @Override
    public void refresh() {
        startSession();
    }

   /**
     * Set the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @param sessionDuration
     *              The new duration for session credentials created by this
     *              provider
     */
    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

   /**
     * Set the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     * Returns refreence to object so methods can be chained together. 
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @param sessionDuration
     *              The new duration for session credentials created by this
     *              provider
     *
     * @return A reference to this updated object so that method calls
     *          can be chained together. 
     *
     */
    public WebIdentityFederationSessionCredentialsProvider withSessionDuration(int sessionDuration) {
        this.setSessionDuration(sessionDuration);
        return this;
    }

    /**
     * Get the duration of the session credentials created by this client in
     * seconds. Values must be supported by AssumeRoleWithWebIdentityRequest.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @return The duration for session credentials created by this provider
     */
    public int getSessionDuration() {
        return this.sessionDuration;
    }


   /**
     * Set the refresh threshold for the session credentials created by this client in
     * seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @param refreshThreshold 
     *              The new refresh threshold for session credentials created by this
     *              provider
     */
    public void setRefreshThreshold(int refreshThreshold) {
        this.refreshThreshold = refreshThreshold;
    }

   /**
     * Set the refresh threshold for the session credentials created by this client in
     * seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS. Returns a refrence to the object
     * so methods can be chained.
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @param refreshThreshold 
     *              The new refresh threshold for session credentials created by this
     *              provider
     *
     * @return A reference to this updated object so that method calls
     *          can be chained together. 
     *
     */
    public WebIdentityFederationSessionCredentialsProvider withRefreshThreshold(int refreshThreshold) {
        this.setRefreshThreshold(refreshThreshold);
        return this;
    }

    /**
     * Get the refresh threshold for the session credentials created by this client in
     * seconds. This value will be used internally to determine if new
     * credentials should be fetched from STS. 
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest 
     * 
     * @return The refresh threshold for session credentials created by this provider
     */
    public int getRefreshThreshold() {
        return this.refreshThreshold;
    }

    /**
     * Get the identifier returned from the Identity Provider for the
     * authenticated user.  This value is returned as part of the
     * AssumeRoleWithIdentityResult
     *
     * @see com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult
     *
     * @return The identifier returned from Identity Provider
     */
    public String getSubjectFromWIF() {
        return this.subjectFromWIF;
    }

    /**
     * Starts a new session by sending a request to the AWS Security Token
     * Service (STS) with the long lived AWS credentials. This class then vends
     * the short lived session credentials sent back from STS.
     */
    private void startSession() {
        AssumeRoleWithWebIdentityResult sessionTokenResult = securityTokenService
                .assumeRoleWithWebIdentity(new AssumeRoleWithWebIdentityRequest().withWebIdentityToken(wifToken)
                        .withProviderId(wifProvider)
                        .withRoleArn(roleArn)
                        .withRoleSessionName("ProviderSession")
                        .withDurationSeconds(this.sessionDuration));
        Credentials stsCredentials = sessionTokenResult.getCredentials();

        subjectFromWIF = sessionTokenResult.getSubjectFromWebIdentityToken();

        sessionCredentials = new BasicSessionCredentials(
                stsCredentials.getAccessKeyId(),
                stsCredentials.getSecretAccessKey(),
                stsCredentials.getSessionToken());
        sessionCredentialsExpiration = stsCredentials.getExpiration();
    }

    /**
     * Returns true if a new STS session needs to be started. A new STS session
     * is needed when no session has been started yet, or if the last session is
     * within the configured refresh threshold.
     *
     * @return True if a new STS session needs to be started.
     */
    private boolean needsNewSession() {
        if (sessionCredentials == null) return true;

        long timeRemaining = sessionCredentialsExpiration.getTime() - System.currentTimeMillis();
        return timeRemaining < (this.refreshThreshold * 1000);
    }

}
