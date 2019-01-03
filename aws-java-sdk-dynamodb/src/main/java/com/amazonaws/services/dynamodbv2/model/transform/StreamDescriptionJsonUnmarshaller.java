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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StreamDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamDescriptionJsonUnmarshaller implements Unmarshaller<StreamDescription, JsonUnmarshallerContext> {

    public StreamDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamDescription streamDescription = new StreamDescription();

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
                if (context.testExpression("StreamArn", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamLabel", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamStatus", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamViewType", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamViewType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationRequestDateTime", targetDepth)) {
                    context.nextToken();
                    streamDescription.setCreationRequestDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    streamDescription.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    context.nextToken();
                    streamDescription.setKeySchema(new ListUnmarshaller<KeySchemaElement>(KeySchemaElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Shards", targetDepth)) {
                    context.nextToken();
                    streamDescription.setShards(new ListUnmarshaller<Shard>(ShardJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LastEvaluatedShardId", targetDepth)) {
                    context.nextToken();
                    streamDescription.setLastEvaluatedShardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return streamDescription;
    }

    private static StreamDescriptionJsonUnmarshaller instance;

    public static StreamDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionJsonUnmarshaller();
        return instance;
    }
}
