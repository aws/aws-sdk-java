/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Random;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

/**
 * Helper class that contains the common behavior of the
 * CredentialsProviders that loads the credentials from a
 * local endpoint.
 */
@SdkInternalApi
abstract class BaseCredentialsFetcher {

    private static final Log LOG = LogFactory.getLog(BaseCredentialsFetcher.class);

    private static final Random JITTER = new Random();

    /**
     * The threshold after the last attempt to load credentials (in
     * milliseconds) at which credentials are attempted to be refreshed.
     */
    private static final int REFRESH_THRESHOLD = 1000 * 60 * 60;

    private static final int FIFTEEN_MINUTES_IN_MILLIS = 1000 * 60 * 15;

    /**
     * The threshold before credentials expire (in milliseconds) at which
     * this class will attempt to load new credentials.
     */
    private static final int EXPIRATION_THRESHOLD = FIFTEEN_MINUTES_IN_MILLIS;

    /** The name of the Json Object that contains the access key.*/
    private static final String ACCESS_KEY_ID = "AccessKeyId";

    /** The name of the Json Object that contains the secret access key.*/
    private static final String SECRET_ACCESS_KEY = "SecretAccessKey";

    /** The name of the Json Object that contains the token.*/
    private static final String TOKEN = "Token";

    private final SdkClock clock;

    /**
     * Whether expired credentials can be returned if the credential service is down or returns expired credentials
     */
    private final boolean allowExpiredCredentials;

    private final String providerName;

    /** The current instance profile credentials */
    private volatile AWSCredentials credentials;

    /** The expiration for the current instance profile credentials */
    private volatile Date credentialsExpiration;

    /** The time at which we will refresh the credentials because they are about to expire */
    private volatile Date credentialExpirationRefreshTime;

    /** The time of the last attempt to check for new credentials */
    protected volatile Date lastInstanceProfileCheck;

    protected BaseCredentialsFetcher(SdkClock clock, boolean allowExpiredCredentials) {
        this(clock, allowExpiredCredentials, null);
    }

    protected BaseCredentialsFetcher(SdkClock clock, boolean allowExpiredCredentials, String providerName) {
        this.clock = clock;
        this.allowExpiredCredentials = allowExpiredCredentials;
        this.providerName = providerName;
    }

    public AWSCredentials getCredentials() {
        if (needsToLoadCredentials())
            fetchCredentials();
        if (!allowExpiredCredentials && expired()) {
            throw new SdkClientException(
                "The credentials received have been expired");
        }
        return credentials;
    }

    /**
     * Returns true if credentials are null, credentials are within expiration or
     * if the last attempt to refresh credentials is beyond the refresh threshold.
     */
    boolean needsToLoadCredentials() {
        return credentials == null || isExpiring() || noRecentInstanceProfileCheck();
    }

    /**
     * Returns true if the credential expiration refresh time is in the past.
     */
    private boolean isExpiring() {
        return credentialExpirationRefreshTime != null &&
               credentialExpirationRefreshTime.getTime() <= clock.currentTimeMillis();
    }

    /**
     * Returns true if it has been REFRESH_THRESHOLD millis since we last refreshed the credentials from IMDS.
     */
    private boolean noRecentInstanceProfileCheck() {
        return lastInstanceProfileCheck != null &&
               lastInstanceProfileCheck.getTime() + REFRESH_THRESHOLD <= clock.currentTimeMillis();
    }

    /**
     * @return the raw credential response string from the local endpoint.
     */
    abstract String getCredentialsResponse();

