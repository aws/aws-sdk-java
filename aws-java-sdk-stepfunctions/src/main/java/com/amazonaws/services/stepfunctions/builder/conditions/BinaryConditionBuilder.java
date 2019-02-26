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
package com.amazonaws.services.stepfunctions.builder.conditions;

import com.amazonaws.annotation.SdkInternalApi;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Builder abstraction for binary conditions used in {@link com.fasterxml.jackson.databind.deser.ContextualDeserializer}
 */
@SdkInternalApi
abstract class BinaryConditionBuilder implements Condition.Builder {

    abstract BinaryConditionBuilder variable(String variable);

    /**
     * Internal API to set the expected value of a condition from a JSON document. Subclass handles marshalling to appropriate
     * type.
     *
     * @param expectedValue JSON document representing the expected value.
     * @return This object for method chaining.
     */
    abstract BinaryConditionBuilder expectedValue(JsonNode expectedValue);

    /**
     * @return Type identifier for condition. Used as field name for the expected value.
     */
    @JsonIgnore
    abstract String type();
}
