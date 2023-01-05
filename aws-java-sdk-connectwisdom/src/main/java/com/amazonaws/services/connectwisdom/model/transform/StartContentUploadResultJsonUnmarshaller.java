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
package com.amazonaws.services.connectwisdom.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartContentUploadResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContentUploadResultJsonUnmarshaller implements Unmarshaller<StartContentUploadResult, JsonUnmarshallerContext> {

    public StartContentUploadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartContentUploadResult startContentUploadResult = new StartContentUploadResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startContentUploadResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("headersToInclude", targetDepth)) {
                    context.nextToken();
                    startContentUploadResult.setHeadersToInclude(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("uploadId", targetDepth)) {
                    context.nextToken();
                    startContentUploadResult.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    startContentUploadResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("urlExpiry", targetDepth)) {
                    context.nextToken();
                    startContentUploadResult.setUrlExpiry(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startContentUploadResult;
    }

    private static StartContentUploadResultJsonUnmarshaller instance;

    public static StartContentUploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartContentUploadResultJsonUnmarshaller();
        return instance;
    }
}
