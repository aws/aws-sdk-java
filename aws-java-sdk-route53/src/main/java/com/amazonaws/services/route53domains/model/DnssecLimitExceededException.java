/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import javax.annotation.Generated;

/**
 * <p>
 * This error is returned if you call <code>AssociateDelegationSignerToDomain</code> when the specified domain has
 * reached the maximum number of DS records. You can't add any additional DS records unless you delete an existing one
 * first.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnssecLimitExceededException extends com.amazonaws.services.route53domains.model.AmazonRoute53DomainsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DnssecLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DnssecLimitExceededException(String message) {
        super(message);
    }

}
