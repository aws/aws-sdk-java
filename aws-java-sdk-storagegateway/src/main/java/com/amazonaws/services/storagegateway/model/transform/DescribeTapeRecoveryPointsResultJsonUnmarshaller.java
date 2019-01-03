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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTapeRecoveryPointsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapeRecoveryPointsResultJsonUnmarshaller implements Unmarshaller<DescribeTapeRecoveryPointsResult, JsonUnmarshallerContext> {

    public DescribeTapeRecoveryPointsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTapeRecoveryPointsResult describeTapeRecoveryPointsResult = new DescribeTapeRecoveryPointsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTapeRecoveryPointsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    describeTapeRecoveryPointsResult.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeRecoveryPointInfos", targetDepth)) {
                    context.nextToken();
                    describeTapeRecoveryPointsResult.setTapeRecoveryPointInfos(new ListUnmarshaller<TapeRecoveryPointInfo>(
                            TapeRecoveryPointInfoJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    describeTapeRecoveryPointsResult.setMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTapeRecoveryPointsResult;
    }

    private static DescribeTapeRecoveryPointsResultJsonUnmarshaller instance;

    public static DescribeTapeRecoveryPointsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTapeRecoveryPointsResultJsonUnmarshaller();
        return instance;
    }
}
