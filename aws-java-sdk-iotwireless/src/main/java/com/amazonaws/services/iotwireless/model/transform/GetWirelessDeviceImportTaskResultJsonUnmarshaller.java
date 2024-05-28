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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWirelessDeviceImportTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceImportTaskResultJsonUnmarshaller implements Unmarshaller<GetWirelessDeviceImportTaskResult, JsonUnmarshallerContext> {

    public GetWirelessDeviceImportTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWirelessDeviceImportTaskResult getWirelessDeviceImportTaskResult = new GetWirelessDeviceImportTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWirelessDeviceImportTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationName", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sidewalk", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setSidewalk(SidewalkGetStartImportInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitializedImportedDeviceCount", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setInitializedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PendingImportedDeviceCount", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setPendingImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("OnboardedImportedDeviceCount", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setOnboardedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailedImportedDeviceCount", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceImportTaskResult.setFailedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWirelessDeviceImportTaskResult;
    }

    private static GetWirelessDeviceImportTaskResultJsonUnmarshaller instance;

    public static GetWirelessDeviceImportTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWirelessDeviceImportTaskResultJsonUnmarshaller();
        return instance;
    }
}
