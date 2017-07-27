/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.codegen.model.config.customization;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;

/**
 * Code that has been deprecated and no longer needs to be generated, used for new services.
 */
public enum DeprecatedSuppression {

    /**
     * Public constructors on clients were deprecated in v1.11.84 of the SDK
     */
    ClientConstructors,

    /**
     * Methods that mutate a client (eg: setRegion) were deprecated in v1.11.84 of the SDK
     * This suppresses creation of those methods on the client interface
     */
    ClientMutationMethods,

    /**
     * Overloads for setters breaks the POJO contract so we don't emit them for new usages. Only the fluent setter should
     * have an enum overload.
     */
    EnumSetterOverload;

    @JsonCreator
    public static DeprecatedSuppression fromValue(String value) {
        return Arrays.stream(values())
                .filter(v -> v.name().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Unknown DeprecatedSuppression '%s'", value)));
    }
}
