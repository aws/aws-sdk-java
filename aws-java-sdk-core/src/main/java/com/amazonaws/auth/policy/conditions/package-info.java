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

/**
 * Collection of AWS access control policy conditions.  The primary access policy
 * conditions are:
 * <ul>
 *    <li> {@link com.amazonaws.auth.policy.conditions.ArnCondition}
 *    <li> {@link com.amazonaws.auth.policy.conditions.BooleanCondition}
 *    <li> {@link com.amazonaws.auth.policy.conditions.DateCondition}
 *    <li> {@link com.amazonaws.auth.policy.conditions.IpAddressCondition}
 *    <li> {@link com.amazonaws.auth.policy.conditions.NumericCondition}
 *    <li> {@link com.amazonaws.auth.policy.conditions.StringCondition}
 * </ul>
 *
 * <p>
 * In addition to the primary condition types, service specific functionality
 * is also provided.
 */
package com.amazonaws.auth.policy.conditions;
