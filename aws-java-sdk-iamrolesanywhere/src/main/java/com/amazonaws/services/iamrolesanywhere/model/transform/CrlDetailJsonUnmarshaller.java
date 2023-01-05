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
package com.amazonaws.services.iamrolesanywhere.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.iamrolesanywhere.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CrlDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrlDetailJsonUnmarshaller implements Unmarshaller<CrlDetail, JsonUnmarshallerContext> {

    public CrlDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CrlDetail crlDetail = new CrlDetail();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    crlDetail.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("crlArn", targetDepth)) {
                    context.nextToken();
                    crlDetail.setCrlArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("crlData", targetDepth)) {
                    context.nextToken();
                    crlDetail.setCrlData(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("crlId", targetDepth)) {
                    context.nextToken();
                    crlDetail.setCrlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    crlDetail.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    crlDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trustAnchorArn", targetDepth)) {
                    context.nextToken();
                    crlDetail.setTrustAnchorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    crlDetail.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return crlDetail;
    }

    private static CrlDetailJsonUnmarshaller instance;

    public static CrlDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrlDetailJsonUnmarshaller();
        return instance;
    }
}