    /**
     * Fetches the credentials from the endpoint.
     */
    private synchronized void fetchCredentials() {
        if (!needsToLoadCredentials()) return;

        if (LOG.isDebugEnabled()) {
            if (credentialsExpiration != null) {
                LOG.debug("Updating credentials, because currently-cached credentials expire on " + credentialsExpiration);
            } else {
                LOG.debug("Retrieving credentials.");
            }
        }

        JsonNode accessKey;
        JsonNode secretKey;
        JsonNode node;
        JsonNode token;
        try {
            lastInstanceProfileCheck = new Date();

            String credentialsResponse = getCredentialsResponse();

            node = Jackson.fromSensitiveJsonString(credentialsResponse, JsonNode.class);
            accessKey = node.get(ACCESS_KEY_ID);
            secretKey = node.get(SECRET_ACCESS_KEY);
            token = node.get(TOKEN);

            if (null == accessKey || null == secretKey) {
                throw new SdkClientException("Unable to load credentials. Access key or secret key are null.");
            }

            if (null != token) {
                credentials = new BasicSessionCredentials(accessKey.asText(),
                                                          secretKey.asText(),
                                                          token.asText(),
                                                          null,
                                                          providerName);
            } else {
                credentials = new BasicAWSCredentials(accessKey.asText(),
                                                      secretKey.asText(),
                                                      null,
                                                      providerName);
            }

            JsonNode expirationJsonNode = node.get("Expiration");
            if (null != expirationJsonNode) {
                /*
                 * TODO: The expiration string comes in a different format
                 * than what we deal with in other parts of the SDK, so we
                 * have to convert it to the ISO8601 syntax we expect.
                 */
                String expiration = expirationJsonNode.asText();
                expiration = expiration.replaceAll("\\+0000$", "Z");

                try {
                    credentialsExpiration = DateUtils.parseISO8601Date(expiration);
                    credentialExpirationRefreshTime = new Date(credentialsExpiration.getTime() - EXPIRATION_THRESHOLD);

                    LOG.debug("Successfully retrieved credentials with expiration " + expiration);
                } catch(Exception ex) {
                    handleError("Unable to parse credentials expiration date from Amazon EC2 instance", ex);
                }
            }
        } catch (Exception e) {
            handleError("Unable to load credentials from service endpoint", e);
        } finally {
            if (allowExpiredCredentials && credentials != null && isExpiring()) {
                // Try again in 50-70 seconds
                long now = clock.currentTimeMillis();
                long waitUntilNextRefresh = 50 * 1000 + JITTER.nextInt(20 * 1000 + 1);
                long nextRefreshTime = now + waitUntilNextRefresh;

                // Log if our next refresh will be after the credentials have expired. We want to treat the credentials as
                // expiring a little earlier than the actual expiration time, since the request may take a few seconds.
                long effectiveExpiration = credentialsExpiration.getTime() - 15 * 1000;
                if (nextRefreshTime > effectiveExpiration) {
                    LOG.warn("Credential expiration has been extended due to a credential service availability " +
                             "issue. A refresh of these credentials will be attempted again in " + waitUntilNextRefresh + " ms.");
                }

                this.credentialExpirationRefreshTime = new Date(nextRefreshTime);
            }
        }
    }

    /**
     * Handles reporting or throwing an error encountered while requesting
     * credentials from the Amazon EC2 endpoint. The Service could be
     * briefly unavailable for a number of reasons, so
     * we need to gracefully handle falling back to valid credentials if they're
     * available, and only throw exceptions if we really can't recover.
     *
     * @param errorMessage
     *            A human readable description of the error.
     * @param e
     *            The error that occurred.
     */
    private void handleError(String errorMessage, Exception e) {
        // If we don't have any valid credentials to fall back on, then throw an exception
        if (credentials == null || (!allowExpiredCredentials && expired())) {
            if (e instanceof SdkClientException) {
                throw (SdkClientException) e;
            }
            throw new SdkClientException(errorMessage, e);
        }

        // Otherwise, just log the error and continuing using the current credentials
        LOG.warn(errorMessage, e);
    }

    public void refresh() {
        credentials = null;
    }

    private boolean expired() {
        if (credentialsExpiration == null) {
            return false;
        }

        if (credentialsExpiration.getTime() > clock.currentTimeMillis()) {
            return false;
        }

        return true;
    }

    Date getCredentialsExpiration() {
        return credentialsExpiration;
    }

    @Override
    public String toString() {
        return "BaseCredentialsFetcher";
    }
}
