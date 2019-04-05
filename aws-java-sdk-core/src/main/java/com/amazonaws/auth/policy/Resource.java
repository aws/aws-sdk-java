/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy;

/**
 * Represents a resource involved in an AWS access control policy statement.
 * Resources are the service specific AWS entities owned by your account. Amazon
 * SQS queues, Amazon S3 buckets and objects, and Amazon SNS topics are all
 * examples of AWS resources.
 * <p>
 * The standard way of specifying an AWS resource is with an Amazon Resource
 * Name (ARN).
 * <p>
 * The resource is C in the statement
 * "A has permission to do B to C where D applies."
 */
public class Resource {
    private final String resource;
    private boolean isNotType;

    /**
     * Constructs a new AWS access control policy resource. Resources are
     * typically specified as Amazon Resource Names (ARNs).
     * <p>
     * You specify the resource using the following Amazon Resource Name (ARN)
     * format:
     * <b>arn:aws:&lt;vendor>:&lt;region>:&lt;namespace>:&lt;relative-id></b>
     * <p>
     * <ul>
     * <li>vendor identifies the AWS product (e.g., sns)</li>
     * <li>region is the AWS Region the resource resides in (e.g., us-east-1),
     * if any
     * <li>namespace is the AWS account ID with no hyphens (e.g., 123456789012)
     * <li>relative-id is the service specific portion that identifies the
     * specific resource
     * </ul>
     * <p>
     * For example, an Amazon SQS queue might be addressed with the following
     * ARN: <b>arn:aws:sqs:us-east-1:987654321000:MyQueue</b>
     * <p>
     * Some resources may not use every field in an ARN. For example, resources
     * in Amazon S3 are global, so they omit the region field:
     * <b>arn:aws:s3:::bucket/*</b>
     *
     * @param resource
     *            The Amazon Resource Name (ARN) uniquely identifying the
     *            desired AWS resource.
     */
    public Resource(String resource) {
        this.resource = resource;
    }

    /**
     * Returns the resource ID, typically an Amazon Resource Name (ARN),
     * identifying this resource.
     *
     * @return The resource ID, typically an Amazon Resource Name (ARN),
     *         identifying this resource.
     */
    public String getId() {
        return resource;
    }

    /**
     * Returns whether this Resource is a NotResource element, which explicitly matches everything except the specified
     * list of resources. Note that Statements must include either a Resource or a NotResource element
     *
     * @return the type of the Resource. If true, this resource will be rendered as a NotResource element in the
     * Statement
     */
    public boolean isNotType() {
        return isNotType;
    }

    /**
     * Sets whether this resource is a NotResource, which explicitly matches everything except the specified list
     * of resources. Note that Statements must include either a Resource or a NotResource element
     *
     * @param isNotType the type. If true, this resource will be rendered as a NotResource element in the Statement
     * @return The updated Resource object so that additional method calls can
     *         be chained together.
     */
    public Resource withIsNotType(boolean isNotType) {
        this.isNotType = isNotType;
        return this;
    }
}
