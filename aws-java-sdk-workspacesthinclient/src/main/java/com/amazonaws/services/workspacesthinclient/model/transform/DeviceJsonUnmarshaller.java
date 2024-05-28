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
 * Device JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceJsonUnmarshaller implements Unmarshaller<Device, JsonUnmarshallerContext> {

    public Device unmarshall(JsonUnmarshallerContext context) throws Exception {
        Device device = new Device();

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
                    device.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    context.nextToken();
                    device.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    device.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    device.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    device.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    device.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    device.setCurrentSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentSoftwareSetVersion", targetDepth)) {
                    context.nextToken();
                    device.setCurrentSoftwareSetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    device.setDesiredSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    device.setPendingSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetVersion", targetDepth)) {
                    context.nextToken();
                    device.setPendingSoftwareSetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateSchedule", targetDepth)) {
                    context.nextToken();
                    device.setSoftwareSetUpdateSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetComplianceStatus", targetDepth)) {
                    context.nextToken();
                    device.setSoftwareSetComplianceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateStatus", targetDepth)) {
                    context.nextToken();
                    device.setSoftwareSetUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastConnectedAt", targetDepth)) {
                    context.nextToken();
                    device.setLastConnectedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastPostureAt", targetDepth)) {
                    context.nextToken();
                    device.setLastPostureAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    device.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    device.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    device.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyArn", targetDepth)) {
                    context.nextToken();
                    device.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    device.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return device;
    }

    private static DeviceJsonUnmarshaller instance;

    public static DeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonUnmarshaller();
        return instance;
    }
}
