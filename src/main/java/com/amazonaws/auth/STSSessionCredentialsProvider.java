/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;

/**
 * AWSCredentialsProvider implementation that uses the AWS Security Token
 * Service to create temporary, short-lived sessions to use for authentication.
 */
public class STSSessionCredentialsProvider implements AWSCredentialsProvider {

    /** Default duration for started sessions */
    public static final int DEFAULT_DURATION_SECONDS = 3600;

    /** The client for starting STS sessions */
    private final AWSSecurityTokenService securityTokenService;

    /** The current session credentials */
    private AWSSessionCredentials sessionCredentials;

    /** The expiration time for the current session credentials */
    private Date sessionCredentialsExpiration;


    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified long lived AWS credentials to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param longLivedCredentials
     *            The main AWS credentials for a user's account.
     */
    public STSSessionCredentialsProvider(AWSCredentials longLivedCredentials) {
        this(longLivedCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified long lived AWS credentials to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param longLivedCredentials
     *            The main AWS credentials for a user's account.
     * @param clientConfiguration
     *            Client configuration connection parameters.
     */
    public STSSessionCredentialsProvider(AWSCredentials longLivedCredentials, ClientConfiguration clientConfiguration) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentials, clientConfiguration);
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified credentials provider (which vends long lived AWS credentials)
     * to make a request to the AWS Security Token Service (STS) to request
     * short lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider
     *            Credentials provider for the main AWS credentials for a user's
     *            account.
     */
    public STSSessionCredentialsProvider(AWSCredentialsProvider longLivedCredentialsProvider) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentialsProvider);
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified credentials provider (which vends long lived AWS credentials)
     * to make a request to the AWS Security Token Service (STS) to request
     * short lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider
     *            Credentials provider for the main AWS credentials for a user's
     *            account.
     * @param clientConfiguration
     *            Client configuration connection parameters.
     */
    public STSSessionCredentialsProvider(AWSCredentialsProvider longLivedCredentialsProvider, ClientConfiguration clientConfiguration) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentialsProvider, clientConfiguration);
    }

    @Override
    public AWSCredentials getCredentials() {
        if (needsNewSession()) startSession();

        return sessionCredentials;
    }

    @Override
    public void refresh() {
        startSession();
    }

    /**
     * Starts a new session by sending a request to the AWS Security Token
     * Service (STS) with the long lived AWS credentials. This class then vends
     * the short lived session credentials sent back from STS.
     */
    private void startSession() {
        GetSessionTokenResult sessionTokenResult = securityTokenService
                .getSessionToken(new GetSessionTokenRequest().withDurationSeconds(DEFAULT_DURATION_SECONDS));
        Credentials stsCredentials = sessionTokenResult.getCredentials();

        sessionCredentials = new BasicSessionCredentials(
                stsCredentials.getAccessKeyId(),
                stsCredentials.getSecretAccessKey(),
                stsCredentials.getSessionToken());
        sessionCredentialsExpiration = stsCredentials.getExpiration();
    }

    /**
     * Returns true if a new STS session needs to be started. A new STS session
     * is needed when no session has been started yet, or if the last session is
     * within 60 seconds of expiring.
     *
     * @return True if a new STS session needs to be started.
     */
    private boolean needsNewSession() {
        if (sessionCredentials == null) return true;

        long timeRemaining = sessionCredentialsExpiration.getTime() - System.currentTimeMillis();
        return timeRemaining < (60 * 1000);
    }

}
