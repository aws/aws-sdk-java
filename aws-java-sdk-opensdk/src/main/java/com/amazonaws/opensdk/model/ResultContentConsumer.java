/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.model;

import java.io.InputStream;

@FunctionalInterface
public interface ResultContentConsumer {
    /**
     * Consume the content stream associated with the given result.
     * <p>
     * <b>Important:</b> The content stream should be assumed to be valid only
     * within this method; users should not interact with the stream after
     * returning control.
     *
     * @param result The result of the operation.
     * @param content The content stream of the result.
     */
    void consume(RawResult result, InputStream content);
}
