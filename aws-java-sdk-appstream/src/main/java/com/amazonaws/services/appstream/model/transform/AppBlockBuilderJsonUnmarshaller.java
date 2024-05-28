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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppBlockBuilder JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppBlockBuilderJsonUnmarshaller implements Unmarshaller<AppBlockBuilder, JsonUnmarshallerContext> {

    public AppBlockBuilder unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppBlockBuilder appBlockBuilder = new AppBlockBuilder();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnableDefaultInternetAccess", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setEnableDefaultInternetAccess(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AppBlockBuilderErrors", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setAppBlockBuilderErrors(new ListUnmarshaller<ResourceError>(ResourceErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StateChangeReason", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setStateChangeReason(AppBlockBuilderStateChangeReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessEndpoints", targetDepth)) {
                    context.nextToken();
                    appBlockBuilder.setAccessEndpoints(new ListUnmarshaller<AccessEndpoint>(AccessEndpointJsonUnmarshaller.getInstance())

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

        return appBlockBuilder;
    }

    private static AppBlockBuilderJsonUnmarshaller instance;

    public static AppBlockBuilderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppBlockBuilderJsonUnmarshaller();
        return instance;
    }
}
