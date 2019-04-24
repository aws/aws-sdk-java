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
 * This operation can't be completed either because the current account has reached the limit on reusable delegation
 * sets that it can create or because you've reached the limit on the number of Amazon VPCs that you can associate with
 * a private hosted zone. To get the current limit on the number of reusable delegation sets, see <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html">GetAccountLimit</a>. To get
 * the current limit on the number of Amazon VPCs that you can associate with a private hosted zone, see <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHostedZoneLimit.html">GetHostedZoneLimit</a>. To
 * request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support
 * Center.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitsExceededException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitsExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitsExceededException(String message) {
        super(message);
    }

}
