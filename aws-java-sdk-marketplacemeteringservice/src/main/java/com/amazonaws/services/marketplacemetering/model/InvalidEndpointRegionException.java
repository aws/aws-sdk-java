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
package com.amazonaws.services.marketplacemetering.model;

/**
 * <p>
 * The endpoint being called is in a region different from your EC2 instance. The region of the Metering service
 * endpoint and the region of the EC2 instance must match.
 * </p>
 */
public class InvalidEndpointRegionException extends com.amazonaws.services.marketplacemetering.model.AWSMarketplaceMeteringException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidEndpointRegionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidEndpointRegionException(String message) {
        super(message);
    }

}
