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
package com.amazonaws.services.kinesisvideo.model;

import javax.annotation.Generated;

/**
 * <p>
 * The Exception rendered when the Amazon Kinesis Video Stream can't find a stream's edge configuration that you
 * specified.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamEdgeConfigurationNotFoundException extends com.amazonaws.services.kinesisvideo.model.AmazonKinesisVideoException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new StreamEdgeConfigurationNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public StreamEdgeConfigurationNotFoundException(String message) {
        super(message);
    }

}
