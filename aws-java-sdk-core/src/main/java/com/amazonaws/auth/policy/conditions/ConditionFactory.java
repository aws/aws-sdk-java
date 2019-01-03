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
import com.amazonaws.auth.policy.conditions.ArnCondition.ArnComparisonType;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;

/**
 * Factory for creating common AWS access control policy conditions. These
 * conditions are common for AWS services and can be expected to work across any
 * service that supports AWS access control policies.
 */
public class ConditionFactory {

    /**
     * Condition key for the current time.
     * <p>
     * This condition key should only be used with {@link DateCondition}
     * objects.
     */
    public static final String CURRENT_TIME_CONDITION_KEY = "aws:CurrentTime";

    /**
     * Condition key for whether or not an incoming request is using a secure
     * transport to make the request (i.e. HTTPS instead of HTTP).
     * <p>
     * This condition key should only be used with {@link BooleanCondition}
     * objects.
     */
    public static final String SECURE_TRANSPORT_CONDITION_KEY = "aws:SecureTransport";

    /**
     * Condition key for the source IP from which a request originates.
     * <p>
     * This condition key should only be used with {@link IpAddressCondition}
     * objects.
     */
    public static final String SOURCE_IP_CONDITION_KEY = "aws:SourceIp";

    /**
     * Condition key for the user agent included in a request.
     * <p>
     * This condition key should only be used with {@link StringCondition}
     * objects.
     */
    public static final String USER_AGENT_CONDITION_KEY = "aws:UserAgent";

    /**
     * Condition key for the current time, in epoch seconds.
     * <p>
     * This condition key should only be used with {@link NumericCondition}
     * objects.
     */
    public static final String EPOCH_TIME_CONDITION_KEY = "aws:EpochTime";

    /**
     * Condition key for the referer specified by a request.
     * <p>
     * This condition key should only be used with {@link StringCondition}
     * objects.
     */
    public static final String REFERER_CONDITION_KEY = "aws:Referer";

    /**
     * Condition key for the Amazon Resource Name (ARN) of the source specified
     * in a request. The source ARN indicates which resource is affecting the
     * resource listed in your policy. For example, an SNS topic is the source
     * ARN when publishing messages from the topic to an SQS queue.
     * <p>
     * This condition key should only be used with {@link ArnCondition} objects.
     */
    public static final String SOURCE_ARN_CONDITION_KEY = "aws:SourceArn";

    private ConditionFactory() {}

    /**
     * Constructs a new access policy condition that compares the Amazon
     * Resource Name (ARN) of the source of an AWS resource that is modifying
     * another AWS resource with the specified pattern.
     * <p>
     * For example, the source ARN could be an Amazon SNS topic ARN that is
     * sending messages to an Amazon SQS queue. In that case, the SNS topic ARN
     * would be compared the ARN pattern specified here.
     * <p>
     * The endpoint pattern may optionally contain the multi-character wildcard
     * (*) or the single-character wildcard (?). Each of the six colon-delimited
     * components of the ARN is checked separately and each can include a
     * wildcard.
     *
     * <pre class="brush: java">
     * Policy policy = new Policy(&quot;MyQueuePolicy&quot;);
     * policy.withStatements(new Statement(&quot;AllowSNSMessages&quot;, Effect.Allow)
     *         .withPrincipals(new Principal(&quot;*&quot;)).withActions(SQSActions.SendMessage)
     *         .withResources(new Resource(myQueueArn))
     *         .withConditions(ConditionFactory.newSourceArnCondition(myTopicArn)));
     * </pre>
     *
     * @param arnPattern
     *            The ARN pattern against which the source ARN will be compared.
     *            Each of the six colon-delimited components of the ARN is
     *            checked separately and each can include a wildcard.
     *
     * @return A new access control policy condition that compares the ARN of
     *         the source specified in an incoming request with the ARN pattern
     *         specified here.
     */
    public static Condition newSourceArnCondition(String arnPattern) {
        return new ArnCondition(ArnComparisonType.ArnLike, SOURCE_ARN_CONDITION_KEY, arnPattern);
    }

    /**
     * Constructs a new access control policy condition that tests if the
     * incoming request was sent over a secure transport (HTTPS).
     *
     * @return A new access control policy condition that tests if the incoming
     *         request was sent over a secure transport (HTTPS).
     */
    public static Condition newSecureTransportCondition() {
        return new BooleanCondition(SECURE_TRANSPORT_CONDITION_KEY, true);
    }

    /**
     * Constructs a new access control policy condition that tests the incoming
     * request's user agent field against the specified value, using the
     * specified comparison type. This condition can be used to allow or deny
     * access to a resource based on what user agent is specified in the
     * request.
     *
     * @param comparisonType
     *            The type of string comparison to perform when testing an
     *            incoming request's user agent field with the specified value.
     * @param value
     *            The value against which to compare the incoming request's user
     *            agent.
     *
     * @return A new access control policy condition that tests an incoming
     *         request's user agent field.
     */
    public static Condition newUserAgentCondition(StringComparisonType comparisonType, String value) {
        return new StringCondition(comparisonType, USER_AGENT_CONDITION_KEY, value);
    }

    /**
     * Constructs a new access control policy condition that tests the incoming
     * request's referer field against the specified value, using the specified
     * comparison type.
     *
     * @param comparisonType
     *            The type of string comparison to perform when testing an
     *            incoming request's referer field with the specified value.
     * @param value
     *            The value against which to compare the incoming request's
     *            referer field.
     *
     * @return A new access control policy condition that tests an incoming
     *         request's referer field.
     */
    public static Condition newRefererCondition(StringComparisonType comparisonType, String value) {
        return new StringCondition(comparisonType, REFERER_CONDITION_KEY, value);
    }
}
