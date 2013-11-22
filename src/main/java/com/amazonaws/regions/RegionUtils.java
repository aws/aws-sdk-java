/*
 * Copyright 2013-2013 Amazon Technologies, Inc.
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

import static com.amazonaws.SDKGlobalConfiguration.REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import com.amazonaws.util.VersionInfoUtils;

/**
 * Utilities for working with regions.
 */
public class RegionUtils {

    // The CNAME "https://aws-sdk-configurations.amazonwebservices.com/" does not have a valid security cert,
    // so we instead use the "*.cloudfront.net" endpoint to enable HTTPS access to the regions file.
    private static final String CLOUDFRONT_DISTRO = "https://d3s62xsdspbbg2.cloudfront.net/endpoints.xml";
    
    // If we cannot get the regions file from the cloudfront distribution, we first
    // switch to the S3 bucket origin before fall back to using the local file.
    private static final String S3_BUCKET_ORIGIN_ENDPOINT = "https://aws-sdk-configurations.s3.amazonaws.com/endpoints.xml";
    
    // If all things failed, this is the fall back config file. 
    private static final String FALLBACK = "/etc/regions.xml";
    
    private static List<Region> regions;

    // Use the same logger as the http client
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    /**
     * Returns a list of the available AWS regions.
     */
    public synchronized static List<Region> getRegions() {
        if ( regions == null ) {
            init();
        }

        return regions;
    }

    /**
     * Returns a list of the regions that support the service given.
     *
     * @see ServiceAbbreviations
     */
    public synchronized static List<Region> getRegionsForService(String serviceAbbreviation) {
        List<Region> regions = new LinkedList<Region>();
        for ( Region r : getRegions() ) {
            if ( r.isServiceSupported(serviceAbbreviation) ) {
                regions.add(r);
            }
        }
        return regions;
    }

    /**
     * Returns the region with the id given, if it exists. Otherwise, returns
     * null.
     */
    public static Region getRegion(String regionName) {
        for ( Region r : getRegions() ) {
            if ( r.getName().equals(regionName) ) {
                return r;
            }
        }

        return null;
    }

    /**
     * Searches through all known regions to find one with any service at the
     * specified endpoint. If no region is found with a service at that
     * endpoint, an exception is thrown.
     *
     * @param endpoint
     *            The endpoint for any service residing in the desired region.
     * @return The region containing any service running at the specified
     *         endpoint, otherwise an exception is thrown if no region is found
     *         with a service at the specified endpoint.
     * @throws MalformedURLException
     *             If the given URL is malformed, or if the one of the service
     *             URLs on record is malformed.
     */
    public static Region getRegionByEndpoint(String endpoint) {
    	URI targetEndpointUri = getUriByEndpoint(endpoint);
    	String targetHost = targetEndpointUri.getHost();

        for ( Region region : getRegions() ) {
            for ( String serviceEndpoint : region.getServiceEndpoints().values() ) {
                URI serviceEndpointUrl = getUriByEndpoint(serviceEndpoint);
                
                if ( serviceEndpointUrl.getHost().equals(targetHost) )
                    return region;
            }
        }

        throw new RuntimeException("No region found with any service for endpoint " + endpoint);
    }

    /**
     * Fetches the most recent version of the regions file from the remote
     * source and caches it to the workspace metadata directory, then
     * initializes the static list of regions with it.
     */
    public static synchronized void init() {
        if ( System.getProperty(REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY) != null ) {
            try {
                loadRegionsFromOverrideFile();
            } catch ( FileNotFoundException e ) {
                throw new RuntimeException("Couldn't find regions override file specified", e);
            }
        } else {
            try {
                InputStream regionsFile = getRegionsFileFromCloudfront();
                initRegions(regionsFile, true);
            } catch ( Exception e ) {
                log.warn("Failed to initialize regional endpoints from cloudfront", e);
                regions = null;
            }
            
            if ( regions == null ) {
                // Switch to the S3 bucket origin endpoint
                try {
                    InputStream regionsFile = getRegionsFileFromS3Bucket();
                    initRegions(regionsFile, true);
                } catch ( Exception e ) {
                    log.warn("Failed to initialize regional endpoints from S3 bucket", e);
                    regions = null;
                }
            }
        }

        // Fall back onto the version we ship with the SDK
        if ( regions == null ) {
            initSDKRegions();
        }
        // Throw out RuntimeException explicitly
        if ( regions == null ) {
            throw new RuntimeException("Failed to initialize the regions.");
        }
    }

