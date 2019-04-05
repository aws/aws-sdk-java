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
 * The health check you're attempting to create already exists. Amazon Route 53 returns this error when you submit a
 * request that has the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The same value for <code>CallerReference</code> as an existing health check, and one or more values that differ from
 * the existing health check that has the same caller reference.
 * </p>
 * </li>
 * <li>
 * <p>
 * The same value for <code>CallerReference</code> as a health check that you created and later deleted, regardless of
 * the other settings in the request.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckAlreadyExistsException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new HealthCheckAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public HealthCheckAlreadyExistsException(String message) {
        super(message);
    }

}
