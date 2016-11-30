/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

/**
 * 
 */
public enum OperationType {

    DeleteInstance("DeleteInstance"),
    CreateInstance("CreateInstance"),
    StopInstance("StopInstance"),
    StartInstance("StartInstance"),
    RebootInstance("RebootInstance"),
    OpenInstancePublicPorts("OpenInstancePublicPorts"),
    CloseInstancePublicPorts("CloseInstancePublicPorts"),
    AllocateStaticIp("AllocateStaticIp"),
    ReleaseStaticIp("ReleaseStaticIp"),
    AttachStaticIp("AttachStaticIp"),
    DetachStaticIp("DetachStaticIp"),
    UpdateDomainEntry("UpdateDomainEntry"),
    DeleteDomainEntry("DeleteDomainEntry"),
    CreateDomain("CreateDomain"),
    DeleteDomain("DeleteDomain"),
    CreateInstanceSnapshot("CreateInstanceSnapshot"),
    DeleteInstanceSnapshot("DeleteInstanceSnapshot"),
    CreateInstancesFromSnapshot("CreateInstancesFromSnapshot");

    private String value;

    private OperationType(String value) {
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
     * @return OperationType corresponding to the value
     */
    public static OperationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OperationType enumEntry : OperationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
