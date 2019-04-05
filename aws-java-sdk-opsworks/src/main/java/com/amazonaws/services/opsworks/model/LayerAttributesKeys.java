/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LayerAttributesKeys {

    EcsClusterArn("EcsClusterArn"),
    EnableHaproxyStats("EnableHaproxyStats"),
    HaproxyStatsUrl("HaproxyStatsUrl"),
    HaproxyStatsUser("HaproxyStatsUser"),
    HaproxyStatsPassword("HaproxyStatsPassword"),
    HaproxyHealthCheckUrl("HaproxyHealthCheckUrl"),
    HaproxyHealthCheckMethod("HaproxyHealthCheckMethod"),
    MysqlRootPassword("MysqlRootPassword"),
    MysqlRootPasswordUbiquitous("MysqlRootPasswordUbiquitous"),
    GangliaUrl("GangliaUrl"),
    GangliaUser("GangliaUser"),
    GangliaPassword("GangliaPassword"),
    MemcachedMemory("MemcachedMemory"),
    NodejsVersion("NodejsVersion"),
    RubyVersion("RubyVersion"),
    RubygemsVersion("RubygemsVersion"),
    ManageBundler("ManageBundler"),
    BundlerVersion("BundlerVersion"),
    RailsStack("RailsStack"),
    PassengerVersion("PassengerVersion"),
    Jvm("Jvm"),
    JvmVersion("JvmVersion"),
    JvmOptions("JvmOptions"),
    JavaAppServer("JavaAppServer"),
    JavaAppServerVersion("JavaAppServerVersion");

    private String value;

    private LayerAttributesKeys(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LayerAttributesKeys corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LayerAttributesKeys fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LayerAttributesKeys enumEntry : LayerAttributesKeys.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
