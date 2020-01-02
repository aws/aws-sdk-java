/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.internal.EC2ResourceFetcher;
import com.amazonaws.internal.InstanceMetadataServiceResourceFetcher;
import com.amazonaws.retry.internal.CredentialsEndpointRetryParameters;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;
import com.amazonaws.util.EC2MetadataUtils;
import java.net.URI;

/**
 * Fetches credential from EC2 instance metadata service.
 */
@SdkInternalApi
final class InstanceMetadataServiceCredentialsFetcher extends BaseCredentialsFetcher implements CredentialsEndpointRetryPolicy {

    private final EC2ResourceFetcher resourceFetcher;

    InstanceMetadataServiceCredentialsFetcher() {
        this.resourceFetcher = InstanceMetadataServiceResourceFetcher.getInstance();
    }

    @SdkTestInternalApi
    InstanceMetadataServiceCredentialsFetcher(EC2ResourceFetcher resourceFetcher) {
        this.resourceFetcher = resourceFetcher;
    }

    @Override
    protected String getCredentialsResponse() {
        URI credentialsEndpoint = getCredentialsEndpoint();
        return resourceFetcher.readResource(credentialsEndpoint, this);
    }

    @Override
    public String toString() {
        return "InstanceMetadataServiceCredentialsFetcher";
    }

    private URI getCredentialsEndpoint() {
        String host = EC2MetadataUtils.getHostAddressForEC2MetadataService();

        String securityCredentialsList = resourceFetcher.readResource(URI.create(host + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE), this);

        String[] securityCredentials = securityCredentialsList.trim().split("\n");
        if (securityCredentials.length == 0) {
            throw new SdkClientException("Unable to load credentials path");
        }

        return URI.create(host + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE + securityCredentials[0]);
    }

    @Override
    public boolean shouldRetry(int retriesAttempted, CredentialsEndpointRetryParameters retryParams) {
        return false;
    }
}
