/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsDynamoDbTableDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableDetailsJsonUnmarshaller implements Unmarshaller<AwsDynamoDbTableDetails, JsonUnmarshallerContext> {

    public AwsDynamoDbTableDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsDynamoDbTableDetails awsDynamoDbTableDetails = new AwsDynamoDbTableDetails();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AttributeDefinitions", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setAttributeDefinitions(new ListUnmarshaller<AwsDynamoDbTableAttributeDefinition>(
                            AwsDynamoDbTableAttributeDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BillingModeSummary", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setBillingModeSummary(AwsDynamoDbTableBillingModeSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setGlobalSecondaryIndexes(new ListUnmarshaller<AwsDynamoDbTableGlobalSecondaryIndex>(
                            AwsDynamoDbTableGlobalSecondaryIndexJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GlobalTableVersion", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setGlobalTableVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setKeySchema(new ListUnmarshaller<AwsDynamoDbTableKeySchema>(AwsDynamoDbTableKeySchemaJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LatestStreamArn", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setLatestStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestStreamLabel", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setLatestStreamLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocalSecondaryIndexes", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setLocalSecondaryIndexes(new ListUnmarshaller<AwsDynamoDbTableLocalSecondaryIndex>(
                            AwsDynamoDbTableLocalSecondaryIndexJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughput", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setProvisionedThroughput(AwsDynamoDbTableProvisionedThroughputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Replicas", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setReplicas(new ListUnmarshaller<AwsDynamoDbTableReplica>(AwsDynamoDbTableReplicaJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RestoreSummary", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setRestoreSummary(AwsDynamoDbTableRestoreSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SseDescription", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setSseDescription(AwsDynamoDbTableSseDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StreamSpecification", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setStreamSpecification(AwsDynamoDbTableStreamSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableSizeBytes", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TableStatus", targetDepth)) {
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsDynamoDbTableDetails;
    }

    private static AwsDynamoDbTableDetailsJsonUnmarshaller instance;

    public static AwsDynamoDbTableDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsDynamoDbTableDetailsJsonUnmarshaller();
        return instance;
    }
}
