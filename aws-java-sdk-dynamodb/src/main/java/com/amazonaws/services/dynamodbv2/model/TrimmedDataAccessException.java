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
package com.amazonaws.services.dynamodbv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation attempted to read past the oldest stream record in a shard.
 * </p>
 * <p>
 * In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are
 * subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You request a shard iterator with a sequence number older than the trim point (24 hours).
 * </p>
 * </li>
 * <li>
 * <p>
 * You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a stream record in
 * the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer
 * exists.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrimmedDataAccessException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TrimmedDataAccessException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TrimmedDataAccessException(String message) {
        super(message);
    }

}
