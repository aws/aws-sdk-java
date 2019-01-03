/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.AwsRegionProvider;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.regions.Regions;
import java.net.URI;

/**
 * Fluent builder for {@link AmazonKinesisVideoPutMedia}. An instance of this builder may be obtained via {@link
 * AmazonKinesisVideoPutMediaClient#builder()} or via {@link AmazonKinesisVideoPutMediaClientBuilder#standard()}.
 **/
public final class AmazonKinesisVideoPutMediaClientBuilder {

    /**
     * Default Region Provider chain. Used only when the builder is not explicitly configured with a
     * region.
     */
    private static final AwsRegionProvider DEFAULT_REGION_PROVIDER = new DefaultAwsRegionProviderChain();

    private static final int DEFAULT_CONNECTION_TIMEOUT = 10000;

    private AWSCredentialsProvider credentialsProvider;
    private String region;
    private URI endpoint;
    private Integer connectionTimeoutInMillis;
    private Integer numberOfThreads;

    AmazonKinesisVideoPutMediaClientBuilder() {
    }

    /**
     * @return A new instance of builder with all defaults set.
     */
    public static AmazonKinesisVideoPutMediaClientBuilder standard() {
        return new AmazonKinesisVideoPutMediaClientBuilder();
    }

    /**
     * @return The {@link AWSCredentialsProvider} currently configured in the builder.
     */
    public AWSCredentialsProvider getCredentials() {
        return credentialsProvider;
    }

    /**
     * Sets the {@link AWSCredentialsProvider} used by the client. If not specified then {@link
     * DefaultAWSCredentialsProviderChain} is used.
     *
     * @param credentialsProvider New {@link AWSCredentialsProvider} to use.
     * @see <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html">Working With AWS Credentials</a>
     */
    public void setCredentials(AWSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

    /**
     * Sets the {@link AWSCredentialsProvider} used by the client. If not specified then {@link
     * DefaultAWSCredentialsProviderChain} is used.
     *
     * @param credentialsProvider New {@link AWSCredentialsProvider} to use.
     * @return This object for method chaining.
     * @see <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html">Working With AWS Credentials</a>
     */
    public AmazonKinesisVideoPutMediaClientBuilder withCredentials(AWSCredentialsProvider credentialsProvider) {
        setCredentials(credentialsProvider);
        return this;
    }

    /**
     * @return The region currently configured in the builder.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the signing region to be used by the client. This region will <b>NOT</b> be used to compute the endpoint, the endpoint
     * must be explicitly provided via the {@link #setEndpoint(URI)} or {@link #withEndpoint(URI)} methods.
     *
     * @param region Region to sign with.
     * @see <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html">AWS Region Selection</a>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Sets the signing region to be used by the client. This region will <b>NOT</b> be used to compute the endpoint, the endpoint
     * must be explicitly provided via the {@link #setEndpoint(URI)} or {@link #withEndpoint(URI)} methods.
     *
     * @param region Region to sign with.
     * @return This object for method chaining.
     * @see <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html">AWS Region Selection</a>
     */
    public AmazonKinesisVideoPutMediaClientBuilder withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * Sets the signing region to be used by the client. This region will <b>NOT</b> be used to compute the endpoint, the endpoint
     * must be explicitly provided via the {@link #setEndpoint(URI)} or {@link #withEndpoint(URI)} methods.
     *
     * <p>
     * For regions that are not in the {@link Regions} enum, {@link #setRegion(String)} or {@link #withRegion(String)} should
     * be used instead.
     * </p>
     *
     * @param region Region to sign with.
     * @return This object for method chaining.
     * @see <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html">AWS Region Selection</a>
     */
    public AmazonKinesisVideoPutMediaClientBuilder withRegion(Regions region) {
        setRegion(region.getName());
        return this;
    }

    /**
     * @return The currently configured connection timeout in milliseconds.
     */
    public Integer getConnectionTimeoutInMillis() {
        return connectionTimeoutInMillis;
    }

    /**
     * Sets the timeout (in milliseconds) when establishing new connections to the service. The default if not specified is
     * {@value #DEFAULT_CONNECTION_TIMEOUT} milliseconds.
     *
     * @param connectionTimeoutInMillis New connection timeout value in milliseconds.
     */
    public void setConnectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
        this.connectionTimeoutInMillis = connectionTimeoutInMillis;
    }

    /**
     * Sets the timeout (in milliseconds) when establishing new connections to the service. The default if not specified is
     * {@value #DEFAULT_CONNECTION_TIMEOUT} milliseconds.
     *
     * @param connectionTimeoutInMillis New connection timeout value in milliseconds.
     * @return This object for method chaining.
     */
    public AmazonKinesisVideoPutMediaClientBuilder withConnectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
        setConnectionTimeoutInMillis(connectionTimeoutInMillis);
        return this;
    }

    /**
     * @return The currently configured endpoint used to contact the service.
     */
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the endpoint to make requests against.
     *
     * @param endpoint Endpoint to use.
     */
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets the endpoint to make requests against.
     *
     * @param endpoint Endpoint to use.
     * @return This object for method chaining.
     */
    public AmazonKinesisVideoPutMediaClientBuilder withEndpoint(URI endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * Sets the endpoint to make requests against.
     *
     * @param endpoint Endpoint to use.
     * @return This object for method chaining.
     */
    public AmazonKinesisVideoPutMediaClientBuilder withEndpoint(String endpoint) {
        setEndpoint(URI.create(endpoint));
        return this;
    }

    /**
     * @return The currently configured number of threads for the async event loop.
     */
    public Integer getNumberOfThreads() {
        return this.numberOfThreads;
    }

    /**
     * Sets the number of threads to use in the async event loop. Higher values allow for higher
     * numbers of concurrent requests.
     *
     * @param numberOfThreads Number of threads to use in the event loop.
     */
    public void setNumberOfThreads(Integer numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    /**
     * Sets the number of threads to use in the async event loop. Higher values allow for higher
     * numbers of concurrent requests.
     *
     * @param numberOfThreads Number of threads to use in the event loop.
     * @return This object for method chaining.
     */
    public AmazonKinesisVideoPutMediaClientBuilder withNumberOfThreads(Integer numberOfThreads) {
        setNumberOfThreads(numberOfThreads);
        return this;
    }

    private String resolveRegion() {
        return region == null ? determineRegionFromRegionProvider() : region;
    }

    /**
     * Attempt to determine the region from the configured region provider. This will return null in the event that the
     * region provider could not determine the region automatically.
     */
    private String determineRegionFromRegionProvider() {
        try {
            return DEFAULT_REGION_PROVIDER.getRegion();
        } catch (SdkClientException e) {
            // The AwsRegionProviderChain that is used by default throws an exception instead of returning null when
            // the region is not defined. For that reason, we have to support both throwing an exception and returning
            // null as the region not being defined.
            return null;
        }
    }

    private AWSCredentialsProvider resolveCredentialsProvider() {
        return credentialsProvider == null ? DefaultAWSCredentialsProviderChain.getInstance() : credentialsProvider;
    }

    private int resolveConnectionTimeoutInMillis() {
        return connectionTimeoutInMillis == null ? DEFAULT_CONNECTION_TIMEOUT : connectionTimeoutInMillis;
    }

    public AmazonKinesisVideoPutMedia build() {
        return new AmazonKinesisVideoPutMediaClient(resolveRegion(),
                                              resolveCredentialsProvider(),
                                              resolveConnectionTimeoutInMillis(),
                                              endpoint,
                                              numberOfThreads);
    }
}
