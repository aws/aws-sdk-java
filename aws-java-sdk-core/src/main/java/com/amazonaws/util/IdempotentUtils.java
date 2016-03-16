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

import java.util.UUID;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Utility class to manage idempotency token
 */
@SdkProtectedApi
public final class IdempotentUtils {
    /**
     * This method is intended for internal use only.
     * if input token is null, create and return a new unique token.
     * Otherwise return the existing token.
     * @param token
     * @return if input token is not null, return the same. Else return new token.
     */
    public static String resolveString(String token) {
        return token != null ? token : UUID.randomUUID().toString();
    }
}
