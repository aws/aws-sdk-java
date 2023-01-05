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
 * DescribeApplicationInstanceDetailsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationInstanceDetailsResultJsonUnmarshaller implements
        Unmarshaller<DescribeApplicationInstanceDetailsResult, JsonUnmarshallerContext> {

    public DescribeApplicationInstanceDetailsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeApplicationInstanceDetailsResult describeApplicationInstanceDetailsResult = new DescribeApplicationInstanceDetailsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeApplicationInstanceDetailsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationInstanceId", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setApplicationInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationInstanceIdToReplace", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setApplicationInstanceIdToReplace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultRuntimeContextDevice", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setDefaultRuntimeContextDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManifestOverridesPayload", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setManifestOverridesPayload(ManifestOverridesPayloadJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ManifestPayload", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setManifestPayload(ManifestPayloadJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeApplicationInstanceDetailsResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeApplicationInstanceDetailsResult;
    }

    private static DescribeApplicationInstanceDetailsResultJsonUnmarshaller instance;

    public static DescribeApplicationInstanceDetailsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeApplicationInstanceDetailsResultJsonUnmarshaller();
        return instance;
    }
}
