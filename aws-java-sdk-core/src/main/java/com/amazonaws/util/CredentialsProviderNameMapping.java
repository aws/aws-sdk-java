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

import java.util.*;
import java.util.regex.Pattern;

/**
 * A enum class representing a short form of credentials providers to record in the UA string.
 */
public enum CredentialsProviderNameMapping {

    SYS("SystemPropertyCredentialsProvider"),
    ENV("EnvironmentVariableCredentialsProvider"),
    STSWEB("StsAssumeRoleWithWebIdentityCredentialsProvider"),
    STSROLE("StsAssumeRoleCredentialsProvider"),
    STSFED("StsGetFederationTokenCredentialsProvider"),

    SSO("SsoCredentialsProvider"),
    PROF("ProfileCredentialsProvider"),
    CONT("ContainerCredentialsProvider"),
    IMDS("InstanceProfileCredentialsProvider"),
    PROC("ProcessCredentialsProvider"),
    CPATH("ClasspathPropertiesFileCredentialsProvider"),
    UNKNOWN("Unknown");

    private static final Pattern CLASS_NAME_CHARACTERS = Pattern.compile("[a-zA-Z_$\\d]{0,62}");
    private static final Map<String, CredentialsProviderNameMapping> VALUE_MAP = mapNameToValue();
    private final String value;

    CredentialsProviderNameMapping(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Map the given provider name to a shorter form. If null or empty, return unknown.
     * If not recognized, use the given string if it conforms to the accepted pattern.
     */
    public static String mapFrom(String source) {
        if (StringUtils.isNullOrEmpty(source)) {
            return UNKNOWN.name().toLowerCase(Locale.US);
        }
        CredentialsProviderNameMapping shortName = mappedName(source);
        return shortName != null ? shortName.name().toLowerCase(Locale.US) : sanitizedProviderOrNull(source);
    }

    private static CredentialsProviderNameMapping mappedName(String value) {
        if (VALUE_MAP.containsKey(value)) {
            return VALUE_MAP.get(value);
        }
        return null;
    }

    private static String sanitizedProviderOrNull(String value) {
        return hasAcceptedFormat(value) ? value : null;
    }

    private static boolean hasAcceptedFormat(String input) {
        return CLASS_NAME_CHARACTERS.matcher(input).matches();
    }

    private static Map<String, CredentialsProviderNameMapping> mapNameToValue() {
        Map<String, CredentialsProviderNameMapping> map = new HashMap<>();
        for (CredentialsProviderNameMapping mapping : CredentialsProviderNameMapping.values()) {
            String index = mapping.value();
            map.put(index, mapping);
        }
        return map;
    }
}
