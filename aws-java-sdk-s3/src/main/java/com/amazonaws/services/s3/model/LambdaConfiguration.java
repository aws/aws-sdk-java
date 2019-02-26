/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import java.util.EnumSet;

/**
 * Represents the lambda configuration for an Amazon S3 bucket notification.
 *
 */
public class LambdaConfiguration extends NotificationConfiguration implements Serializable {

    /**
     * The ARN for the lambda function to be invoked.
     */
    private final String functionARN;

    /**
     * Creates a new lambda configuration with the given cloud function arn
     * and set of events.
     *
     * @param functionARN
     *            the ARN of the lambda function to be invoked
     * @param events
     *            the events for which the notifications are to be sent
     */
    public LambdaConfiguration(String functionARN, EnumSet<S3Event> events) {
        super(events);
        this.functionARN = functionARN;
    }

    /**
     * Creates a new lambda configuration with the given cloud function arn
     * and set of events.
     *
     * @param functionARN
     *            the ARN of the lambda function to be invoked
     * @param events
     *            the events for which the notifications are to be sent
     */
    public LambdaConfiguration(String functionARN, String... events) {
        super(events);
        this.functionARN = functionARN;
    }

    /**
     * Returns the ARN of the cloud function to be invoked.
     */
    public String getFunctionARN() {
        return functionARN;
    }
}
