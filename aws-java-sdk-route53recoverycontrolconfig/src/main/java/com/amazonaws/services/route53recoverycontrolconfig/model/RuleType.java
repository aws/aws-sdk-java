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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import javax.annotation.Generated;

/**
 * <p>
 * An enumerated type that determines how the evaluated rules are processed. RuleType can be one of the following:
 * </p>
 * <p>
 * ATLEAST - At least N routing controls must be set. You specify N as the Threshold in the rule configuration.
 * </p>
 * <p>
 * AND - All routing controls must be set. This is a shortcut for "At least N," where N is the total number of controls
 * in the rule.
 * </p>
 * <p>
 * OR - Any control must be set. This is a shortcut for "At least N," where N is 1.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RuleType {

    ATLEAST("ATLEAST"),
    AND("AND"),
    OR("OR");

    private String value;

    private RuleType(String value) {
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
     * @return RuleType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RuleType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RuleType enumEntry : RuleType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
