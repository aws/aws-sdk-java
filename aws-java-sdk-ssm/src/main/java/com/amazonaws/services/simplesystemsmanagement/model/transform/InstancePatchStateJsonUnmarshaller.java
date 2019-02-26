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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstancePatchState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePatchStateJsonUnmarshaller implements Unmarshaller<InstancePatchState, JsonUnmarshallerContext> {

    public InstancePatchState unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstancePatchState instancePatchState = new InstancePatchState();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchGroup", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setPatchGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaselineId", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setBaselineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstallOverrideList", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setInstallOverrideList(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerInformation", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setOwnerInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstalledCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setInstalledCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledOtherCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setInstalledOtherCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledRejectedCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setInstalledRejectedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MissingCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setMissingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailedCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setFailedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NotApplicableCount", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setNotApplicableCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OperationStartTime", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setOperationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OperationEndTime", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setOperationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Operation", targetDepth)) {
                    context.nextToken();
                    instancePatchState.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instancePatchState;
    }

    private static InstancePatchStateJsonUnmarshaller instance;

    public static InstancePatchStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancePatchStateJsonUnmarshaller();
        return instance;
    }
}
