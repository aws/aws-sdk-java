/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @deprecated use {@link LambdaConfiguration} instead
 */
@Deprecated
public class CloudFunctionConfiguration extends NotificationConfiguration implements Serializable {

    /**
     * The ARN for the IAM role to be used by Amazon S3.
     */
    private final String invocationRoleARN;

    /**
     * The ARN for the lambda function to be invoked.
     */
    private final String cloudFunctionARN;

    /**
     * Creates a new lambda configuration with the given invocation role ,
     * function and set of events.
     *
     * @param invocationRole
     *            the IAM role to be used by Amazon S3 for authentication.
     * @param function
     *            the ARN of the lambda function to be invoked
     * @param events
     *            the events for which the notifications are to be sent
     */
    public CloudFunctionConfiguration(String invocationRole, String function,
            EnumSet<S3Event> events) {
        super(events);
        this.invocationRoleARN = invocationRole;
        this.cloudFunctionARN = function;
    }

    /**
     * Creates a new lambda configuration with the given invocation role ,
     * function and set of events.
     *
     * @param invocationRole
     *            the IAM role to be used by Amazon S3 for authentication.
     * @param function
     *            the ARN of the lambda function to be invoked
     * @param events
     *            the events for which the notifications are to be sent
     */
    public CloudFunctionConfiguration(String invocationRole, String function,
            String... events) {
        super(events);
        this.invocationRoleARN = invocationRole;
        this.cloudFunctionARN = function;
    }

    /**
     * Returns the invocation role associated with this configuration.
     */
    public String getInvocationRoleARN() {
        return invocationRoleARN;
    }

    /**
     * Returns the ARN of the cloud function to be invoked.
     */
    public String getCloudFunctionARN() {
        return cloudFunctionARN;
    }

}
