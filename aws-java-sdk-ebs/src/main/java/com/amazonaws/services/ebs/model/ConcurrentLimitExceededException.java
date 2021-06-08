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
package com.amazonaws.services.ebs.model;

import javax.annotation.Generated;

/**
 * <p>
 * You have reached the limit for concurrent API requests. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapi-performance">Optimizing
 * performance of the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConcurrentLimitExceededException extends com.amazonaws.services.ebs.model.AmazonEBSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConcurrentLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConcurrentLimitExceededException(String message) {
        super(message);
    }

}
