/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.jmespath;

final class CamelCaseUtils {

    private CamelCaseUtils() {
    }

    public static String toCamelCase(String str) {
        if (str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
            if (str.length() > 1) {
                return Character.toLowerCase(str.charAt(0)) + str.substring(1, str.length());
            } else {
                return str.toLowerCase();
            }
        }
        return str;
    }
}
