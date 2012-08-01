/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Instance Attribute Name
 */
public enum InstanceAttributeName {
    
    InstanceType("instanceType"),
    Kernel("kernel"),
    Ramdisk("ramdisk"),
    UserData("userData"),
    DisableApiTermination("disableApiTermination"),
    InstanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior"),
    RootDeviceName("rootDeviceName"),
    BlockDeviceMapping("blockDeviceMapping"),
    ProductCodes("productCodes"),
    SourceDestCheck("sourceDestCheck"),
    GroupSet("groupSet"),
    EbsOptimized("ebsOptimized");

    private String value;

    private InstanceAttributeName(String value) {
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
     * @return InstanceAttributeName corresponding to the value
     */
    public static InstanceAttributeName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("instanceType".equals(value)) {
            return InstanceAttributeName.InstanceType;
        } else if ("kernel".equals(value)) {
            return InstanceAttributeName.Kernel;
        } else if ("ramdisk".equals(value)) {
            return InstanceAttributeName.Ramdisk;
        } else if ("userData".equals(value)) {
            return InstanceAttributeName.UserData;
        } else if ("disableApiTermination".equals(value)) {
            return InstanceAttributeName.DisableApiTermination;
        } else if ("instanceInitiatedShutdownBehavior".equals(value)) {
            return InstanceAttributeName.InstanceInitiatedShutdownBehavior;
        } else if ("rootDeviceName".equals(value)) {
            return InstanceAttributeName.RootDeviceName;
        } else if ("blockDeviceMapping".equals(value)) {
            return InstanceAttributeName.BlockDeviceMapping;
        } else if ("productCodes".equals(value)) {
            return InstanceAttributeName.ProductCodes;
        } else if ("sourceDestCheck".equals(value)) {
            return InstanceAttributeName.SourceDestCheck;
        } else if ("groupSet".equals(value)) {
            return InstanceAttributeName.GroupSet;
        } else if ("ebsOptimized".equals(value)) {
            return InstanceAttributeName.EbsOptimized;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    