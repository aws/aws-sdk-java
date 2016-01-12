/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request rate is too high, or the requested data is too large for the
 * available throughput. Reduce the frequency or size of your requests. For more
 * information, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html"
 * target="_blank">Error Retries and Exponential Backoff in AWS</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 */
public class ProvisionedThroughputExceededException extends
        AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ProvisionedThroughputExceededException with the
     * specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ProvisionedThroughputExceededException(String message) {
        super(message);
    }

}