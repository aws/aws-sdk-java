/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.retry.PredefinedBackoffStrategies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.IDPCommunicationErrorException;
import com.amazonaws.services.securitytoken.model.InvalidIdentityTokenException;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

public class STSAssumeRoleWithWebIdentitySessionCredentialsProvider implements AWSSessionCredentialsProvider, Closeable {

    /**
     * The client for starting STS sessions.
     */
    private final AWSSecurityTokenService securityTokenService;

    /**
     * The arn of the role to be assumed.
     */
    private final String roleArn;

    /**
     * An identifier for the assumed role session.
     */
    private final String roleSessionName;

    /**
     * Absolute path to the JWT file containing the web identity token.
     */
    private final String webIdentityTokenFile;

    private final Callable<SessionCredentialsHolder> refreshCallable = new Callable<SessionCredentialsHolder>() {
        @Override
        public SessionCredentialsHolder call() throws Exception {
            return newSession();
        }
    };

    /**
     * Handles the refreshing of sessions. Ideally this should be final but #setSTSClientEndpoint
     * forces us to create a new one.
     */
    private volatile RefreshableTask<SessionCredentialsHolder> refreshableTask;

    private RefreshableTask<SessionCredentialsHolder> createRefreshableTask() {
        return new RefreshableTask.Builder<SessionCredentialsHolder>()
                .withRefreshCallable(refreshCallable)
                .withBlockingRefreshPredicate(new ShouldDoBlockingSessionRefresh())
                .withAsyncRefreshPredicate(new ShouldDoAsyncSessionRefresh()).build();
    }

    /**
     * The following private constructor reads state from the builder and sets the appropriate
     * parameters accordingly
     * <p>
     * When public constructors are called, this constructors is deferred to with a null value for
     * roleExternalId and endpoint The inner Builder class can be used to construct an object that
     * actually has a value for roleExternalId and endpoint
     *
     * @throws IllegalArgumentException if both an AWSCredentials and AWSCredentialsProvider have
     *                                  been set on the builder
     */
    private STSAssumeRoleWithWebIdentitySessionCredentialsProvider(Builder builder) {
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;
        this.webIdentityTokenFile = builder.webIdentityTokenFile;
        this.securityTokenService = buildStsClient(builder);
        this.refreshableTask = createRefreshableTask();
    }

    /**
     * Construct a new STS client from the settings in the builder.
     *
     * @param builder Configured builder
     * @return New instance of AWSSecurityTokenService
     * @throws IllegalArgumentException if builder configuration is inconsistent
     */
    private static AWSSecurityTokenService buildStsClient(Builder builder) throws IllegalArgumentException {
        if (builder.sts != null) {
            return builder.sts;
        }

        RetryPolicy retryPolicy = new RetryPolicy(
                new StsRetryCondition(),
                new PredefinedBackoffStrategies.SDKDefaultBackoffStrategy(),
                3,
                true);

        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setRetryPolicy(retryPolicy);

        return AWSSecurityTokenServiceClientBuilder.standard()
                                                   .withClientConfiguration(clientConfiguration)
                                                   .withCredentials(new AWSStaticCredentialsProvider(new AnonymousAWSCredentials()))
                                                   .build();
    }

    @Override
    public AWSSessionCredentials getCredentials() {
        return refreshableTask.getValue().getSessionCredentials();
    }

    @Override
    public void refresh() {
        refreshableTask.forceGetValue();
    }

    /**
     * Starts a new session by sending a request to the AWS Security Token Service (STS) to assume a
     * Role using the long lived AWS credentials. This class then vends the short lived session
     * credentials for the assumed Role sent back from STS.
     */
    private SessionCredentialsHolder newSession() {
        AssumeRoleWithWebIdentityRequest assumeRoleRequest = new AssumeRoleWithWebIdentityRequest()
                .withRoleArn(roleArn)
                .withWebIdentityToken(getWebIdentityToken())
                .withRoleSessionName(roleSessionName);

        AssumeRoleWithWebIdentityResult assumeRoleResult = securityTokenService.assumeRoleWithWebIdentity(assumeRoleRequest);
        return new SessionCredentialsHolder(assumeRoleResult.getCredentials());
    }

