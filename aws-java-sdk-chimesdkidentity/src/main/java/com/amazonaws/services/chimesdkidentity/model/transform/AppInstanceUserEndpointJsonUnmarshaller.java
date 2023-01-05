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
package com.amazonaws.services.chimesdkidentity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppInstanceUserEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceUserEndpointJsonUnmarshaller implements Unmarshaller<AppInstanceUserEndpoint, JsonUnmarshallerContext> {

    public AppInstanceUserEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppInstanceUserEndpoint appInstanceUserEndpoint = new AppInstanceUserEndpoint();

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
                if (context.testExpression("AppInstanceUserArn", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setAppInstanceUserArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointId", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointAttributes", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setEndpointAttributes(EndpointAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AllowMessages", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setAllowMessages(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointState", targetDepth)) {
                    context.nextToken();
                    appInstanceUserEndpoint.setEndpointState(EndpointStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appInstanceUserEndpoint;
    }

    private static AppInstanceUserEndpointJsonUnmarshaller instance;

    public static AppInstanceUserEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserEndpointJsonUnmarshaller();
        return instance;
    }
}
