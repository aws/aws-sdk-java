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
 * GetLayerVersionByArnResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLayerVersionByArnResultJsonUnmarshaller implements Unmarshaller<GetLayerVersionByArnResult, JsonUnmarshallerContext> {

    public GetLayerVersionByArnResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLayerVersionByArnResult getLayerVersionByArnResult = new GetLayerVersionByArnResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLayerVersionByArnResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setContent(LayerVersionContentOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LayerArn", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setLayerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerVersionArn", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setLayerVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompatibleRuntimes", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setCompatibleRuntimes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LicenseInfo", targetDepth)) {
                    context.nextToken();
                    getLayerVersionByArnResult.setLicenseInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLayerVersionByArnResult;
    }

    private static GetLayerVersionByArnResultJsonUnmarshaller instance;

    public static GetLayerVersionByArnResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLayerVersionByArnResultJsonUnmarshaller();
        return instance;
    }
}
