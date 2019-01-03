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
package com.amazonaws.services.kinesis.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request rate for the stream is too high, or the requested data is too large for the available throughput. Reduce
 * the frequency or size of your requests. For more information, see <a
 * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the
 * <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a
 * href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential Backoff in AWS</a>
 * in the <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedThroughputExceededException extends com.amazonaws.services.kinesis.model.AmazonKinesisException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ProvisionedThroughputExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ProvisionedThroughputExceededException(String message) {
        super(message);
    }

}
