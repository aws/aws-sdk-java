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

import java.io.BufferedInputStream;
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.VersionInfoUtils;

/**
 * Utilities for working with regions.
 */
public class RegionUtils {

    private static final String REGIONS_FILE_OVERRIDE =
        SDKGlobalConfiguration.REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY;

    private static final String BUNDLED_ENDPOINTS_RESOURCE_PATH =
        "/com/amazonaws/regions/regions.xml";

    private static final String OVERRIDE_ENDPOINTS_RESOURCE_PATH =
        "/com/amazonaws/regions/override/regions.xml";


    private static final Log log = LogFactory.getLog(RegionUtils.class);


    private static String source;
    private static volatile RegionMetadata regionMetadata;

    /**
     * For test purposes.
     *
     * @return the source from which the region metadata singleton was loaded
     */
    protected static String getSource() {
        return source;
    }

    /*
     * Convenience methods that access the singleton RegionMetadata instance
     * maintained by this class, lazily initializing it if need be.
     */

    /**
     * Returns the current set of region metadata for this process,
     * initializing it if it has not yet been explicitly initialized before.
     *
     * @return the current set of region metadata
     */
    public static RegionMetadata getRegionMetadata() {
        RegionMetadata rval = regionMetadata;
        if (rval != null) {
            return rval;
        }

        initialize();
        return regionMetadata;
    }

    /**
     * Returns a list of the available AWS regions.
     */
    public static List<Region> getRegions() {
        return getRegionMetadata().getRegions();
    }

    /**
     * Returns a list of the regions that support the service given.
     *
     * @see ServiceAbbreviations
     */
    public static List<Region> getRegionsForService(
            String serviceAbbreviation) {

        return getRegionMetadata().getRegionsForService(serviceAbbreviation);
    }

