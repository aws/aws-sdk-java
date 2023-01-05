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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationInstanceJsonUnmarshaller implements Unmarshaller<ApplicationInstance, JsonUnmarshallerContext> {

    public ApplicationInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationInstance applicationInstance = new ApplicationInstance();

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
                if (context.testExpression("ApplicationInstanceId", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setApplicationInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultRuntimeContextDevice", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setDefaultRuntimeContextDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRuntimeContextDeviceName", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setDefaultRuntimeContextDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthStatus", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setHealthStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuntimeContextStates", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setRuntimeContextStates(new ListUnmarshaller<ReportedRuntimeContextState>(ReportedRuntimeContextStateJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDescription", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setStatusDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    applicationInstance.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return applicationInstance;
    }

    private static ApplicationInstanceJsonUnmarshaller instance;

    public static ApplicationInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationInstanceJsonUnmarshaller();
        return instance;
    }
}