    private String getWebIdentityToken() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(webIdentityTokenFile), "UTF-8"));
            return br.readLine();
        } catch (FileNotFoundException e) {
            throw new SdkClientException("Unable to locate specified web identity token file: " + webIdentityTokenFile);
        } catch (IOException e) {
            throw new SdkClientException("Unable to read web identity token from file: " + webIdentityTokenFile);
        } finally {
            try {
                br.close();
            } catch (Exception ignored) {

            }
        }
    }

    /**
     * Shut down this credentials provider, shutting down the thread that performs asynchronous credential refreshing. This
     * should not be invoked if the credentials provider is still in use by an AWS client.
     */
    @Override
    public void close() {
        refreshableTask.close();
    }

    /**
     * Provides a builder pattern to avoid combinatorial explosion of the number of parameters that
     * are passed to constructors. The builder introspects which parameters have been set and calls
     * the appropriate constructor.
     */
    public static final class Builder {

        private final String roleArn;
        private final String roleSessionName;
        private final String webIdentityTokenFile;

        private AWSSecurityTokenService sts;

        /**
         * @param roleArn         Required roleArn parameter used when starting a session
         * @param roleSessionName Required roleSessionName parameter used when starting a session
         */
        public Builder(String roleArn, String roleSessionName, String webIdentityTokenFile) {
            if (roleArn == null || roleSessionName == null || webIdentityTokenFile == null) {
                throw new NullPointerException(
                        "You must specify a value for roleArn, roleSessionName and webIdentityTokenFile");
            }
            this.roleArn = roleArn;
            this.roleSessionName = roleSessionName;
            this.webIdentityTokenFile = webIdentityTokenFile;
        }

        /**
         * Sets a preconfigured STS client to use for the credentials provider. See {@link
         * com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder} for an easy
         * way to configure and create an STS client.
         *
         * @param sts Custom STS client to use.
         * @return This object for chained calls.
         */
        public Builder withStsClient(AWSSecurityTokenService sts) {
            this.sts = sts;
            return this;
        }

        /**
         * Build the configured provider
         *
         * @return the configured STSAssumeRoleSessionCredentialsProvider
         */
        public STSAssumeRoleWithWebIdentitySessionCredentialsProvider build() {
            return new STSAssumeRoleWithWebIdentitySessionCredentialsProvider(this);
        }
    }

    private static class StsRetryCondition implements com.amazonaws.retry.RetryPolicy.RetryCondition {

        @Override
        public boolean shouldRetry(AmazonWebServiceRequest originalRequest,
                                   AmazonClientException exception,
                                   int retriesAttempted) {
            // Always retry on client exceptions caused by IOException
            if (exception.getCause() instanceof IOException) return true;

            if (exception.getCause() instanceof InvalidIdentityTokenException) return true;

            if (exception.getCause() instanceof IDPCommunicationErrorException) return true;

            // Only retry on a subset of service exceptions
            if (exception instanceof AmazonServiceException) {
                AmazonServiceException ase = (AmazonServiceException)exception;

                /*
                 * For 500 internal server errors and 503 service
                 * unavailable errors, we want to retry, but we need to use
                 * an exponential back-off strategy so that we don't overload
                 * a server with a flood of retries.
                 */
                if (RetryUtils.isRetryableServiceException(ase)) return true;

                /*
                 * Throttling is reported as a 400 error from newer services. To try
                 * and smooth out an occasional throttling error, we'll pause and
                 * retry, hoping that the pause is long enough for the request to
                 * get through the next time.
                 */
                if (RetryUtils.isThrottlingException(ase)) return true;

                /*
                 * Clock skew exception. If it is then we will get the time offset
                 * between the device time and the server time to set the clock skew
                 * and then retry the request.
                 */
                if (RetryUtils.isClockSkewError(ase)) return true;
            }

            return false;
        }

    }
}
