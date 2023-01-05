/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>ListRecommendations</code> filter type. This can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>TYPE</code> – The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or
 * <code>DMARC</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IMPACT</code> – The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>STATUS</code> – The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RESOURCE_ARN</code> – The resource affected by the recommendation, with values like
 * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ListRecommendationsFilterKey {

    TYPE("TYPE"),
    IMPACT("IMPACT"),
    STATUS("STATUS"),
    RESOURCE_ARN("RESOURCE_ARN");

    private String value;

    private ListRecommendationsFilterKey(String value) {
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
     * @return ListRecommendationsFilterKey corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ListRecommendationsFilterKey fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ListRecommendationsFilterKey enumEntry : ListRecommendationsFilterKey.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