    private static void loadRegionsFromOverrideFile() throws FileNotFoundException {
        String overrideFilePath = System.getProperty(REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY);
        if ( log.isDebugEnabled() ) {
            log.debug("Using local override of the regions file (" 
                        + overrideFilePath
                        + ") to initiate regions data...");
        }
        File regionsFile = new File(overrideFilePath);
        FileInputStream override = new FileInputStream(regionsFile);
        // Disable endpoint verification
        initRegions(override, false);
    }

    /**
     * Tries to initialize the regions list from the stream given.
     * 
     * @param regionsFile
     *            The input stream pointing to the retrieved region file.
     *            
     * @param enableEndpointVerification
     *            Whether to verify each endpoint when parsing the regions file.
     *            (This should be disabled when regions file override is being
     *            used.)
     */
    private static void initRegions(InputStream regionsFile, boolean enableEndpointVerification) {
        try {
            RegionMetadataParser parser = new RegionMetadataParser();
            regions = parser.parseRegionMetadata(regionsFile, enableEndpointVerification);
        } catch ( Exception e ) {
            log.warn("Failed to parse regional endpoints", e);
        }
    }

    /**
     * Failsafe method to initialize the regions list from the list bundled with
     * the SDK, in case it cannot be fetched from the remote source.
     */
    private static void initSDKRegions() {
        if ( log.isDebugEnabled() ) {
            log.debug("Initializing the regions from the region file bundled with the SDK...");
        }
        InputStream inputStream = RegionUtils.class.getResourceAsStream(FALLBACK);
        initRegions(inputStream, true);
    }

    /**
     * Fetches the regions file from the cloudfront distribution and returns an input stream to it.
     */
    private static InputStream getRegionsFileFromCloudfront() throws IOException {
        String endpointsUrl = CLOUDFRONT_DISTRO;
        if ( log.isDebugEnabled() ) {
            log.debug("Retreiving regions file from the cloudfront distribution: " + endpointsUrl);
        }
        return fetchFile(endpointsUrl);
    }
    
    /**
     * Fetches the regions file from the S3 bucket and returns an input stream to it.
     */
    private static InputStream getRegionsFileFromS3Bucket() throws IOException {
        String endpointsUrl = S3_BUCKET_ORIGIN_ENDPOINT;
        if ( log.isDebugEnabled() ) {
            log.debug("Retreiving regions file from the S3 bucket: " + endpointsUrl);
        }
        return fetchFile(endpointsUrl);
    }

    /**
     * Fetches a file from the URL given and returns an input stream to it.
     */
    private static InputStream fetchFile(String url) throws IOException, ClientProtocolException,
            FileNotFoundException {

        HttpParams httpClientParams = new BasicHttpParams();
        HttpProtocolParams.setUserAgent(httpClientParams, VersionInfoUtils.getUserAgent());
        HttpClient httpclient = new DefaultHttpClient(httpClientParams);
        HttpGet httpget = new HttpGet(url);
        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        if ( entity != null ) {
            return entity.getContent();
        }
        return null;
    }
    
    /**
     * Get the URI object for the given endpoint. URI class cannot correctly parse the endpoint
     * if it doesn't include protocol. This method will add the protocol if this happens.
     */
    private static URI getUriByEndpoint(String endpoint) {
        URI targetEndpointUri= null;
        try {
            targetEndpointUri = new URI(endpoint);
            if (targetEndpointUri.getHost() == null) {
                targetEndpointUri = new URI("http://" + endpoint);
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException("Unable to parse service endpoint: " + e.getMessage());
        }
        return targetEndpointUri;
    }
}
