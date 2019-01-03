/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * <p/>
 * http://aws.amazon.com/apache2.0
 * <p/>
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.partitions.model;

import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Metadata of all partitions.
 */
public class Partitions {

    /**
     * the version of json schema for the partition metadata.
     */
    private final String version;

    /**
     * list of partitions.
     */
    private final List<Partition> partitions;

    public Partitions(@JsonProperty(value = "version") String version, @JsonProperty(value = "partitions") List<Partition> partitions) {
        this.version = ValidationUtils.assertNotNull(version, "version");
        this.partitions = ValidationUtils.assertNotNull(partitions, "version");
    }

    /**
     * returns the version of the json schema for the partition metadata document.
     */
    public String getVersion() {
        return version;
    }

    /**
     * returns the list of all partitions loaded from the partition metadata document.
     */
    public List<Partition> getPartitions() {
        return partitions;
    }
}
