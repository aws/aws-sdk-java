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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateFileSystemResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemResultJsonUnmarshaller implements Unmarshaller<UpdateFileSystemResult, JsonUnmarshallerContext> {

    public UpdateFileSystemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateFileSystemResult updateFileSystemResult = new UpdateFileSystemResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateFileSystemResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationToken", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setCreationToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LifeCycleState", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setLifeCycleState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfMountTargets", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setNumberOfMountTargets(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SizeInBytes", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setSizeInBytes(FileSystemSizeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PerformanceMode", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setPerformanceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputMode", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setThroughputMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughputInMibps", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setProvisionedThroughputInMibps(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    updateFileSystemResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateFileSystemResult;
    }

    private static UpdateFileSystemResultJsonUnmarshaller instance;

    public static UpdateFileSystemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFileSystemResultJsonUnmarshaller();
        return instance;
    }
}
