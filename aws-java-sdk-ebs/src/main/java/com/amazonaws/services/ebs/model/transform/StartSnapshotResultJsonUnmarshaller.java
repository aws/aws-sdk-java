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
package com.amazonaws.services.ebs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartSnapshotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSnapshotResultJsonUnmarshaller implements Unmarshaller<StartSnapshotResult, JsonUnmarshallerContext> {

    public StartSnapshotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartSnapshotResult startSnapshotResult = new StartSnapshotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startSnapshotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VolumeSize", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setVolumeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BlockSize", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setBlockSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ParentSnapshotId", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setParentSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    startSnapshotResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startSnapshotResult;
    }

    private static StartSnapshotResultJsonUnmarshaller instance;

    public static StartSnapshotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartSnapshotResultJsonUnmarshaller();
        return instance;
    }
}
