/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.codegen.model.service;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;

public enum AuthType {

    NONE("none"),

    // APIG specific
    CUSTOM("custom"),
    IAM("iam"),

    // AWS protocol
    V4("v4"),
    V4_UNSIGNED_BODY("v4-unsigned-body"),

    ;

    private final String value;

    AuthType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static AuthType fromValue(String value) {
        return Arrays.stream(values())
                .filter(authType -> authType.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Unknown AuthType '%s'", value)));
    }

    public String getValue() {
        return value;
    }
}
