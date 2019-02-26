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
package com.amazonaws.services.marketplacemetering.model;

import javax.annotation.Generated;

/**
 * <p>
 * The submitted registration token has expired. This can happen if the buyer's browser takes too long to redirect to
 * your page, the buyer has resubmitted the registration token, or your application has held on to the registration
 * token for too long. Your SaaS registration website should redeem this token as soon as it is submitted by the buyer's
 * browser.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpiredTokenException extends com.amazonaws.services.marketplacemetering.model.AWSMarketplaceMeteringException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ExpiredTokenException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExpiredTokenException(String message) {
        super(message);
    }

}
