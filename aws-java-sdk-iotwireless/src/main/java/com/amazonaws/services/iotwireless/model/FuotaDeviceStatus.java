/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import javax.annotation.Generated;

/**
 * <p>
 * The status of a wireless device in a FUOTA task.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FuotaDeviceStatus {

    Initial("Initial"),
    Package_Not_Supported("Package_Not_Supported"),
    FragAlgo_unsupported("FragAlgo_unsupported"),
    Not_enough_memory("Not_enough_memory"),
    FragIndex_unsupported("FragIndex_unsupported"),
    Wrong_descriptor("Wrong_descriptor"),
    SessionCnt_replay("SessionCnt_replay"),
    MissingFrag("MissingFrag"),
    MemoryError("MemoryError"),
    MICError("MICError"),
    Successful("Successful");

    private String value;

    private FuotaDeviceStatus(String value) {
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
     * @return FuotaDeviceStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FuotaDeviceStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FuotaDeviceStatus enumEntry : FuotaDeviceStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
