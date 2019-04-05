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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Disk JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskJsonUnmarshaller implements Unmarshaller<Disk, JsonUnmarshallerContext> {

    public Disk unmarshall(JsonUnmarshallerContext context) throws Exception {
        Disk disk = new Disk();

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
                if (context.testExpression("DiskId", targetDepth)) {
                    context.nextToken();
                    disk.setDiskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskPath", targetDepth)) {
                    context.nextToken();
                    disk.setDiskPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskNode", targetDepth)) {
                    context.nextToken();
                    disk.setDiskNode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskStatus", targetDepth)) {
                    context.nextToken();
                    disk.setDiskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskSizeInBytes", targetDepth)) {
                    context.nextToken();
                    disk.setDiskSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DiskAllocationType", targetDepth)) {
                    context.nextToken();
                    disk.setDiskAllocationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskAllocationResource", targetDepth)) {
                    context.nextToken();
                    disk.setDiskAllocationResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskAttributeList", targetDepth)) {
                    context.nextToken();
                    disk.setDiskAttributeList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return disk;
    }

    private static DiskJsonUnmarshaller instance;

    public static DiskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskJsonUnmarshaller();
        return instance;
    }
}
