/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.directory.model;

/**
 * 
 */
public enum DirectoryStage {

    Requested("Requested"),
    Creating("Creating"),
    Created("Created"),
    Active("Active"),
    Inoperable("Inoperable"),
    Impaired("Impaired"),
    Restoring("Restoring"),
    RestoreFailed("RestoreFailed"),
    Deleting("Deleting"),
    Deleted("Deleted"),
    Failed("Failed");

    private String value;

    private DirectoryStage(String value) {
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
     * @return DirectoryStage corresponding to the value
     */
    public static DirectoryStage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Requested".equals(value)) {
            return Requested;
        } else if ("Creating".equals(value)) {
            return Creating;
        } else if ("Created".equals(value)) {
            return Created;
        } else if ("Active".equals(value)) {
            return Active;
        } else if ("Inoperable".equals(value)) {
            return Inoperable;
        } else if ("Impaired".equals(value)) {
            return Impaired;
        } else if ("Restoring".equals(value)) {
            return Restoring;
        } else if ("RestoreFailed".equals(value)) {
            return RestoreFailed;
        } else if ("Deleting".equals(value)) {
            return Deleting;
        } else if ("Deleted".equals(value)) {
            return Deleted;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}