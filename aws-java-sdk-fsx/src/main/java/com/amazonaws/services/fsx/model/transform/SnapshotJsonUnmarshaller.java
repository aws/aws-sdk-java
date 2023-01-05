/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Snapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJsonUnmarshaller implements Unmarshaller<Snapshot, JsonUnmarshallerContext> {

    public Snapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        Snapshot snapshot = new Snapshot();

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
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    snapshot.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    context.nextToken();
                    snapshot.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    snapshot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeId", targetDepth)) {
                    context.nextToken();
                    snapshot.setVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    snapshot.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    snapshot.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LifecycleTransitionReason", targetDepth)) {
                    context.nextToken();
                    snapshot.setLifecycleTransitionReason(LifecycleTransitionReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    snapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AdministrativeActions", targetDepth)) {
                    context.nextToken();
                    snapshot.setAdministrativeActions(new ListUnmarshaller<AdministrativeAction>(AdministrativeActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snapshot;
    }

    private static SnapshotJsonUnmarshaller instance;

    public static SnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotJsonUnmarshaller();
        return instance;
    }
}
