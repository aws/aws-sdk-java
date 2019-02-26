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

package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Interface to marshall an object to the JSON payload using a {@link StructuredJsonGenerator}.
 *
 * @param <T> Type of object to marshall.
 */
@SdkProtectedApi
public interface StructuredJsonMarshaller<T> {

    /**
     * Marshalls the value using the {@link StructuredJsonGenerator}.
     *
     * @param val           Object to marshall.
     * @param jsonGenerator {@link StructuredJsonGenerator} with methods to write various types to the JSON document.
     */
    void marshall(T val, StructuredJsonGenerator jsonGenerator);
}
