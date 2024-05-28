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
import com.amazonaws.internal.CredentialsEndpointProvider;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.*;

/**
 * <p>
 * {@link AWSCredentialsProvider} implementation that loads credentials
 * from an Amazon Elastic Container.
 * </p>
 * <p>
 * By default, the URI path is retrieved from the environment variable
 * "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" in the container's environment.
 * </p>
 *
 * <p>
 * <b>Migrating to the AWS SDK for Java v2</b>
 * <p>
 * The v2 equivalent of this class is
 * <a href="https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/auth/credentials/ContainerCredentialsProvider.html">ContainerCredentialsProvider</a>
 *
 * <p>
 * See <a href="https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/migration-client-credentials.html">Migration Guide</a>
 * for more information.
 */
public class ContainerCredentialsProvider implements AWSCredentialsProvider {

    /** Environment variable to get the Amazon ECS credentials resource path. */
    static final String ECS_CONTAINER_CREDENTIALS_PATH = "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI";

    /** Environment variable to get the full URI for a credentials path */
    static final String CONTAINER_CREDENTIALS_FULL_URI = "AWS_CONTAINER_CREDENTIALS_FULL_URI";

    static final String CONTAINER_AUTHORIZATION_TOKEN = "AWS_CONTAINER_AUTHORIZATION_TOKEN";

    private static final String HTTPS = "https";

    /** Default endpoint to retrieve the Amazon ECS Credentials. */
    private static final String ECS_CREDENTIALS_ENDPOINT = "http://169.254.170.2";

    private final ContainerCredentialsFetcher credentialsFetcher;

    /**
     * @deprecated use {@link #ContainerCredentialsProvider(CredentialsEndpointProvider)}
     */
    @Deprecated
    public ContainerCredentialsProvider() {
        this(new ECSCredentialsEndpointProvider());
    }

    public ContainerCredentialsProvider(CredentialsEndpointProvider credentialsEndpointProvider) {
        this.credentialsFetcher = new ContainerCredentialsFetcher(credentialsEndpointProvider);
    }

    @Override
    public AWSCredentials getCredentials() {
        return credentialsFetcher.getCredentials();
    }

    @Override
    public void refresh() {
        credentialsFetcher.refresh();
    }

    public Date getCredentialsExpiration() {
        return credentialsFetcher.getCredentialsExpiration();
    }


    static class ECSCredentialsEndpointProvider extends CredentialsEndpointProvider {
        @Override
        public URI getCredentialsEndpoint() {
            String path = System.getenv(ECS_CONTAINER_CREDENTIALS_PATH);
            if (path == null) {
                throw new SdkClientException(
                        "The environment variable " + ECS_CONTAINER_CREDENTIALS_PATH + " is empty");
            }

            return URI.create(ECS_CREDENTIALS_ENDPOINT + path);
        }
        @Override
        public CredentialsEndpointRetryPolicy getRetryPolicy() {
            return ContainerCredentialsRetryPolicy.getInstance();
        }

    }

    /**
     * A URI resolver that uses environment variable {@value CONTAINER_CREDENTIALS_FULL_URI} as the URI
     * for the metadata service.
     * Optionally an authorization token can be provided using the {@value CONTAINER_AUTHORIZATION_TOKEN} environment variable.
     */
    static class FullUriCredentialsEndpointProvider extends CredentialsEndpointProvider {

        @Override
        public URI getCredentialsEndpoint() {
            String fullUri = System.getenv(CONTAINER_CREDENTIALS_FULL_URI);
            if (fullUri == null || fullUri.length() == 0) {
                throw new SdkClientException("The environment variable " + CONTAINER_CREDENTIALS_FULL_URI + " is empty");
            }

            URI uri = URI.create(fullUri);

            if (!isHttps(uri) && !isAllowedHost(uri.getHost())) {
                throw new SdkClientException("The full URI (" + uri + ") contained withing environment variable " +
                        CONTAINER_CREDENTIALS_FULL_URI + " has an invalid host. Host should resolve to a loopback " +
                        "address or have the full URI be HTTPS.");
            }

            return uri;
        }

        @Override
        public Map<String, String> getHeaders() {
            if (System.getenv(CONTAINER_AUTHORIZATION_TOKEN) != null) {
                return Collections.singletonMap("Authorization", System.getenv(CONTAINER_AUTHORIZATION_TOKEN));
            }
            return new HashMap<String, String>();
        }

        private boolean isHttps(URI endpoint) {
            return Objects.equals(HTTPS, endpoint.getScheme());
        }

        /**
         * Determines if the addresses for a given host are resolved to a loopback address.
         * <p>
         *     This is a best-effort in determining what address a host will be resolved to. DNS caching might be disabled,
         *     or could expire between this check and when the API is invoked.
         * </p>
         * @param host The name or IP address of the host.
         * @return A boolean specifying whether the host is allowed as an endpoint for credentials loading.
         */
        private boolean isAllowedHost(String host) {
            try {
                InetAddress[] addresses = InetAddress.getAllByName(host);
                boolean allAllowed = true;
                for (InetAddress address: addresses) {
                    if (!isLoopbackAddress(address)) {
                        allAllowed = false;
                    }
                }

                return addresses.length > 0 && allAllowed;

            } catch (UnknownHostException e) {
                throw new SdkClientException(String.format("host (%s) could not be resolved to an IP address.", host), e);
            }
        }

        private boolean isLoopbackAddress(InetAddress inetAddress) {
            return inetAddress.isLoopbackAddress();
        }
    }

}
