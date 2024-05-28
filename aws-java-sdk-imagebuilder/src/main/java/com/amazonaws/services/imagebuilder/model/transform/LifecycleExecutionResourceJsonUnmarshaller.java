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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LifecycleExecutionResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExecutionResourceJsonUnmarshaller implements Unmarshaller<LifecycleExecutionResource, JsonUnmarshallerContext> {

    public LifecycleExecutionResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        LifecycleExecutionResource lifecycleExecutionResource = new LifecycleExecutionResource();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setState(LifecycleExecutionResourceStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setAction(LifecycleExecutionResourceActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshots", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setSnapshots(new ListUnmarshaller<LifecycleExecutionSnapshotResource>(
                            LifecycleExecutionSnapshotResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("imageUris", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setImageUris(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    lifecycleExecutionResource.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lifecycleExecutionResource;
    }

    private static LifecycleExecutionResourceJsonUnmarshaller instance;

    public static LifecycleExecutionResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleExecutionResourceJsonUnmarshaller();
        return instance;
    }
}
