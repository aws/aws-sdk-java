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
 * String conditions let you constrain AWS access control policy statements
 * using string matching rules.
 */
public class StringCondition extends Condition {

    /**
     * Enumeration of the supported ways a string comparison can be evaluated.
     */
    public static enum StringComparisonType {
        /** Case-sensitive exact string matching */
        StringEquals,

        /** Case-insensitive string matching */
        StringEqualsIgnoreCase,

        /**
         * Loose case-insensitive matching. The values can include a
         * multi-character match wildcard (*) or a single-character match
         * wildcard (?) anywhere in the string.
         */
        StringLike,

        /** Negated form of {@link #StringEquals} */
        StringNotEquals,

        /** Negated form of {@link #StringEqualsIgnoreCase} */
        StringNotEqualsIgnoreCase,

        /** Negated form of {@link #StringLike} */
        StringNotLike;
    }

    /**
     * Constructs a new access control policy condition that compares two
     * strings.
     *
     * @param type
     *            The type of comparison to perform.
     * @param key
     *            The access policy condition key specifying where to get the
     *            first string for the comparison (ex: aws:UserAgent). See
     *            {@link ConditionFactory} for a list of the condition keys
     *            available for all services.
     * @param value
     *            The second string to compare against. When using
     *            {@link StringComparisonType#StringLike} or
     *            {@link StringComparisonType#StringNotLike} this may contain
     *            the multi-character wildcard (*) or the single-character
     *            wildcard (?).
     */
    public StringCondition(StringComparisonType type, String key, String value) {
        super.type = type.toString();
        super.conditionKey = key;
        super.values = Arrays.asList(new String[] {value});
    }

}
