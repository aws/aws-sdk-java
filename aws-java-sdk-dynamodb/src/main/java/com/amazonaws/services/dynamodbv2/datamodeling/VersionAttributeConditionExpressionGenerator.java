/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * This class contains logic to generate condition expressions for version attribute
 * TODO: Change the logic in this class to use Builder pattern instead. This will help avoid state leak that this class
 *  currently has.
 */
@SdkInternalApi
public class VersionAttributeConditionExpressionGenerator {
    private static final String VERSION_ATTRIBUTE_NAME_BASE_TOKEN = "#versionAttributeName";
    private static final String VERSION_ATTRIBUTE_VALUE_BASE_TOKEN = ":versionAttributeValue";
    private final DynamoDBTransactionWriteExpression versionAttributeConditionExpression
            = new DynamoDBTransactionWriteExpression();
    private Long versionAttributeCounterValue = 0L;

    /**
     * Generates condition expression for a given version attribute and appends this generated condition expression to
     * any previously generated version attribute condition expressions.
     */
    public void appendVersionAttributeToConditionExpression(
            DynamoDBMapperFieldModel<Object,Object> field,
            Object fieldValue) {
        versionAttributeCounterValue += 1L;
        String versionAttributeNameToken = VERSION_ATTRIBUTE_NAME_BASE_TOKEN + versionAttributeCounterValue;
        String versionAttributeValueToken = VERSION_ATTRIBUTE_VALUE_BASE_TOKEN + versionAttributeCounterValue;
        Map<String, String> currentVersionedAttributeConditionExpressionNames = new HashMap<String, String>();
        currentVersionedAttributeConditionExpressionNames.put(versionAttributeNameToken, field.name());
        Map<String, AttributeValue> currentVersionedAttributeConditionExpressionValues = null;
        String currentVersionConditionExpression = null;
        if (fieldValue == null) {
            currentVersionConditionExpression = String.format("attribute_not_exists(%s)", versionAttributeNameToken);
        } else {
            currentVersionedAttributeConditionExpressionValues = new HashMap<String, AttributeValue>();
            currentVersionedAttributeConditionExpressionValues.put(versionAttributeValueToken,
                                                                   field.convert(fieldValue));
            currentVersionConditionExpression = String.format("attribute_exists(%s) AND %s = %s",
                                                              versionAttributeNameToken,
                                                              versionAttributeNameToken,
                                                              versionAttributeValueToken);
        }

        if (versionAttributeConditionExpression.getConditionExpression() != null) {
            String currentConditionExpression = versionAttributeConditionExpression.getConditionExpression();
            if (versionAttributeCounterValue == 2) {
                currentConditionExpression = "(" + currentConditionExpression + ")";
            }
            versionAttributeConditionExpression.withConditionExpression(
                    currentConditionExpression + " AND (" + currentVersionConditionExpression + ")");

        } else {
            versionAttributeConditionExpression.withConditionExpression(currentVersionConditionExpression);
        }

        if (versionAttributeConditionExpression.getExpressionAttributeNames() != null) {
            versionAttributeConditionExpression.getExpressionAttributeNames()
                                               .putAll(currentVersionedAttributeConditionExpressionNames);
        } else {
            versionAttributeConditionExpression.withExpressionAttributeNames(currentVersionedAttributeConditionExpressionNames);
        }

        if (currentVersionedAttributeConditionExpressionValues != null) {
            if (versionAttributeConditionExpression.getExpressionAttributeValues() != null) {
                versionAttributeConditionExpression.getExpressionAttributeValues()
                                                   .putAll(currentVersionedAttributeConditionExpressionValues);
            } else {
                versionAttributeConditionExpression.withExpressionAttributeValues(
                        currentVersionedAttributeConditionExpressionValues);
            }
        }
    }

    /**
     * Call this method *after* you've completed calling appendVersionAttributeToConditionExpression() for each of the
     * version attributes in a given item.
     *
     * The versionAttributeConditionExpression being returned is mutable inside and outside of this class.
     */
    public DynamoDBTransactionWriteExpression getVersionAttributeConditionExpression() {
        return versionAttributeConditionExpression;
    }
}

