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
package com.amazonaws.auth.policy;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.auth.policy.conditions.ConditionFactory;
import com.amazonaws.auth.policy.conditions.NumericCondition;
import com.amazonaws.auth.policy.conditions.NumericCondition.NumericComparisonType;

/**
 * AWS access control policy conditions are contained in {@link Statement}
 * objects, and affect when a statement is applied. For example, a statement
 * that allows access to an Amazon SQS queue could use a condition to only apply
 * the effect of that statement for requests that are made before a certain
 * date, or that originate from a range of IP addresses.
 * <p>
 * Multiple conditions can be included in a single statement, and all conditions
 * must evaluate to true in order for the statement to take effect.
 * <p>
 * The set of conditions is D in the statement
 * "A has permission to do B to C where D applies."
 * <p>
 * A condition is composed of three parts:
 * <ul>
 * <li><b>Condition Key</b> - The condition key declares which value of a
 * request to pull in and compare against when a policy is evaluated by AWS. For
 * example, using {@link ConditionFactory#SOURCE_IP_CONDITION_KEY} will cause
 * AWS to pull in the current request's source IP as the first value to compare
 * against every time your policy is evaluated.
 * <li><b>Comparison Type</b> - Most condition types allow several ways to
 * compare the value obtained from the condition key and the comparison value.
 * For example, the {@link NumericComparisonType} enumerates the ways a
 * {@link NumericCondition} can be evaluated (less than, greater than, equals,
 * etc).
 * <li><b>Comparison Value</b> - This is a static value used as the second value
 * in the comparison when your policy is evaluated. Depending on the comparison
 * type, this value can optionally use wildcards. See the documentation for
 * individual comparison types for more information.
 * </ul>
 * <p>
 * There are many expressive conditions available in the
 * <code>com.amazonaws.auth.policy.conditions</code> package to use in access
 * control policy statements.
 * <p>
 * This class is not intended to be directly subclassed by users, instead users
 * should use the many available conditions and condition factories in the
 * com.amazonaws.auth.policy.conditions package.
 */
public class Condition {
    protected String type;
    protected String conditionKey;
    protected List<String> values;

    /**
     * Returns the type of this condition.
     *
     * @return The type of this condition.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of this condition.
     *
     * @param type
     *            The type of this condition.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the name of the condition key involved in this condition.
     * Condition keys are predefined values supported by AWS that provide input
     * to a condition's evaluation, such as the current time, or the IP address
     * of the incoming request.
     * <p>
     * Your policy is evaluated for each incoming request, and condition keys
     * specify what information to pull out of those incoming requests and plug
     * into the conditions in your policy.
     *
     * @return The name of the condition key involved in this condition.
     */
    public String getConditionKey() {
        return conditionKey;
    }

    /**
     * Sets the name of the condition key involved in this condition.
     * Condition keys are predefined values supported by AWS that provide
     * input to a condition's evaluation, such as the current time, or the IP
     * address of the incoming request.
     * <p>
     * Your policy is evaluated for each incoming request, and condition keys
     * specify what information to pull out of those incoming requests and plug
     * into the conditions in your policy.
     *
     * @param conditionKey
     *            The name of the condition key involved in this condition.
     */
    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
    }

    /**
     * Returns the values specified for this access control policy condition.
     * For example, in a condition that compares the incoming IP address of a
     * request to a specified range of IP addresses, the range of IP addresses
     * is the single value in the condition.
     * <p>
     * Most conditions accept only one value, but multiple values are possible.
     *
     * @return The values specified for this access control policy condition.
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * Sets the values specified for this access control policy condition. For
     * example, in a condition that compares the incoming IP address of a
     * request to a specified range of IP addresses, the range of IP addresses
     * is the single value in the condition.
     * <p>
     * Most conditions accept only one value, but multiple values are possible.
     *
     * @param values
     *            The values specified for this access control policy condition.
     */
    public void setValues(List<String> values) {
        this.values = values;
    }

    /**
     * Fluent version of {@link Condition#setType(String)}
     * @return this
     */
    public Condition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Fluent version of {@link Condition#setConditionKey(String)}
     * @return this
     */
    public Condition withConditionKey(String key) {
        setConditionKey(key);
        return this;
    }

    /**
     * Fluent version of {@link Condition#setValues(List)}
     * @return this
     */
    public Condition withValues(String... values) {
        setValues(Arrays.asList(values));
        return this;
    }


    /**
     * Fluent version of {@link Condition#setValues(List)}
     * @return this
     */
    public Condition withValues(List<String> values) {
        setValues(values);
        return this;
    }
}
