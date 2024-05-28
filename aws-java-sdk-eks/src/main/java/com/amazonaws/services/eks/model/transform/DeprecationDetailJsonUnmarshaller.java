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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeprecationDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprecationDetailJsonUnmarshaller implements Unmarshaller<DeprecationDetail, JsonUnmarshallerContext> {

    public DeprecationDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeprecationDetail deprecationDetail = new DeprecationDetail();

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
                if (context.testExpression("usage", targetDepth)) {
                    context.nextToken();
                    deprecationDetail.setUsage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replacedWith", targetDepth)) {
                    context.nextToken();
                    deprecationDetail.setReplacedWith(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stopServingVersion", targetDepth)) {
                    context.nextToken();
                    deprecationDetail.setStopServingVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startServingReplacementVersion", targetDepth)) {
                    context.nextToken();
                    deprecationDetail.setStartServingReplacementVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientStats", targetDepth)) {
                    context.nextToken();
                    deprecationDetail.setClientStats(new ListUnmarshaller<ClientStat>(ClientStatJsonUnmarshaller.getInstance())

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

        return deprecationDetail;
    }

    private static DeprecationDetailJsonUnmarshaller instance;

    public static DeprecationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeprecationDetailJsonUnmarshaller();
        return instance;
    }
}
