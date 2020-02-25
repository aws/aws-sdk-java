/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.wafv2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ParameterExceptionField {

    WEB_ACL("WEB_ACL"),
    RULE_GROUP("RULE_GROUP"),
    REGEX_PATTERN_SET("REGEX_PATTERN_SET"),
    IP_SET("IP_SET"),
    MANAGED_RULE_SET("MANAGED_RULE_SET"),
    RULE("RULE"),
    EXCLUDED_RULE("EXCLUDED_RULE"),
    STATEMENT("STATEMENT"),
    BYTE_MATCH_STATEMENT("BYTE_MATCH_STATEMENT"),
    SQLI_MATCH_STATEMENT("SQLI_MATCH_STATEMENT"),
    XSS_MATCH_STATEMENT("XSS_MATCH_STATEMENT"),
    SIZE_CONSTRAINT_STATEMENT("SIZE_CONSTRAINT_STATEMENT"),
    GEO_MATCH_STATEMENT("GEO_MATCH_STATEMENT"),
    RATE_BASED_STATEMENT("RATE_BASED_STATEMENT"),
    RULE_GROUP_REFERENCE_STATEMENT("RULE_GROUP_REFERENCE_STATEMENT"),
    REGEX_PATTERN_REFERENCE_STATEMENT("REGEX_PATTERN_REFERENCE_STATEMENT"),
    IP_SET_REFERENCE_STATEMENT("IP_SET_REFERENCE_STATEMENT"),
    MANAGED_RULE_SET_STATEMENT("MANAGED_RULE_SET_STATEMENT"),
    AND_STATEMENT("AND_STATEMENT"),
    OR_STATEMENT("OR_STATEMENT"),
    NOT_STATEMENT("NOT_STATEMENT"),
    IP_ADDRESS("IP_ADDRESS"),
    IP_ADDRESS_VERSION("IP_ADDRESS_VERSION"),
    FIELD_TO_MATCH("FIELD_TO_MATCH"),
    TEXT_TRANSFORMATION("TEXT_TRANSFORMATION"),
    SINGLE_QUERY_ARGUMENT("SINGLE_QUERY_ARGUMENT"),
    SINGLE_HEADER("SINGLE_HEADER"),
    DEFAULT_ACTION("DEFAULT_ACTION"),
    RULE_ACTION("RULE_ACTION"),
    ENTITY_LIMIT("ENTITY_LIMIT"),
    OVERRIDE_ACTION("OVERRIDE_ACTION"),
    SCOPE_VALUE("SCOPE_VALUE"),
    RESOURCE_ARN("RESOURCE_ARN"),
    RESOURCE_TYPE("RESOURCE_TYPE"),
    TAGS("TAGS"),
    TAG_KEYS("TAG_KEYS"),
    METRIC_NAME("METRIC_NAME");

    private String value;

    private ParameterExceptionField(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ParameterExceptionField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ParameterExceptionField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ParameterExceptionField enumEntry : ParameterExceptionField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
