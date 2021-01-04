/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PrefixListState {

    CreateInProgress("create-in-progress"),
    CreateComplete("create-complete"),
    CreateFailed("create-failed"),
    ModifyInProgress("modify-in-progress"),
    ModifyComplete("modify-complete"),
    ModifyFailed("modify-failed"),
    RestoreInProgress("restore-in-progress"),
    RestoreComplete("restore-complete"),
    RestoreFailed("restore-failed"),
    DeleteInProgress("delete-in-progress"),
    DeleteComplete("delete-complete"),
    DeleteFailed("delete-failed");

    private String value;

    private PrefixListState(String value) {
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
     * @return PrefixListState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PrefixListState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PrefixListState enumEntry : PrefixListState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
