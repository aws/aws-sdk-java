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
package com.amazonaws.services.snowball.model;

import javax.annotation.Generated;

/**
 * <p>
 * Job creation failed. Currently, clusters support five nodes. If you have less than five nodes for your cluster and
 * you have more nodes to create for this cluster, try again and create jobs until your cluster has exactly five notes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterLimitExceededException extends com.amazonaws.services.snowball.model.AmazonSnowballException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ClusterLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ClusterLimitExceededException(String message) {
        super(message);
    }

}
