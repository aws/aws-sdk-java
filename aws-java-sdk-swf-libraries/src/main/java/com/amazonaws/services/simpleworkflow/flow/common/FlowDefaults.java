/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.common;

public class FlowDefaults {
    public static final long EXPONENTIAL_RETRY_MAXIMUM_RETRY_INTERVAL_SECONDS =  FlowConstants.NONE;
    public static final long EXPONENTIAL_RETRY_RETRY_EXPIRATION_SECONDS =  FlowConstants.NONE;
    public static final double EXPONENTIAL_RETRY_BACKOFF_COEFFICIENT =  2;
    public static final int EXPONENTIAL_RETRY_MAXIMUM_ATTEMPTS =  FlowConstants.NONE;
}
