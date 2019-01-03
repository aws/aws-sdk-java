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
package com.amazonaws.partitions;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.partitions.model.Partitions;
import com.amazonaws.regions.RegionMetadata;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Loads all the partition files into memory.
 */
@SdkInternalApi
public class PartitionsLoader {

    /**
     * class path from where all partition files are loaded.
     */
    public static final String PARTITIONS_RESOURCE_PATH =
            "com/amazonaws/partitions/endpoints.json";

    /**
     * override class path from where all partition files are loaded.
     */
    public static final String PARTITIONS_OVERRIDE_RESOURCE_PATH =
            "com/amazonaws/partitions/override/endpoints.json";

    /**
     * Jackson object mapper that is used for parsing the partition files.
     */
    private static final ObjectMapper mapper = new ObjectMapper()
            .disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)
            .disable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)
            .enable(JsonParser.Feature.ALLOW_COMMENTS)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    /**
     * classloader to to be used for loading the partitions.
     */
    private final ClassLoader classLoader;

    public PartitionsLoader() {
        this.classLoader = PartitionsLoader.class.getClassLoader();
    }

    /**
     * Loads the partition files from the {@link #PARTITIONS_OVERRIDE_RESOURCE_PATH}. If no files are present, then
     * loads the partition files from the {@link #PARTITIONS_RESOURCE_PATH}
     * <p/>
     * Builds the {@link RegionMetadata} from the partition files.
     */
    public PartitionMetadataProvider build() {

        InputStream stream = classLoader
                .getResourceAsStream(PARTITIONS_OVERRIDE_RESOURCE_PATH);

        if (stream != null) {
            return new PartitionMetadataProvider(loadPartitionFromStream(stream, PARTITIONS_OVERRIDE_RESOURCE_PATH).getPartitions());
        } else {
            stream = classLoader.getResourceAsStream(PARTITIONS_RESOURCE_PATH);
            if (stream == null) {
                throw new SdkClientException("Unable to load partition metadata from " + PARTITIONS_RESOURCE_PATH);
            }
            return new PartitionMetadataProvider(loadPartitionFromStream(stream, PARTITIONS_RESOURCE_PATH).getPartitions());
        }
    }

    private Partitions loadPartitionFromStream(InputStream stream, String location) {

        try {

            return mapper.readValue(stream, Partitions.class);

        } catch (IOException e) {
            throw new SdkClientException("Error while loading partitions " +
                    "file from " + location, e);
        } finally {
            IOUtils.closeQuietly(stream, null);
        }
    }
}
