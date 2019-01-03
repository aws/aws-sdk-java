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
package com.amazonaws.services.kinesisfirehose.model;

import javax.annotation.Generated;

/**
 * <p>
 * The service is unavailable. Back off and retry the operation. If you continue to see the exception, throughput limits
 * for the delivery stream may have been exceeded. For more information about limits and how to request an increase, see
 * <a href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Data Firehose Limits</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUnavailableException extends com.amazonaws.services.kinesisfirehose.model.AmazonKinesisFirehoseException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceUnavailableException(String message) {
        super(message);
    }

}
