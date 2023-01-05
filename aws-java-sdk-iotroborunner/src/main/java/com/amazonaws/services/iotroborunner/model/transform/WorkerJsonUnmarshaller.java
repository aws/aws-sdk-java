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
package com.amazonaws.services.iotroborunner.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotroborunner.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Worker JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerJsonUnmarshaller implements Unmarshaller<Worker, JsonUnmarshallerContext> {

    public Worker unmarshall(JsonUnmarshallerContext context) throws Exception {
        Worker worker = new Worker();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    worker.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    worker.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fleet", targetDepth)) {
                    context.nextToken();
                    worker.setFleet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    worker.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    worker.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    worker.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("site", targetDepth)) {
                    context.nextToken();
                    worker.setSite(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("additionalTransientProperties", targetDepth)) {
                    context.nextToken();
                    worker.setAdditionalTransientProperties(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("additionalFixedProperties", targetDepth)) {
                    context.nextToken();
                    worker.setAdditionalFixedProperties(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vendorProperties", targetDepth)) {
                    context.nextToken();
                    worker.setVendorProperties(VendorPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("position", targetDepth)) {
                    context.nextToken();
                    worker.setPosition(PositionCoordinatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("orientation", targetDepth)) {
                    context.nextToken();
                    worker.setOrientation(OrientationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return worker;
    }

    private static WorkerJsonUnmarshaller instance;

    public static WorkerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkerJsonUnmarshaller();
        return instance;
    }
}
