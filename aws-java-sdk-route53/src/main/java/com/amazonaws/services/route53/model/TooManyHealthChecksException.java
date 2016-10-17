/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * You have reached the maximum number of active health checks for an AWS account. The default limit is 100. To request
 * a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support Center.
 * </p>
 */
public class TooManyHealthChecksException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TooManyHealthChecksException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyHealthChecksException(String message) {
        super(message);
    }

}
