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

public enum AuthType {

    NONE("none");

    private final String value;

    AuthType(String value) {
        this.value = value;
    }

    public static AuthType fromValue(String value) {
        for (AuthType authType : AuthType.values()) {
            if (authType.value.equals(value)) {
                return authType;
            }
        }
        throw new IllegalArgumentException("Unsupported auth type " + value);
    }
}
