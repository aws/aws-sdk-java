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

import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;

/**
 * Factory for creating access control policy conditions specific to Amazon
 * Simple Notification Service. This class provides access to the AWS access
 * control policy condition keys specific to Amazon SNS, as well as methods for
 * quickly creating common SNS specific policy conditions such as
 * {@link #newEndpointCondition(String)}.
 */
public class SNSConditionFactory {

    /**
     * Condition key for The URL, e-mail address, or ARN from a Subscribe
     * request or a previously confirmed subscription. Use with string
     * conditions to restrict access to specific endpoints (e.g.,
     * *@mycompany.com).
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String ENDPOINT_CONDITION_KEY = "sns:Endpoint";

    /**
     * Condition key for the protocol value from a Subscribe request or a
     * previously confirmed subscription. Use with string conditions to restrict
     * publication to specific delivery protocols (e.g., HTTPS).
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String PROTOCOL_CONDITION_KEY = "sns:Protocol";

    private SNSConditionFactory() {}

    /**
     * Constructs a new access policy condition that compares the requested
     * endpoint used to subscribe to an Amazon SNS topic with the specified
     * endpoint pattern. The endpoint pattern may optionally contain the
     * multi-character wildcard (*) or the single-character wildcard (?).
     * <p>
     * For example, this condition can restrict subscriptions to a topic to
     * email addresses in a certain domain ("*@my-company.com").
     *
     * <pre class="brush: java">
     * Policy policy = new Policy(&quot;MyTopicPolicy&quot;);
     * policy.withStatements(new Statement(&quot;RestrictSubscriptions&quot;, Effect.Allow)
     *         .withPrincipals(new Principal(&quot;*&quot;)).withActions(SNSActions.Subscribe)
     *         .withResources(new Resource(myTopicArn))
     *         .withConditions(SNSConditionFactory.newEndpointCondition(&quot;*@my-company.com&quot;)));
     * </pre>
     *
     * @param endpointPattern
     *            The endpoint pattern against which to compare the requested
     *            endpoint for an Amazon SNS topic subscription.
     *
     * @return A new access control policy condition that compares the endpoint
     *         used in a request to subscribe to an Amazon SNS topic with the
     *         endpoint pattern specified.
     */
    public static Condition newEndpointCondition(String endpointPattern) {
        return new StringCondition(StringComparisonType.StringLike,
                ENDPOINT_CONDITION_KEY, endpointPattern);
    }

    /**
     * Constructs a new AWS access control policy condition that allows an
     * access control statement to restrict subscriptions to an Amazon SNS topic
     * based on the protocol being used for the subscription. For example, this
     * condition can restrict subscriptions to a topic to endpoints using HTTPS
     * to ensure that messages are securely delivered.
     *
     * @param protocol
     *            The protocol against which to compare the requested protocol
     *            for an Amazon SNS topic subscription.
     *
     * @return A new access control policy condition that compares the
     *         notification protocol requested in a request to subscribe to an
     *         Amazon SNS topic with the protocol value specified.
     */
    public static Condition newProtocolCondition(String protocol) {
        return new StringCondition(StringComparisonType.StringEquals,
                PROTOCOL_CONDITION_KEY, protocol);
    }

}
