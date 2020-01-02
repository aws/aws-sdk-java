/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListSnapshotBlocksResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSnapshotBlocksResultJsonUnmarshaller implements Unmarshaller<ListSnapshotBlocksResult, JsonUnmarshallerContext> {

    public ListSnapshotBlocksResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSnapshotBlocksResult listSnapshotBlocksResult = new ListSnapshotBlocksResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listSnapshotBlocksResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Blocks", targetDepth)) {
                    context.nextToken();
                    listSnapshotBlocksResult.setBlocks(new ListUnmarshaller<Block>(BlockJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ExpiryTime", targetDepth)) {
                    context.nextToken();
                    listSnapshotBlocksResult.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VolumeSize", targetDepth)) {
                    context.nextToken();
                    listSnapshotBlocksResult.setVolumeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BlockSize", targetDepth)) {
                    context.nextToken();
                    listSnapshotBlocksResult.setBlockSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listSnapshotBlocksResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listSnapshotBlocksResult;
    }

    private static ListSnapshotBlocksResultJsonUnmarshaller instance;

    public static ListSnapshotBlocksResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSnapshotBlocksResultJsonUnmarshaller();
        return instance;
    }
}
