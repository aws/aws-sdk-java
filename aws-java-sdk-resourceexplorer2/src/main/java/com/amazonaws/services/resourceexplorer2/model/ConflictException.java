/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourceexplorer2.model;

import javax.annotation.Generated;

/**
 * <p>
 * If you attempted to create a view, then the request failed because either you specified parameters that didn’t match
 * the original request, or you attempted to create a view with a name that already exists in this Amazon Web Services
 * Region.
 * </p>
 * <p>
 * If you attempted to create an index, then the request failed because either you specified parameters that didn't
 * match the original request, or an index already exists in the current Amazon Web Services Region.
 * </p>
 * <p>
 * If you attempted to update an index type to <code>AGGREGATOR</code>, then the request failed because you already have
 * an <code>AGGREGATOR</code> index in a different Amazon Web Services Region.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.resourceexplorer2.model.AWSResourceExplorer2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

}
