/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *   http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazonaws.codegen.model.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Location {

    URI("uri"),
    HEADER("header"),
    HEADERS("headers"),
    STATUS_CODE("statusCode"),
    QUERY_STRING("querystring");

    private final String location;

    Location(String location) {
        this.location = location;
    }

    @JsonCreator
    public static Location forValue(String location) {
        if (location == null)
            return null;
        for (Location locationEnum : Location.values()) {
            if (locationEnum.location.equals(location)) {
                return locationEnum;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum value for ParameterHttpMapping.location: " + location);
    }

    @JsonValue
    @Override
    public String toString() {
        return this.location;
    }
}
