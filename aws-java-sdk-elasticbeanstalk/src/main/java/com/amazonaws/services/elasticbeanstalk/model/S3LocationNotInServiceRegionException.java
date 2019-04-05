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
package com.amazonaws.services.elasticbeanstalk.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified S3 bucket does not belong to the S3 region in which the service is running. The following regions are
 * supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * IAD/us-east-1
 * </p>
 * </li>
 * <li>
 * <p>
 * PDX/us-west-2
 * </p>
 * </li>
 * <li>
 * <p>
 * DUB/eu-west-1
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LocationNotInServiceRegionException extends com.amazonaws.services.elasticbeanstalk.model.AWSElasticBeanstalkException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new S3LocationNotInServiceRegionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public S3LocationNotInServiceRegionException(String message) {
        super(message);
    }

}
