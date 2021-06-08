/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Custom deserializer for a {@link Condition}.
 */
@SdkInternalApi
public class ConditionDeserializer {

    public Condition.Builder deserializeCondition(JsonNode node) {
        if (node.has(PropertyNames.VARIABLE)) {
            if (node.has(PropertyNames.STRING_EQUALS)) {
                return deserializeBinaryCondition(StringEqualsCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_GREATER_THAN)) {
                return deserializeBinaryCondition(StringGreaterThanCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_GREATER_THAN_EQUALS)) {
                return deserializeBinaryCondition(StringGreaterThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_LESS_THAN)) {
                return deserializeBinaryCondition(StringLessThanCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_LESS_THAN_EQUALS)) {
                return deserializeBinaryCondition(StringLessThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_EQUALS_PATH)) {
                return deserializeBinaryCondition(StringEqualsPathCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_GREATER_THAN_PATH)) {
                return deserializeBinaryCondition(StringGreaterThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_GREATER_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(StringGreaterThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_LESS_THAN_PATH)) {
                return deserializeBinaryCondition(StringLessThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_LESS_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(StringLessThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_EQUALS)) {
                return deserializeBinaryCondition(TimestampEqualsCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_GREATER_THAN)) {
                return deserializeBinaryCondition(TimestampGreaterThanCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_GREATER_THAN_EQUALS)) {
                return deserializeBinaryCondition(TimestampGreaterThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_LESS_THAN)) {
                return deserializeBinaryCondition(TimestampLessThanCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_LESS_THAN_EQUALS)) {
                return deserializeBinaryCondition(TimestampLessThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_EQUALS_PATH)) {
                return deserializeBinaryCondition(TimestampEqualsPathCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_GREATER_THAN_PATH)) {
                return deserializeBinaryCondition(TimestampGreaterThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_GREATER_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(TimestampGreaterThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_LESS_THAN_PATH)) {
                return deserializeBinaryCondition(TimestampLessThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.TIMESTAMP_LESS_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(TimestampLessThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_EQUALS)) {
                return deserializeBinaryCondition(NumericEqualsCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_GREATER_THAN)) {
                return deserializeBinaryCondition(NumericGreaterThanCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_GREATER_THAN_EQUALS)) {
                return deserializeBinaryCondition(NumericGreaterThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_LESS_THAN)) {
                return deserializeBinaryCondition(NumericLessThanCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_LESS_THAN_EQUALS)) {
                return deserializeBinaryCondition(NumericLessThanOrEqualCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_EQUALS_PATH)) {
                return deserializeBinaryCondition(NumericEqualsPathCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_GREATER_THAN_PATH)) {
                return deserializeBinaryCondition(NumericGreaterThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_GREATER_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(NumericGreaterThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_LESS_THAN_PATH)) {
                return deserializeBinaryCondition(NumericLessThanPathCondition.builder(), node);
            } else if (node.has(PropertyNames.NUMERIC_LESS_THAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(NumericLessThanOrEqualPathCondition.builder(), node);
            } else if (node.has(PropertyNames.BOOLEAN_EQUALS)) {
                return deserializeBinaryCondition(BooleanEqualsCondition.builder(), node);
            } else if (node.has(PropertyNames.BOOLEAN_EQUALS_PATH)) {
                return deserializeBinaryCondition(BooleanEqualsPathCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_NULL)) {
                return deserializeBinaryCondition(IsNullCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_PRESENT)) {
                return deserializeBinaryCondition(IsPresentCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_STRING)) {
                return deserializeBinaryCondition(IsStringCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_NUMERIC)) {
                return deserializeBinaryCondition(IsNumericCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_TIMESTAMP)) {
                return deserializeBinaryCondition(IsTimestampCondition.builder(), node);
            } else if (node.has(PropertyNames.IS_BOOLEAN)) {
                return deserializeBinaryCondition(IsBooleanCondition.builder(), node);
            } else if (node.has(PropertyNames.STRING_MATCHES)) {
                return deserializeBinaryCondition(StringMatchesCondition.builder(), node);
            }
        } else if (node.has(PropertyNames.AND)) {
            AndCondition.Builder builder = AndCondition.builder();
            for (JsonNode inner : node.get(PropertyNames.AND)) {
                builder.condition(deserializeCondition(inner));
            }
            return builder;
        } else if (node.has((PropertyNames.OR))) {
            OrCondition.Builder builder = OrCondition.builder();
            for (JsonNode inner : node.get(PropertyNames.OR)) {
                builder.condition(deserializeCondition(inner));
            }
            return builder;
        } else if (node.has((PropertyNames.NOT))) {
            return NotCondition.builder()
                    .condition(deserializeCondition(node.get(PropertyNames.NOT)));
        }
        throw new SdkClientException("Condition must be provided");
    }

    private Condition.Builder deserializeBinaryCondition(
            BinaryConditionBuilder builder,
            JsonNode node) {
        return builder
                .variable(node.get(PropertyNames.VARIABLE).asText())
                .expectedValue(node.get(builder.type()));
    }

}
