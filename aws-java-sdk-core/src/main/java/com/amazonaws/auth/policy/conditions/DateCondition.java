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
import java.util.Date;

import com.amazonaws.auth.policy.Condition;
import com.amazonaws.util.DateUtils;

/**
 * AWS access control policy condition that allows an access control statement
 * to be conditionally applied based on the comparison of the current time at
 * which a request is received, and a specific date.
 */
public class DateCondition extends Condition {

    /**
     * Enumeration of the supported ways a date comparison can be evaluated.
     */
    public static enum DateComparisonType {
        DateEquals,
        DateGreaterThan,
        DateGreaterThanEquals,
        DateLessThan,
        DateLessThanEquals,
        DateNotEquals;
    };

    /**
     * Constructs a new access policy condition that compares the current time
     * (on the AWS servers) to the specified date.
     *
     * @param type
     *            The type of comparison to perform. For example,
     *            {@link DateComparisonType#DateLessThan} will cause this policy
     *            condition to evaluate to true if the current date is less than
     *            the date specified in the second argument.
     * @param date
     *            The date to compare against.
     */
    public DateCondition(DateComparisonType type, Date date) {
        super.type = type.toString();
        super.conditionKey = ConditionFactory.CURRENT_TIME_CONDITION_KEY;
        super.values = Arrays.asList(new String[] {DateUtils.formatISO8601Date(date)});
    }

}
