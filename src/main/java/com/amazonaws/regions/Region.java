/*
 * Copyright 2013-2014 Amazon Technologies, Inc. 
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
package com.amazonaws.regions;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;

/**
 * Metadata for an AWS region, including its name and what services
 * are available in it.
 */
public final class Region {

    private static final String DEFAULT_DOMAIN = "amazonaws.com";

    private final String name;
    private final String domain;

    private final Map<String, String> serviceEndpoints =
        new HashMap<String, String>();

    private final Map<String, Boolean> httpSupport =
        new HashMap<String, Boolean>();

    private final Map<String, Boolean> httpsSupport =
        new HashMap<String, Boolean>();

    Region(final String name, final String domain) {
        this.name = name;

        if (domain == null) {
            this.domain = DEFAULT_DOMAIN;
        } else {
            this.domain = domain;
        }
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
        return name;
    }

    /**
     * Returns the domain for this region; ex: &quot;amazonaws.com&quot;.
     *
     * @return The domain for this region.
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Returns a map of the available services in this region and their
     * endpoints. The keys of the map are service abbreviations, as defined in
     * {@link ServiceAbbreviations}, and the values are the endpoint URLs.
     * 
     * @return A map of the available services in this region.
     */
    Map<String, String> getServiceEndpoints() {
        return serviceEndpoints;
    }

    Map<String, Boolean> getHttpSupport() {
        return httpSupport;
    }

    Map<String, Boolean> getHttpsSupport() {
        return httpsSupport;
    }

    /**
     * Returns the endpoint for the service given.
     * 
     * @see ServiceAbbreviations
     */
    public String getServiceEndpoint(String serviceName) {
        return serviceEndpoints.get(serviceName);
    }

    /**
     * Returns whether the given service is supported in this region.
     * 
     * @see ServiceAbbreviations
     */
    public boolean isServiceSupported(String serviceName) {
        return serviceEndpoints.containsKey(serviceName);
    }
    
    /**
     * Returns whether the given service support the https protocol in this region.
     * 
     * @see ServiceAbbreviations
     */
    public boolean hasHttpsEndpoint(String serviceName) {
        return httpsSupport.containsKey(serviceName) && httpsSupport.get(serviceName);
    }

    /**
     * Returns whether the given service support the http protocol in this region.
     * 
     * @see ServiceAbbreviations
     */
    public boolean hasHttpEndpoint(String serviceName) {
        return httpSupport.containsKey(serviceName) && httpSupport.get(serviceName);
    }    
    
    /**
     * Creates a new service client of the class given and configures it. If
     * credentials or config are null, defaults will be used.
     * 
     * @param serviceClass
     *            The service client class to instantiate, e.g. AmazonS3Client.class
     * @param credentials
     *            The credentials provider to use, or null for the default
     *            credentials provider
     * @param config
     *            The configuration to use, or null for the default
     *            configuration
     *            
     * @see ServiceAbbreviations
     */
    public <T extends AmazonWebServiceClient> T createClient(Class<T> serviceClass,
                                                             AWSCredentialsProvider credentials,
                                                             ClientConfiguration config) {
        Constructor<T> constructor;
        T client;
        try {
            if ( credentials == null && config == null ) {
                constructor = serviceClass.getConstructor();
                client = constructor.newInstance();
            } else if ( credentials == null ) {
                constructor = serviceClass.getConstructor(ClientConfiguration.class);
                client = constructor.newInstance(config);
            } else if ( config == null ) {
                constructor = serviceClass.getConstructor(AWSCredentialsProvider.class);
                client = constructor.newInstance(credentials);
            } else {
                constructor = serviceClass.getConstructor(AWSCredentialsProvider.class, ClientConfiguration.class);
                client = constructor.newInstance(credentials, config);
            }
            
            client.setRegion(this);
            return client;
        } catch ( Exception e ) {
            throw new RuntimeException("Couldn't instantiate instance of " + serviceClass, e);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Region == false )
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
