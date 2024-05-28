/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.keyspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTableResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableResultJsonUnmarshaller implements Unmarshaller<GetTableResult, JsonUnmarshallerContext> {

    public GetTableResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTableResult getTableResult = new GetTableResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTableResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("keyspaceName", targetDepth)) {
                    context.nextToken();
                    getTableResult.setKeyspaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tableName", targetDepth)) {
                    context.nextToken();
                    getTableResult.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceArn", targetDepth)) {
                    context.nextToken();
                    getTableResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    getTableResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getTableResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schemaDefinition", targetDepth)) {
                    context.nextToken();
                    getTableResult.setSchemaDefinition(SchemaDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("capacitySpecification", targetDepth)) {
                    context.nextToken();
                    getTableResult.setCapacitySpecification(CapacitySpecificationSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionSpecification", targetDepth)) {
                    context.nextToken();
                    getTableResult.setEncryptionSpecification(EncryptionSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pointInTimeRecovery", targetDepth)) {
                    context.nextToken();
                    getTableResult.setPointInTimeRecovery(PointInTimeRecoverySummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ttl", targetDepth)) {
                    context.nextToken();
                    getTableResult.setTtl(TimeToLiveJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("defaultTimeToLive", targetDepth)) {
                    context.nextToken();
                    getTableResult.setDefaultTimeToLive(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    getTableResult.setComment(CommentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clientSideTimestamps", targetDepth)) {
                    context.nextToken();
                    getTableResult.setClientSideTimestamps(ClientSideTimestampsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("replicaSpecifications", targetDepth)) {
                    context.nextToken();
                    getTableResult.setReplicaSpecifications(new ListUnmarshaller<ReplicaSpecificationSummary>(ReplicaSpecificationSummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTableResult;
    }

    private static GetTableResultJsonUnmarshaller instance;

    public static GetTableResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTableResultJsonUnmarshaller();
        return instance;
    }
}
