/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

/**
 * Layer Attributes Keys
 */
public enum LayerAttributesKeys {
    
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
     *            real value
     * @return LayerAttributesKeys corresponding to the value
     */
    public static LayerAttributesKeys fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("EnableHaproxyStats".equals(value)) {
            return LayerAttributesKeys.EnableHaproxyStats;
        } else if ("HaproxyStatsUrl".equals(value)) {
            return LayerAttributesKeys.HaproxyStatsUrl;
        } else if ("HaproxyStatsUser".equals(value)) {
            return LayerAttributesKeys.HaproxyStatsUser;
        } else if ("HaproxyStatsPassword".equals(value)) {
            return LayerAttributesKeys.HaproxyStatsPassword;
        } else if ("HaproxyHealthCheckUrl".equals(value)) {
            return LayerAttributesKeys.HaproxyHealthCheckUrl;
        } else if ("HaproxyHealthCheckMethod".equals(value)) {
            return LayerAttributesKeys.HaproxyHealthCheckMethod;
        } else if ("MysqlRootPassword".equals(value)) {
            return LayerAttributesKeys.MysqlRootPassword;
        } else if ("MysqlRootPasswordUbiquitous".equals(value)) {
            return LayerAttributesKeys.MysqlRootPasswordUbiquitous;
        } else if ("GangliaUrl".equals(value)) {
            return LayerAttributesKeys.GangliaUrl;
        } else if ("GangliaUser".equals(value)) {
            return LayerAttributesKeys.GangliaUser;
        } else if ("GangliaPassword".equals(value)) {
            return LayerAttributesKeys.GangliaPassword;
        } else if ("MemcachedMemory".equals(value)) {
            return LayerAttributesKeys.MemcachedMemory;
        } else if ("NodejsVersion".equals(value)) {
            return LayerAttributesKeys.NodejsVersion;
        } else if ("RubyVersion".equals(value)) {
            return LayerAttributesKeys.RubyVersion;
        } else if ("RubygemsVersion".equals(value)) {
            return LayerAttributesKeys.RubygemsVersion;
        } else if ("ManageBundler".equals(value)) {
            return LayerAttributesKeys.ManageBundler;
        } else if ("BundlerVersion".equals(value)) {
            return LayerAttributesKeys.BundlerVersion;
        } else if ("RailsStack".equals(value)) {
            return LayerAttributesKeys.RailsStack;
        } else if ("PassengerVersion".equals(value)) {
            return LayerAttributesKeys.PassengerVersion;
        } else if ("Jvm".equals(value)) {
            return LayerAttributesKeys.Jvm;
        } else if ("JvmVersion".equals(value)) {
            return LayerAttributesKeys.JvmVersion;
        } else if ("JvmOptions".equals(value)) {
            return LayerAttributesKeys.JvmOptions;
        } else if ("JavaAppServer".equals(value)) {
            return LayerAttributesKeys.JavaAppServer;
        } else if ("JavaAppServerVersion".equals(value)) {
            return LayerAttributesKeys.JavaAppServerVersion;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    