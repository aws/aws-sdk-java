/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.waiters;

import com.amazonaws.annotation.SdkProtectedApi;
import com.fasterxml.jackson.databind.JsonNode;

@SdkProtectedApi
public class AcceptorPathMatcher {

    /**
     * PathAll matcher that checks if each element of the final
     * result matches the expected result
     *
     * @param expectedResult Expected result given by the waiter definition
     * @param finalResult    Final result of the resource got by the execution
     *                       of the JmesPath expression given by the waiter
     *                       definition
     * @return True if all elements of the final result matches
     * the expected result, False otherwise
     */
    public static boolean pathAll(JsonNode expectedResult, JsonNode finalResult) {
        if (finalResult.isNull()) {
            return false;
        }
        if (!finalResult.isArray()) {
            throw new RuntimeException("Expected an array");
        }
        for (JsonNode element : finalResult) {
            if (!element.equals(expectedResult)) {
                return false;
            }
        }
        return true;
    }

    /**
     * PathAny matcher that checks if any element of the final
     * result matches the expected result
     *
     * @param expectedResult Expected result given by the waiter definition
     * @param finalResult    Final result of the resource got by the execution
     *                       of the JmesPath expression given by the waiter
     *                       definition
     * @return True if any single element of the final result matches
     * the expected result, False if none matched
     */
    public static boolean pathAny(JsonNode expectedResult, JsonNode finalResult) {
        if (finalResult.isNull()) {
            return false;
        }
        if (!finalResult.isArray()) {
            throw new RuntimeException("Expected an array");
        }
        for (JsonNode element : finalResult) {
            if (element.equals(expectedResult)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Path matcher that checks if the final result
     * matches the expected result
     *
     * @param expectedResult Expected result given by the waiter definition
     * @param finalResult    Final result of the resource got by the execution
     *                       of the JmesPath expression given by the waiter
     *                       definition
     * @return True if the final result matches the expected result,
     * False otherwise
     */
    public static boolean path(JsonNode expectedResult, JsonNode finalResult) {
        return finalResult.equals(expectedResult);
    }
}
