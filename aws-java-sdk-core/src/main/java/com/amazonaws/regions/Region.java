/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.util.ValidationUtils;

import java.lang.reflect.Constructor;
import java.util.Collection;

/**
 * Metadata for an AWS region, including its name and what services
 * are available in it.
 */
public class Region {

    private final RegionImpl regionImpl;

    public Region(RegionImpl regionImpl) {
        ValidationUtils.assertNotNull(regionImpl, "region implementation");
        this.regionImpl = regionImpl;
    }

    /**
     * Returns the region with the id given, or null if it cannot be found in
     * the current regions.xml file.
     */
    public static Region getRegion(Regions region) {
        return RegionUtils.getRegion(region.getName());
    }

    /**
     * The unique system ID for this region; ex: &quot;us-east-1&quot;.
     *
     * @return The unique system ID for this region.
     */
    public String getName() {
        return regionImpl.getName();
    }

    /**
     * Returns the domain for this region; ex: &quot;amazonaws.com&quot;.
     *
     * @return The domain for this region.
     */
    public String getDomain() {
        return regionImpl.getDomain();
    }

    /**
     * Returns the partition this region is in. I.E. 'aws' or 'aws-cn'
     *
     * @return The partition this region is in.
     */
    public String getPartition() {
        return regionImpl.getPartition();
    }

    /**
     * Returns the endpoint for the service given.
     *
     * @param endpointPrefix
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     */
    public String getServiceEndpoint(String endpointPrefix) {
        return regionImpl.getServiceEndpoint(endpointPrefix);
    }

    /**
     * Returns whether the given service is supported in this region.
     *
     * @param serviceName
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     */
    public boolean isServiceSupported(String serviceName) {
        return regionImpl.isServiceSupported(serviceName);
    }

    /**
     * Returns whether the given service support the https protocol in this region.
     *
     * @param serviceName
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     */
    public boolean hasHttpsEndpoint(String serviceName) {
        return regionImpl.hasHttpsEndpoint(serviceName);
    }

    /**
     * Returns whether the given service support the http protocol in this region.
     *
     * @param serviceName
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface,
     *         e.g. AmazonEC2.ENDPOINT_PREFIX.
     */
    public boolean hasHttpEndpoint(String serviceName) {
        return regionImpl.hasHttpEndpoint(serviceName);
    }

    /**
     * Returns a immutable collection of all endpoints available in the
     * metadata.
     */
    public Collection<String> getAvailableEndpoints() {
        return regionImpl.getAvailableEndpoints();
    }

    /**
     * Creates a new service client of the class given and configures it. If
     * credentials or config are null, defaults will be used.
     *
     * @param serviceClass The service client class to instantiate, e.g. AmazonS3Client.class
     * @param credentials  The credentials provider to use, or null for the default
     *                     credentials provider
     * @param config       The configuration to use, or null for the default
     *                     configuration
     * @deprecated use appropriate {@link com.amazonaws.client.builder.AwsClientBuilder} implementation
     *             for the service being constructed. For example:
     *             {@code AmazonSNSClientBuilder.standard().withRegion(region).build();}
     */
    @Deprecated
    public <T extends AmazonWebServiceClient> T createClient(Class<T> serviceClass,
                                                             AWSCredentialsProvider credentials,
                                                             ClientConfiguration config) {
        Constructor<T> constructor;
        T client;
        try {
            if (credentials == null && config == null) {
                constructor = serviceClass.getConstructor();
                client = constructor.newInstance();
            } else if (credentials == null) {
                constructor = serviceClass.getConstructor(ClientConfiguration.class);
                client = constructor.newInstance(config);
            } else if (config == null) {
                constructor = serviceClass.getConstructor(AWSCredentialsProvider.class);
                client = constructor.newInstance(credentials);
            } else {
                constructor = serviceClass.getConstructor(AWSCredentialsProvider.class, ClientConfiguration.class);
                client = constructor.newInstance(credentials, config);
            }

            client.setRegion(this);
            return client;
        } catch (Exception e) {
            throw new RuntimeException("Couldn't instantiate instance of " + serviceClass, e);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Region == false)
            return false;

        Region region = (Region) obj;
        return this.getName().equals(region.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }

}
