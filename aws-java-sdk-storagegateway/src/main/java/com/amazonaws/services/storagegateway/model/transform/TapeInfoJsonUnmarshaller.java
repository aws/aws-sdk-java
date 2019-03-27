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
 * TapeInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeInfoJsonUnmarshaller implements Unmarshaller<TapeInfo, JsonUnmarshallerContext> {

    public TapeInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        TapeInfo tapeInfo = new TapeInfo();

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
                if (context.testExpression("TapeARN", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setTapeARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeBarcode", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setTapeBarcode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setTapeSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TapeStatus", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setTapeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PoolId", targetDepth)) {
                    context.nextToken();
                    tapeInfo.setPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tapeInfo;
    }

    private static TapeInfoJsonUnmarshaller instance;

    public static TapeInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TapeInfoJsonUnmarshaller();
        return instance;
    }
}
