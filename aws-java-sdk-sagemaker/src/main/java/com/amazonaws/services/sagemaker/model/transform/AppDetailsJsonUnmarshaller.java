/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppDetailsJsonUnmarshaller implements Unmarshaller<AppDetails, JsonUnmarshallerContext> {

    public AppDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppDetails appDetails = new AppDetails();

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
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    appDetails.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserProfileName", targetDepth)) {
                    context.nextToken();
                    appDetails.setUserProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AppType", targetDepth)) {
                    context.nextToken();
                    appDetails.setAppType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AppName", targetDepth)) {
                    context.nextToken();
                    appDetails.setAppName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    appDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    appDetails.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appDetails;
    }

    private static AppDetailsJsonUnmarshaller instance;

    public static AppDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppDetailsJsonUnmarshaller();
        return instance;
    }
}
