/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetGeofenceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeofenceResultJsonUnmarshaller implements Unmarshaller<GetGeofenceResult, JsonUnmarshallerContext> {

    public GetGeofenceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetGeofenceResult getGeofenceResult = new GetGeofenceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getGeofenceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    getGeofenceResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("GeofenceId", targetDepth)) {
                    context.nextToken();
                    getGeofenceResult.setGeofenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Geometry", targetDepth)) {
                    context.nextToken();
                    getGeofenceResult.setGeometry(GeofenceGeometryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getGeofenceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    getGeofenceResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getGeofenceResult;
    }

    private static GetGeofenceResultJsonUnmarshaller instance;

    public static GetGeofenceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGeofenceResultJsonUnmarshaller();
        return instance;
    }
}
