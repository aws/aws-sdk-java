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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    disk.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    disk.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    disk.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    disk.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    disk.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    disk.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    disk.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("sizeInGb", targetDepth)) {
                    context.nextToken();
                    disk.setSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("isSystemDisk", targetDepth)) {
                    context.nextToken();
                    disk.setIsSystemDisk(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("iops", targetDepth)) {
                    context.nextToken();
                    disk.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    disk.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    disk.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attachedTo", targetDepth)) {
                    context.nextToken();
                    disk.setAttachedTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isAttached", targetDepth)) {
                    context.nextToken();
                    disk.setIsAttached(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("attachmentState", targetDepth)) {
                    context.nextToken();
                    disk.setAttachmentState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gbInUse", targetDepth)) {
                    context.nextToken();
                    disk.setGbInUse(context.getUnmarshaller(Integer.class).unmarshall(context));
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
