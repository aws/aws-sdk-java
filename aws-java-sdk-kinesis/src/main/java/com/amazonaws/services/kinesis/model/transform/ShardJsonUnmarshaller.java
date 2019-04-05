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
package com.amazonaws.services.kinesis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Shard JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShardJsonUnmarshaller implements Unmarshaller<Shard, JsonUnmarshallerContext> {

    public Shard unmarshall(JsonUnmarshallerContext context) throws Exception {
        Shard shard = new Shard();

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
                if (context.testExpression("ShardId", targetDepth)) {
                    context.nextToken();
                    shard.setShardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentShardId", targetDepth)) {
                    context.nextToken();
                    shard.setParentShardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdjacentParentShardId", targetDepth)) {
                    context.nextToken();
                    shard.setAdjacentParentShardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HashKeyRange", targetDepth)) {
                    context.nextToken();
                    shard.setHashKeyRange(HashKeyRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SequenceNumberRange", targetDepth)) {
                    context.nextToken();
                    shard.setSequenceNumberRange(SequenceNumberRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return shard;
    }

    private static ShardJsonUnmarshaller instance;

    public static ShardJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ShardJsonUnmarshaller();
        return instance;
    }
}
