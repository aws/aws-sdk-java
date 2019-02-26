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

import com.amazonaws.SdkClientException;
import com.amazonaws.ClientConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;

/**
 * Utilities for working with regions.
 */
public class RegionUtils {

    private static volatile RegionMetadata regionMetadata;

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

        synchronized (RegionUtils.class) {
            if (regionMetadata == null) {
                initialize();
            }
        }

        return regionMetadata;
    }

    /**
     * Initializes the region metadata by loading from the default hierarchy
     * of region metadata locations.
     */
    public static void initialize() {
        regionMetadata = RegionMetadataFactory.create();
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
     * @param serviceAbbreviation
     *         The service endpoint prefix which can be retrieved from the
     *         constant ENDPOINT_PREFIX of the specific service client interface.
     *
     */
    public static List<Region> getRegionsForService(
            String serviceAbbreviation) {

        return getRegionMetadata().getRegionsForService(serviceAbbreviation);
    }

    /**
     * Returns the region with the given regionName and proper partition if found in region metadata.
     * Otherwise, returns a {@link Region} object with given regionName and aws partition.
     */
    public static Region getRegion(String regionName) {
        return getRegionMetadata().getRegion(regionName);
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
    @Deprecated
    public static RegionMetadata loadMetadataFromURI(final URI uri)
            throws IOException {
        return loadMetadataFromURI(uri, null);
    }

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri    the uri of the XML file to parse
     * @param config configuration for the HTTP client to use to fetch the file
     * @return the parsed region metadata
     * @throws IOException on error fetching or parsing the XML file
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromURI(
            final URI uri,
            final ClientConfiguration config) throws IOException {
        return LegacyRegionXmlLoadUtils.load(uri, config);
    }

    /**
     * Loads a set of region metadata from an XML file on disk.
     *
     * @param file the file to load from
     * @return the loaded region metadata
     * @throws IOException on error opening or reading from the file
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromFile(final File file)
            throws IOException {
        return LegacyRegionXmlLoadUtils.load(file);
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource
     * of the classloader used to load the RegionUtils class.
     *
     * @param name the path of the resource, relative to the RegionUtils class
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromResource(final String name)
            throws IOException {

        return LegacyRegionXmlLoadUtils.load(RegionUtils
                .class, name);
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource of
     * the classloader used to load the given class.
     *
     * @param clazz the class to use as a base for the resource
     * @param name  the path to the resource, relative to the given class
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromResource(
            final Class<?> clazz,
            final String name) throws IOException {

        return LegacyRegionXmlLoadUtils.load(clazz, name);
    }

    /**
     * Loads a set of region metadata from an XML file stored as a resource
     * of the given classloader.
     *
     * @param classLoader the class loader to load the resource from
     * @param name        the path to the resource
     * @return the parsed region metadata
     * @throws IOException if the resource is not found or cannot be parsed
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromResource(
            final ClassLoader classLoader,
            final String name) throws IOException {

        return LegacyRegionXmlLoadUtils.load(classLoader,
                name);
    }

    /**
     * Loads a set of region metadata from an arbitrary {@code InputStream}
     * containing an XML file.
     *
     * @param stream the stream to load from
     * @return the loaded region metadata
     * @throws IOException on error reading from the stream
     */
    @Deprecated
    public static RegionMetadata loadMetadataFromInputStream(
            final InputStream stream) throws IOException {

        return LegacyRegionXmlLoadUtils.load(stream);
    }

    /*
     * Methods for initializing the process-wide singleton RegionMetadata
     * instance.
     */

    /**
     * This method no longer attempts to retrieve region metadata from
     * CloudFront, as that file is no longer being maintained and the version
     * bundled with the SDK is likely to be more up-to-date.
     * <p/>
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
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri the uri of the XML file to parse
     * @throws SdkClientException on error
     */
    @Deprecated
    public static synchronized void initializeFromURI(final URI uri) {
        initializeFromURI(uri, null);
    }

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri    the uri of the XML file to parse
     * @param config configuration for the HTTP client to use to fetch the file
     * @throws SdkClientException on error
     */
    @Deprecated
    public static synchronized void initializeFromURI(
            final URI uri,
            final ClientConfiguration config) {
        try {

            regionMetadata = loadMetadataFromURI(uri, config);

        } catch (IOException exception) {
            throw new SdkClientException(
                    "Error parsing region metadata from " + uri,
                    exception);
        }
    }

    /**
     * Initializes the region metadata singleton from an XML file on disk.
     *
     * @param file the file to load from
     * @throws SdkClientException on error opening or reading from the file
     */
    @Deprecated
    public static synchronized void initializeFromFile(final File file) {
        try {
            regionMetadata = loadMetadataFromFile(file);
        } catch (IOException exception) {
            throw new SdkClientException(
                    "Error parsing region metadata from " + file,
                    exception);
        }
    }

    /**
     * Initializes the region metadata singleton from an XML file stored as a
     * resource of the classloader used to load the RegionUtils class.
     *
     * @param name the path of the resource, relative to the RegionUtils class
     * @throws SdkClientException on error
     */
    @Deprecated
    public static synchronized void initializeFromResource(final String name) {
        initializeFromResource(RegionUtils.class, name);
    }

    /**
     * Initializes the region metadata singleton from the given resource.
     *
     * @param clazz the class to use as a base for the resource
     * @param name  the path to the resource, relative to the given class
     * @throws SdkClientException on error
     */
    @Deprecated
    public static synchronized void initializeFromResource(
            final Class<?> clazz,
            final String name) {

        try {
            regionMetadata = loadMetadataFromResource(clazz, name);
        } catch (IOException exception) {
            throw new SdkClientException(
                    "Error parsing region metadata from resource " + name,
                    exception);
        }
    }

    /**
     * Initializes the region metadata singleton from the given resource.
     *
     * @param classLoader the class loader to use to load the resource
     * @param name        the path to the resource
     * @throws SdkClientException on error
     */
    @Deprecated
    public static synchronized void initializeFromResource(
            final ClassLoader classLoader,
            final String name) {

        try {
            regionMetadata = loadMetadataFromResource(classLoader, name);
        } catch (IOException exception) {
            throw new SdkClientException(
                    "Error parsing region metadata from resource " + name,
                    exception);
        }
    }
}