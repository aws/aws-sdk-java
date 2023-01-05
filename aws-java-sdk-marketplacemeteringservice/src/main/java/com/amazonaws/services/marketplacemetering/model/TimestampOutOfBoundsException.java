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
package com.amazonaws.services.marketplacemetering.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>timestamp</code> value passed in the <code>UsageRecord</code> is out of allowed range.
 * </p>
 * <p>
 * For <code>BatchMeterUsage</code>, if any of the records are outside of the allowed range, the entire batch is not
 * processed. You must remove invalid records and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestampOutOfBoundsException extends com.amazonaws.services.marketplacemetering.model.AWSMarketplaceMeteringException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TimestampOutOfBoundsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TimestampOutOfBoundsException(String message) {
        super(message);
    }

}
