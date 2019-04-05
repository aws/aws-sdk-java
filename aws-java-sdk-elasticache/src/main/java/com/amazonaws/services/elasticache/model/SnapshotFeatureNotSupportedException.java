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
package com.amazonaws.services.elasticache.model;

import javax.annotation.Generated;

/**
 * <p>
 * You attempted one of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creating a snapshot of a Redis cluster running on a <code>cache.t1.micro</code> cache node.
 * </p>
 * </li>
 * <li>
 * <p>
 * Creating a snapshot of a cluster that is running Memcached rather than Redis.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Neither of these are supported by ElastiCache.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotFeatureNotSupportedException extends com.amazonaws.services.elasticache.model.AmazonElastiCacheException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SnapshotFeatureNotSupportedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SnapshotFeatureNotSupportedException(String message) {
        super(message);
    }

}
