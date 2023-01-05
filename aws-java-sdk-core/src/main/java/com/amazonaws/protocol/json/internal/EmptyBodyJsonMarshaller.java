/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.protocol.json.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.json.StructuredJsonGenerator;

/**
 * Interface to marshall an empty request body according to the JSON protocol specification.
 */
@SdkInternalApi
public interface EmptyBodyJsonMarshaller {

    /**
     * Renders an empty request body as JSON explicit null, 'null'. Used for legacy use cases, especially
     * where backwards compatibility must be preserved.
     */
    EmptyBodyJsonMarshaller NULL = new EmptyBodyJsonMarshaller() {
        @Override
        public void marshall(StructuredJsonGenerator generator) {
            generator.writeNull();
        }
    };

    /**
     * Renders an empty JSON object, {}. This is the specification compliant way to represent an empty request body.
     */
    EmptyBodyJsonMarshaller EMPTY = new EmptyBodyJsonMarshaller() {
        @Override
        public void marshall(StructuredJsonGenerator generator) {
            generator.writeStartObject();
            generator.writeEndObject();
        }
    };

    void marshall(StructuredJsonGenerator generator);

}
