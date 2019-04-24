/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * This traffic policy version can't be created because you've reached the limit of 1000 on the number of versions that
 * you can create for the current traffic policy.
 * </p>
 * <p>
 * To create more traffic policy versions, you can use <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicy.html">GetTrafficPolicy</a> to get
 * the traffic policy document for a specified traffic policy version, and then use <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html">CreateTrafficPolicy</a>
 * to create a new traffic policy using the traffic policy document.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyTrafficPolicyVersionsForCurrentPolicyException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TooManyTrafficPolicyVersionsForCurrentPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyTrafficPolicyVersionsForCurrentPolicyException(String message) {
        super(message);
    }

}
