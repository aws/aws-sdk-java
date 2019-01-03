/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.RuntimeHttpUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

@Deprecated
@SdkInternalApi
public class LegacyRegionXmlLoadUtils {

    /**
     * Loads a set of region metadata by downloading an XML file from the
     * given URI and parsing it.
     *
     * @param uri    the uri of the XML file to parse
     * @param config configuration for the HTTP client to use to fetch the file
     * @throws IOException any error while reading data.
     */
    public static RegionMetadata load
    (final URI uri, final ClientConfiguration config) throws
            IOException {

        return RegionMetadataParser.parse(
                RuntimeHttpUtils.fetchFile(uri, config));
    }

    /**
     * Loads a set of region metadata by parsing the given file.
     *
     * @param file the region metadata to load from
     * @throws IOException any error while reading from file.
     */
    public static RegionMetadata load
    (final File file) throws IOException {
        return RegionMetadataParser.parse(new BufferedInputStream(new
                FileInputStream(file)));
    }

    /**
     * Loads a set of region metadata from an arbitrary {@code InputStream}
     * containing an XML file.
     *
     * @param stream the stream to load from
     * @return the loaded region metadata
     * @throws IOException on error reading from the stream
     */
    public static RegionMetadata load
    (final InputStream stream) throws IOException {

        return RegionMetadataParser.parse(stream);
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
    public static RegionMetadata load(
            final Class<?> clazz,
            final String name) throws IOException {

        InputStream stream = clazz.getResourceAsStream(name);
        if (stream == null) {
            throw new FileNotFoundException(
                    "No resource '" + name + "' found.");
        }

        return load(stream);
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
    public static RegionMetadata load(
            final ClassLoader classLoader,
            final String name) throws IOException {

        InputStream stream = classLoader.getResourceAsStream(name);
        if (stream == null) {
            throw new FileNotFoundException(
                    "No resource '" + name + "' found.");
        }
        return load(stream);
    }
}
