/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * You've reached the limit on the number of unique target groups per load balancer across all listeners. If a target
 * group is used by multiple actions for a load balancer, it is counted as only one use.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyUniqueTargetGroupsPerLoadBalancerException extends com.amazonaws.services.elasticloadbalancingv2.model.AmazonElasticLoadBalancingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TooManyUniqueTargetGroupsPerLoadBalancerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyUniqueTargetGroupsPerLoadBalancerException(String message) {
        super(message);
    }

}
