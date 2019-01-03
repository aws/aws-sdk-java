/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLayerVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLayerVersionResultJsonUnmarshaller implements Unmarshaller<GetLayerVersionResult, JsonUnmarshallerContext> {

    public GetLayerVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLayerVersionResult getLayerVersionResult = new GetLayerVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLayerVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setContent(LayerVersionContentOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LayerArn", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setLayerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerVersionArn", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setLayerVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompatibleRuntimes", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setCompatibleRuntimes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LicenseInfo", targetDepth)) {
                    context.nextToken();
                    getLayerVersionResult.setLicenseInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLayerVersionResult;
    }

    private static GetLayerVersionResultJsonUnmarshaller instance;

    public static GetLayerVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLayerVersionResultJsonUnmarshaller();
        return instance;
    }
}
