/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import com.amazonaws.annotation.SdkProtectedApi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SdkProtectedApi
public final class HostnameValidator {

    private HostnameValidator() {
    }

    private static final Pattern HOSTNAME_COMPLIANT_PATTERN = Pattern.compile("[A-Za-z0-9\\-]+");
    private static final int HOSTNAME_MAX_LENGTH = 63;

    /**
     * Validates that a hostname component is compliant.
     * @param hostnameComponent the hostname component to check
     * @param paramName the name of the param or field being checked
     * @param object the object containing the hostname component
     */
    public static void validateHostnameCompliant(String hostnameComponent, String paramName, String object) {
        if (StringUtils.isNullOrEmpty(hostnameComponent)) {
            throw new IllegalArgumentException(
                String.format("The provided %s is not valid: the required '%s' "
                              + "component is missing.", object, paramName));
        }

        if (hostnameComponent.length() > HOSTNAME_MAX_LENGTH) {
            throw new IllegalArgumentException(
                String.format("The provided %s is not valid: the '%s' "
                              + "component exceeds the maximum length of %d characters.", object, paramName, HOSTNAME_MAX_LENGTH));
        }

        Matcher m = HOSTNAME_COMPLIANT_PATTERN.matcher(hostnameComponent);
        if (!m.matches()) {
            throw new IllegalArgumentException(
                String.format("The provided %s is not valid: the '%s' "
                              + "component must only contain alphanumeric characters and dashes.", object, paramName));
        }
    }
}
