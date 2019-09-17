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

package com.amazonaws.jmespath;


final class CamelCaseUtils {

    private CamelCaseUtils() {
    }

    /**
     * This matches the algorithm that Jackson uses to convert getter names to JSON field names. Any names starting with a
     * lowercase character are left as is, any names starting with one or more uppercase characters have all consecutive
     * uppercase characters converted to lowercase. See tests for examples.
     *
     * @see <a href="https://github.com/FasterXML/jackson-databind/blob/4debd67e053a254b5f42294426340fc91a312f64/src/main/java/com/fasterxml/jackson/databind/util/BeanUtil.java#L233">BeanUtil.java</a>
     */
    public static String toCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean foundFirstLowercase = false;
        for (char cur : str.toCharArray()) {
            if (Character.isUpperCase(cur) && !foundFirstLowercase) {
                stringBuilder.append(Character.toLowerCase(cur));
            } else {
                foundFirstLowercase = true;
                stringBuilder.append(cur);
            }
        }
        return stringBuilder.toString();
    }
}
