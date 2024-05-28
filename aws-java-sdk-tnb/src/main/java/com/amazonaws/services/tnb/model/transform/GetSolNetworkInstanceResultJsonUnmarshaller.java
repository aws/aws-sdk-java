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
 * GetSolNetworkInstanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkInstanceResultJsonUnmarshaller implements Unmarshaller<GetSolNetworkInstanceResult, JsonUnmarshallerContext> {

    public GetSolNetworkInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSolNetworkInstanceResult getSolNetworkInstanceResult = new GetSolNetworkInstanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSolNetworkInstanceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lcmOpInfo", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setLcmOpInfo(LcmOperationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setMetadata(GetSolNetworkInstanceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nsInstanceDescription", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setNsInstanceDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsInstanceName", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setNsInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsState", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setNsState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdId", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setNsdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdInfoId", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setNsdInfoId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getSolNetworkInstanceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return getSolNetworkInstanceResult;
    }

    private static GetSolNetworkInstanceResultJsonUnmarshaller instance;

    public static GetSolNetworkInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSolNetworkInstanceResultJsonUnmarshaller();
        return instance;
    }
}
