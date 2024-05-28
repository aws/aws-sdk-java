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
package com.amazonaws.services.workspacesthinclient.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesthinclient.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeviceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummaryJsonUnmarshaller implements Unmarshaller<DeviceSummary, JsonUnmarshallerContext> {

    public DeviceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceSummary deviceSummary = new DeviceSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setCurrentSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setDesiredSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setPendingSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateSchedule", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setSoftwareSetUpdateSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastConnectedAt", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setLastConnectedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastPostureAt", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setLastPostureAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deviceSummary;
    }

    private static DeviceSummaryJsonUnmarshaller instance;

    public static DeviceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceSummaryJsonUnmarshaller();
        return instance;
    }
}
