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

package com.amazonaws.util;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.protocol.DefaultValueSupplier;

import java.util.UUID;

/**
 * Utility class to manage idempotency token
 */
@SdkProtectedApi
public final class IdempotentUtils {

    private static DefaultValueSupplier<String> generator = new DefaultValueSupplier<String>() {
        @Override
        public String get() {
            return UUID.randomUUID().toString();
        }
    };

    /**
     * @deprecated By {@link #getGenerator()}
     */
    @Deprecated
    @SdkProtectedApi
    public static String resolveString(String token) {
        return token != null ? token : generator.get();
    }

    @SdkProtectedApi
    public static DefaultValueSupplier<String> getGenerator() {
        return generator;
    }


    @SdkTestInternalApi
    public static void setGenerator(DefaultValueSupplier<String> newGenerator) {
        generator = newGenerator;
    }
}
