/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.EC2MetadataClient;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Credentials provider implementation that loads credentials from the Amazon
 * EC2 Instance Metadata Service.
 */
public class InstanceProfileCredentialsProvider implements AWSCredentialsProvider {

    private static final Log LOG = LogFactory.getLog(InstanceProfileCredentialsProvider.class);

    /**
     * The threshold after the last attempt to load credentials (in
     * milliseconds) at which credentials are attempted to be refreshed.
     */
    private static final int REFRESH_THRESHOLD = 1000 * 60 * 60;

    /**
     * The threshold before credentials expire (in milliseconds) at which
     * this class will attempt to load new credentials.
     */
    private static final int EXPIRATION_THRESHOLD = 1000 * 60 * 15;

    /** The name of the Json Object that contains the access key.*/
    private static final String ACCESS_KEY_ID = "AccessKeyId";

    /** The name of the Json Object that contains the secret access key.*/
    private static final String SECRET_ACCESS_KEY = "SecretAccessKey";

    /** The name of the Json Object that contains the token.*/
    private static final String TOKEN = "Token";

    /**
     * The wait time, after which the background thread initiates a refresh to
     * load latest credentials if needed.
     */
    private static final int ASYNC_REFRESH_INTERVAL_TIME_MINUTES= 1;


    /** The current instance profile credentials */
    protected volatile AWSCredentials credentials;

    /** The expiration for the current instance profile credentials */
    protected volatile Date credentialsExpiration;

    /** The time of the last attempt to check for new credentials */
    protected volatile Date lastInstanceProfileCheck;

    /**
     * The executor service used for refreshing the credentials in the
     * background.
     */
    private volatile ScheduledExecutorService executor;

    public InstanceProfileCredentialsProvider() {
        this(false);
    }

    /**
     * Spins up a new thread to refresh the credentials asynchronously if
     * refreshCredentialsAsync is set to true, otherwise the credentials will be
     * refreshed from the instance metadata service synchronously,
     *
     * @param refreshCredentialsAsync
     *            true if credentials needs to be refreshed asynchronously else
     *            false.
     */
    public InstanceProfileCredentialsProvider(boolean refreshCredentialsAsync) {
        if (refreshCredentialsAsync) {
            executor = Executors.newScheduledThreadPool(1);
            executor.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    try {
                        getCredentials();
                    } catch (AmazonClientException ace) {
                        handleError(ace);
                    } catch (RuntimeException re) {
                        handleError(re);
                    } catch (Error e) {
                        handleError(e);
                    }
                }
            }, 0, ASYNC_REFRESH_INTERVAL_TIME_MINUTES, TimeUnit.MINUTES);
        }
    }

    private void handleError(Throwable t) {
        credentials = null;
        LOG.error(t.getMessage(), t);
    }

    public AWSCredentials getCredentials() {
        if (needsToLoadCredentials())
            loadCredentials();
        if (expired()) {
            throw new AmazonClientException(
                    "The credentials received from the Amazon EC2 metadata service have expired");
        }
        return credentials;
    }

    public void refresh() {
        credentials = null;
    }

    protected boolean needsToLoadCredentials() {
        if (credentials == null) return true;

        if (credentialsExpiration != null) {
            if (isWithinExpirationThreshold()) return true;
        }

        if (lastInstanceProfileCheck != null) {
            if (isPastRefreshThreshold()) return true;
        }

        return false;
    }

    /**
     * Returns true if the current credentials are within the expiration
     * threshold, and therefore, should be refreshed.
     */
    private boolean isWithinExpirationThreshold() {
        return (credentialsExpiration.getTime() - System.currentTimeMillis()) < EXPIRATION_THRESHOLD;
    }

    /**
     * Returns true if the last attempt to refresh credentials is beyond the
     * refresh threshold, and therefore the credentials should attempt to be
     * refreshed.
     */
    private boolean isPastRefreshThreshold() {
        return (System.currentTimeMillis() - lastInstanceProfileCheck.getTime()) > REFRESH_THRESHOLD;
    }

    private boolean expired() {
        if (credentialsExpiration != null) {
            if (credentialsExpiration.getTime() < System.currentTimeMillis()) {
                return true;
            }
        }

        return false;
    }

    private synchronized void loadCredentials() {
        if (!needsToLoadCredentials()) return;

        JsonNode accessKey;
        JsonNode secretKey;
        JsonNode node;
        JsonNode token;
        try {
            lastInstanceProfileCheck = new Date();
            String credentialsResponse = new EC2MetadataClient()
                    .getDefaultCredentials();

            node = Jackson.jsonNodeOf(credentialsResponse);
            accessKey = node.get(ACCESS_KEY_ID);
            secretKey = node.get(SECRET_ACCESS_KEY);
            token = node.get(TOKEN);

            if (null == accessKey || null == secretKey) {
                throw new AmazonClientException("Unable to load credentials.");
            }

            if (null != token) {
                credentials = new BasicSessionCredentials(accessKey.asText(),
                        secretKey.asText(), token.asText());
            } else {
                credentials = new BasicAWSCredentials(accessKey.asText(),
                        secretKey.asText());
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
                } catch(Exception ex) {
                    handleError("Unable to parse credentials expiration date from Amazon EC2 metadata service", ex);
                }
            }
        } catch (JsonMappingException e) {
            handleError("Unable to parse credentials from Amazon EC2 metadata service", e);
        } catch (IOException e) {
            handleError("Unable to load credentials from Amazon EC2 metadata service", e);
        }
    }

    /**
     * Handles reporting or throwing an error encountered while requesting
     * credentials from the Amazon EC2 Instance Metadata Service. The Instance
     * Metadata Service could be briefly unavailable for a number of reasons, so
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
        if (credentials == null || expired())
            throw new AmazonClientException(errorMessage, e);

        // Otherwise, just log the error and continuing using the current credentials
        LOG.debug(errorMessage, e);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    protected void finalize() throws Throwable {
        if (executor != null) {
            executor.shutdownNow();
        }
    }
}
