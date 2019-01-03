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
 * AWS access control policy condition that allows an access control statement
 * to be conditionally applied based on the comparison of the the incoming
 * source IP address at the time of a request against a CIDR IP range.
 * <p>
 * For more information about CIDR IP ranges, see <a
 * href="http://en.wikipedia.org/wiki/CIDR_notation">
 * http://en.wikipedia.org/wiki/CIDR_notation</a>
 */
public class IpAddressCondition extends Condition {

    /**
     * Enumeration of the supported ways an IP address comparison can be evaluated.
     */
    public static enum IpAddressComparisonType {
        /**
         * Matches an IP address against a CIDR IP range, evaluating to true if
         * the IP address being tested is in the condition's specified CIDR IP
         * range.
         * <p>
         * For more information about CIDR IP ranges, see <a
         * href="http://en.wikipedia.org/wiki/CIDR_notation">
         * http://en.wikipedia.org/wiki/CIDR_notation</a>
         */
        IpAddress,

        /** Negated form of {@link #IpAddress} */
        NotIpAddress,
    }

    /**
     * Constructs a new access policy condition that compares the source IP
     * address of the incoming request to an AWS service against the specified
     * CIDR range. The condition evaluates to true (meaning the policy statement
     * containing it will be applied) if the incoming source IP address is
     * within that range.
     * <p>
     * To achieve the opposite effect (i.e. cause the condition to evaluate to
     * true when the incoming source IP is <b>not</b> in the specified CIDR
     * range) use the alternate constructor form and specify
     * {@link IpAddressComparisonType#NotIpAddress}
     * <p>
     * For more information about CIDR IP ranges, see <a
     * href="http://en.wikipedia.org/wiki/CIDR_notation">
     * http://en.wikipedia.org/wiki/CIDR_notation</a>
     *
     * @param ipAddressRange
     *            The CIDR IP range involved in the policy condition.
     */
    public IpAddressCondition(String ipAddressRange) {
        this(IpAddressComparisonType.IpAddress, ipAddressRange);
    }

    /**
     * Constructs a new access policy condition that compares the source IP
     * address of the incoming request to an AWS service against the specified
     * CIDR range. When the condition evaluates to true (i.e. when the incoming
     * source IP address is within the CIDR range or not) depends on the
     * specified {@link IpAddressComparisonType}.
     * <p>
     * For more information about CIDR IP ranges, see <a
     * href="http://en.wikipedia.org/wiki/CIDR_notation">
     * http://en.wikipedia.org/wiki/CIDR_notation</a>
     *
     * @param type
     *            The type of comparison to to perform.
     * @param ipAddressRange
     *            The CIDR IP range involved in the policy condition.
     */
    public IpAddressCondition(IpAddressComparisonType type, String ipAddressRange) {
        super.type = type.toString();
        super.conditionKey = ConditionFactory.SOURCE_IP_CONDITION_KEY;
        super.values = Arrays.asList(new String[] {ipAddressRange});
    }

}
