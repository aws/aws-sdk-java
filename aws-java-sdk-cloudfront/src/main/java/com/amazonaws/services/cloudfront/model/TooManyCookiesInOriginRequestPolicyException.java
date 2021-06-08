/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import javax.annotation.Generated;

/**
 * <p>
 * The number of cookies in the origin request policy exceeds the maximum. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a> (formerly
 * known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyCookiesInOriginRequestPolicyException extends com.amazonaws.services.cloudfront.model.AmazonCloudFrontException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TooManyCookiesInOriginRequestPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyCookiesInOriginRequestPolicyException(String message) {
        super(message);
    }

}