    /**
     * Returns the region with the id given, if it exists. Otherwise, returns
     * null.
     */
    public static Region getRegion(String regionName) {
        return getRegionMetadata().getRegion(regionName);
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
     * @throws IllegalArgumentException
     *             If the given URL is malformed, or if the one of the service
     *             URLs on record is malformed.
     */
    public static Region getRegionByEndpoint(String endpoint) {
        return getRegionMetadata().getRegionByEndpoint(endpoint);
    }

    /*
     * Methods for loading a RegionMetadata object from various locations.
     */

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri the uri of the XML file to parse
     * @return the parsed region metadata
     * @throws IOException on error fetching or parsing the XML file
     */
    public static RegionMetadata loadMetadataFromURI(final URI uri)
            throws IOException {

        return loadMetadataFromURI(uri, null);
    }

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri the uri of the XML file to parse
     * @param config configuration for the HTTP client to use to fetch the file
     * @return the parsed region metadata
     * @throws IOException on error fetching or parsing the XML file
     */
    public static RegionMetadata loadMetadataFromURI(
            final URI uri,
            final ClientConfiguration config) throws IOException {
    
        InputStream stream = HttpUtils.fetchFile(uri, config);

        try {
            return loadMetadataFromInputStream(stream);
        } finally {
            stream.close();
        }
    }

    /**
     * Loads a set of region metadata from an XML file on disk.
     *
     * @param file the file to load from
     * @return the loaded region metadata
     * @throws IOException on error opening or reading from the file
     */
    public static RegionMetadata loadMetadataFromFile(final File file)
            throws IOException {

        InputStream stream =
            new BufferedInputStream(new FileInputStream(file));

        try {
            return loadMetadataFromInputStream(stream);
        } finally {
            stream.close();
        }
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource
     * of the classloader used to load the RegionUtils class.
     *
     * @param name the path of the resource, relative to the RegionUtils class
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    public static RegionMetadata loadMetadataFromResource(final String name)
            throws IOException {

        return loadMetadataFromResource(RegionUtils.class, name);
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource of
     * the classloader used to load the given class.
     *
     * @param clazz the class to use as a base for the resource
     * @param name the path to the resource, relative to the given class
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    public static RegionMetadata loadMetadataFromResource(
            final Class<?> clazz,
            final String name) throws IOException {

        InputStream stream = clazz.getResourceAsStream(name);
        if (stream == null) {
            throw new FileNotFoundException(
                    "No resource '" + name + "' found.");
        }

        try {
            return loadMetadataFromInputStream(stream);
        } finally {
            stream.close();
        }
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource
     * of the given classloader.
     *
     * @param classLoader the class loader to load the resource from
     * @param name the path to the resource
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    public static RegionMetadata loadMetadataFromResource(
            final ClassLoader classLoader,
            final String name) throws IOException {

        InputStream stream = classLoader.getResourceAsStream(name);
        if (stream == null) {
            throw new FileNotFoundException(
                    "No resource '" + name + "' found.");
        }

        try {
            return loadMetadataFromInputStream(stream);
        } finally {
            stream.close();
        }
    }

    /**
     * Loads a set of region metadata from an arbitrary {@code InputStream}
     * containing an XML file.
     *
     * @param stream the stream to load from
     * @return the loaded region metadata
     * @throws IOException on error reading from the stream
     */
    public static RegionMetadata loadMetadataFromInputStream(
            final InputStream stream) throws IOException {

        return RegionMetadataParser.parse(stream);
    }

    /*
     * Methods for initializing the process-wide singleton RegionMetadata
     * instance.
     */

    /**
     * This method no longer attempts to retrieve region metadata from
     * CloudFront, as that file is no longer being maintained and the version
     * bundled with the SDK is likely to be more up-to-date.
     * <p>
     * It's deprecated to signal that it no longer has any possibility of
     * retrieving a newer set of metadata than was previously loaded. If you
     * are simply wanting to reinitialize from the bundled region metadata,
     * call {@code initialize}. If you want to maintain your own remote
     * copy of the region metadata and periodically refresh it at runtime,
     * call {@code initializeFromURI}.
     *
     * @deprecated in favor of {@link #initialize()}
     */
    @Deprecated
    public static void init() {
        initialize();
    }

    /**
     * Initializes the region metadata by loading from the default hierarchy
     * of region metadata locations.
     */
    public static synchronized void initialize() {

        String overrideFilePath = System.getProperty(REGIONS_FILE_OVERRIDE);
        if (overrideFilePath != null) {
            doInitializeFromFile(new File(overrideFilePath));
            source = overrideFilePath;
            return;
        }

        InputStream override = RegionUtils.class
                .getResourceAsStream(OVERRIDE_ENDPOINTS_RESOURCE_PATH);
        if (override != null) {
            doInitializeFromInputStream(override);
            source = OVERRIDE_ENDPOINTS_RESOURCE_PATH;
            return;
        }

        doInitializeFromResource(RegionUtils.class,
                                 BUNDLED_ENDPOINTS_RESOURCE_PATH);
        source = BUNDLED_ENDPOINTS_RESOURCE_PATH;
    }

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri the uri of the XML file to parse
     * @throws AmazonClientException on error
     */
    public static synchronized void initializeFromURI(final URI uri) {
        doInitializeFromURI(uri, null);
        source = uri.toASCIIString();
    }

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri the uri of the XML file to parse
     * @param config configuration for the HTTP client to use to fetch the file
     * @throws AmazonClientException on error
     */
    public static synchronized void initializeFromURI(
            final URI uri,
            final ClientConfiguration config) {

        doInitializeFromURI(uri, config);
        source = uri.toASCIIString();
    }

    /**
     * Initializes the region metadata singleton from an XML file on disk.
     *
     * @param file the file to load from
     * @throws AmazonClientException on error opening or reading from the file
     */
    public static synchronized void initializeFromFile(final File file) {
        doInitializeFromFile(file);
        source = file.toString();
    }

    /**
     * Initializes the region metadata singleton from an XML file stored as a
     * resource of the classloader used to load the RegionUtils class.
     *
     * @param name the path of the resource, relative to the RegionUtils class
     * @throws AmazonClientException on error
     */
    public static synchronized void initializeFromResource(final String name) {
        doInitializeFromResource(RegionUtils.class, name);
        source = name;
    }

    /**
     * Initializes the region metadata singleton from the given resource.
     *
     * @param clazz the class to use as a base for the resource
     * @param name the path to the resource, relative to the given class
     * @throws AmazonClientException on error
     */
    public static synchronized void initializeFromResource(
            final Class<?> clazz,
            final String name) {

        doInitializeFromResource(clazz, name);
        source = name;
    }

    /**
     * Initializes the region metadata singleton from the given resource.
     *
     * @param classLoader the class loader to use to load the resource
     * @param name the path to the resource
     * @throws AmazonClientException on error
     */
    public static synchronized void initializeFromResource(
            final ClassLoader classLoader,
            final String name) {

        doInitializeFromResource(classLoader, name);
        source = name;
    }

    /**
     * Directly sets the singleton {@code RegionMetadata} instance.
     *
     * @param metadata the new region metadata object
     */
    public static void initializeWithMetadata(final RegionMetadata metadata) {
        if (metadata == null) {
            throw new IllegalArgumentException("metadata cannot be null");
        }
        regionMetadata = metadata;
        source = "RegionUtils.initializeWithMetadata(RegionMetadata)";
    }

    /**
     * Private, unsynchronized helper method that initializes the region
     * metadata singleton by loading the given URI.
     *
     * @param uri the uri to load
     * @param config optional configuration for the HTTP client
     * @throws AmazonClientException on error
     */
    private static void doInitializeFromURI(final URI uri,
                                            final ClientConfiguration config) {
        try {

            regionMetadata = loadMetadataFromURI(uri, config);

        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from " + uri,
                    exception);
        }
    }

    /**
     * Private, unsynchronized helper method that initializes the region
     * metadata singleton by loading the given file.
     *
     * @param file the file to load
     * @throws AmazonClientException on error
     */
    private static void doInitializeFromFile(final File file) {
        try {

            regionMetadata = loadMetadataFromFile(file);

        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from " + file,
                    exception);
        }
    }

    /**
     * Private, unsynchronized helper method that initializes the region
     * metadata singleton by loading the given resource from the classpath.
     *
     * @param clazz the class to use as a base for the resource path
     * @param name the name of the resource to load
     * @throws AmazonClientException on error
     */
    private static void doInitializeFromResource(final Class<?> clazz,
                                                 final String name) {

        try {

            regionMetadata = loadMetadataFromResource(clazz, name);

        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from resource " + name,
                    exception);
        }
    }

    /**
     * Private, unsynchronized helper method that initializes the region
     * metadata singleton by loading the given resource from the given
     * classloader.
     *
     * @param classLoader the classloader to use to load the resource
     * @param name the name of the resource to load
     * @throws AmazonClientException on error
     */
    private static void doInitializeFromResource(
            final ClassLoader classLoader,
            final String name) {

        try {

            regionMetadata = loadMetadataFromResource(classLoader, name);

        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from resource " + name,
                    exception);
        }
    }

    /**
     * Private, unsynchronized helper method that initializes the region
     * metadata singleton by loading from the given input stream.
     *
     * @param stream the input stream to load from
     * @throws AmazonClientException on error
     */
    private static void doInitializeFromInputStream(
            final InputStream stream) {

        try {

            regionMetadata = loadMetadataFromInputStream(stream);

        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from input stream",
                    exception);
        }
    }
}
