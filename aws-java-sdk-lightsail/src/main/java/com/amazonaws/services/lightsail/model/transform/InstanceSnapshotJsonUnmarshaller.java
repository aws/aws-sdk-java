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
 * InstanceSnapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSnapshotJsonUnmarshaller implements Unmarshaller<InstanceSnapshot, JsonUnmarshallerContext> {

    public InstanceSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceSnapshot instanceSnapshot = new InstanceSnapshot();

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
                    instanceSnapshot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progress", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setProgress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromAttachedDisks", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setFromAttachedDisks(new ListUnmarshaller<Disk>(DiskJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("fromInstanceName", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setFromInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromInstanceArn", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setFromInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromBlueprintId", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setFromBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromBundleId", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setFromBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInGb", targetDepth)) {
                    context.nextToken();
                    instanceSnapshot.setSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceSnapshot;
    }

    private static InstanceSnapshotJsonUnmarshaller instance;

    public static InstanceSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSnapshotJsonUnmarshaller();
        return instance;
    }
}
