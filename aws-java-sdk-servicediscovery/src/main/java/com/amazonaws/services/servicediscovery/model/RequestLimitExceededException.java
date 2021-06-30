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
package com.amazonaws.services.servicediscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation can't be completed because you've reached the quota for the number of requests. For more information,
 * see <a href="https://docs.aws.amazon.com/cloud-map/latest/dg/throttling.html">Cloud Map API request throttling
 * quota</a> in the <i>Cloud Map Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestLimitExceededException extends com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RequestLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RequestLimitExceededException(String message) {
        super(message);
    }

}
