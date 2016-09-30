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
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.CredentialsEndpointProvider;
import com.amazonaws.internal.EC2CredentialsUtils;
import com.amazonaws.util.EC2MetadataUtils;

/**
 * Credentials provider implementation that loads credentials from the Amazon
 * EC2 Instance Metadata Service.
 */
public class InstanceProfileCredentialsProvider implements AWSCredentialsProvider {

    private static final Log LOG = LogFactory.getLog(InstanceProfileCredentialsProvider.class);

    /**
     * The wait time, after which the background thread initiates a refresh to
     * load latest credentials if needed.
     */
    private static final int ASYNC_REFRESH_INTERVAL_TIME_MINUTES = 1;

    /**
     * The default InstanceProfileCredentialsProvider that can be shared by
     * multiple CredentialsProvider instance threads to shrink the amount of
     * requests to EC2 metadata service.
     */
    private static final InstanceProfileCredentialsProvider INSTANCE
        = new InstanceProfileCredentialsProvider();

    private final EC2CredentialsFetcher credentialsFetcher;

    /**
     * The executor service used for refreshing the credentials in the
     * background.
     */
    private volatile ScheduledExecutorService executor;

    /**
     * @deprecated for the singleton method {@link #getInstance()}.
     */
    @Deprecated
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
        credentialsFetcher = new EC2CredentialsFetcher(new InstanceMetadataCredentialsEndpointProvider());

        if (refreshCredentialsAsync) {
            executor = Executors.newScheduledThreadPool(1);
            executor.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    try {
                        credentialsFetcher.getCredentials();
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

    /**
     * Returns a singleton {@link InstanceProfileCredentialsProvider} that does not refresh credentials
     * asynchronously. Use {@link #InstanceProfileCredentialsProvider(boolean)} for the feature.
     */
    public static InstanceProfileCredentialsProvider getInstance() {
        return INSTANCE;
    }

    private void handleError(Throwable t) {
        refresh();
        LOG.error(t.getMessage(), t);
    }

    @Override
    protected void finalize() throws Throwable {
        if (executor != null) {
            executor.shutdownNow();
        }
    }


    @Override
    public AWSCredentials getCredentials() {
        return credentialsFetcher.getCredentials();
    }

    @Override
    public void refresh() {
        credentialsFetcher.refresh();
    }

    private static class InstanceMetadataCredentialsEndpointProvider extends CredentialsEndpointProvider {
        @Override
        public URI getCredentialsEndpoint() throws URISyntaxException, IOException {
            String host = EC2MetadataUtils.getHostAddressForEC2MetadataService();

            String securityCredentialsList = EC2CredentialsUtils.getInstance().readResource(new URI(host + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE));
            String[] securityCredentials = securityCredentialsList.trim().split("\n");
            if (securityCredentials.length == 0) {
                throw new AmazonClientException("Unable to load credentials path");
            }

            return new URI(host + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE + securityCredentials[0]);
        }
    }

}
