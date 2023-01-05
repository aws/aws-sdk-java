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
package com.amazonaws.services.dataexchange.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Type {

    IMPORT_ASSETS_FROM_S3("IMPORT_ASSETS_FROM_S3"),
    IMPORT_ASSET_FROM_SIGNED_URL("IMPORT_ASSET_FROM_SIGNED_URL"),
    EXPORT_ASSETS_TO_S3("EXPORT_ASSETS_TO_S3"),
    EXPORT_ASSET_TO_SIGNED_URL("EXPORT_ASSET_TO_SIGNED_URL"),
    EXPORT_REVISIONS_TO_S3("EXPORT_REVISIONS_TO_S3"),
    IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES("IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES"),
    IMPORT_ASSET_FROM_API_GATEWAY_API("IMPORT_ASSET_FROM_API_GATEWAY_API"),
    CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET("CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET"),
    IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY("IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY");

    private String value;

    private Type(String value) {
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
     * @return Type corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Type fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Type enumEntry : Type.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
