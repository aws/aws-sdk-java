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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSolFunctionInstanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionInstanceResultJsonUnmarshaller implements Unmarshaller<GetSolFunctionInstanceResult, JsonUnmarshallerContext> {

    public GetSolFunctionInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSolFunctionInstanceResult getSolFunctionInstanceResult = new GetSolFunctionInstanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSolFunctionInstanceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instantiatedVnfInfo", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setInstantiatedVnfInfo(GetSolVnfInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instantiationState", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setInstantiationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setMetadata(GetSolFunctionInstanceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nsInstanceId", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setNsInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vnfPkgId", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setVnfPkgId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfProductName", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setVnfProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfProvider", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setVnfProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfdId", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setVnfdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfdVersion", targetDepth)) {
                    context.nextToken();
                    getSolFunctionInstanceResult.setVnfdVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSolFunctionInstanceResult;
    }

    private static GetSolFunctionInstanceResultJsonUnmarshaller instance;

    public static GetSolFunctionInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSolFunctionInstanceResultJsonUnmarshaller();
        return instance;
    }
}
