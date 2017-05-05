/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.transfer;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/**
 * An interface that specifies a filter to apply when transferring a directory.
 */
public interface KeyFilter {
    /**
     * Default filter that includes all keys.
     */
    KeyFilter INCLUDE_ALL = new KeyFilter() {
        @Override
        public boolean shouldInclude(S3ObjectSummary objectSummary) {
            return true;
        }
    };

    /**
     * Logic to determine if this key should be included or not.
     * @param objectSummary the {@link S3ObjectSummary} for the key
     * @return will return true if the key should be transferred, false if not
     */
    boolean shouldInclude(S3ObjectSummary objectSummary);
}
