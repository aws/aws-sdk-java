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
 * conditionally applied based on a comparison of boolean values.
 */
public class BooleanCondition extends Condition {

    /**
     * Constructs a new access policy condition that performs a boolean
     * comparison.
     *
     * @param key
     *            The access policy condition key specifying where to get the
     *            first boolean value for the comparison (ex:
     *            aws:SecureTransport).
     * @param value
     *            The boolean to compare against.
     */
    public BooleanCondition(String key, boolean value) {
        super.type = "Bool";
        super.conditionKey = key;
        super.values = Arrays.asList(new String[] {Boolean.toString(value)});
    }
}
