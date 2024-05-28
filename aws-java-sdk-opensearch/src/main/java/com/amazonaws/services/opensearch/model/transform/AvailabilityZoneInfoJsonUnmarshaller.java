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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AvailabilityZoneInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZoneInfoJsonUnmarshaller implements Unmarshaller<AvailabilityZoneInfo, JsonUnmarshallerContext> {

    public AvailabilityZoneInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AvailabilityZoneInfo availabilityZoneInfo = new AvailabilityZoneInfo();

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
                if (context.testExpression("AvailabilityZoneName", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setAvailabilityZoneName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZoneStatus", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setZoneStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfiguredDataNodeCount", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setConfiguredDataNodeCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailableDataNodeCount", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setAvailableDataNodeCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalShards", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setTotalShards(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalUnAssignedShards", targetDepth)) {
                    context.nextToken();
                    availabilityZoneInfo.setTotalUnAssignedShards(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return availabilityZoneInfo;
    }

    private static AvailabilityZoneInfoJsonUnmarshaller instance;

    public static AvailabilityZoneInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AvailabilityZoneInfoJsonUnmarshaller();
        return instance;
    }
}
