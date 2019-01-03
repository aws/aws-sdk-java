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
package com.amazonaws.auth.policy.conditions;

import java.util.Arrays;

import com.amazonaws.auth.policy.Condition;

/**
 * AWS access control policy condition that allows an access control statement to be
 * conditionally applied based on a numeric comparison.
 */
public class NumericCondition extends Condition {

    /** Enumeration of the supported ways a numeric comparison can be evaluated */
    public static enum NumericComparisonType {
        NumericEquals,
        NumericGreaterThan,
        NumericGreaterThanEquals,
        NumericLessThan,
        NumericLessThanEquals,
        NumericNotEquals;
    };

    /**
     * Constructs a new access policy condition that compares two numbers.
     *
     * @param type
     *            The type of comparison to perform.
     * @param key
     *            The access policy condition key specifying where to get the
     *            first number for the comparison.
     * @param value
     *            The second number to compare against.
     */
    public NumericCondition(NumericComparisonType type, String key, String value) {
        super.type = type.toString();
        super.conditionKey = key;
        super.values = Arrays.asList(new String[] {value});
    }

}
