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
package com.amazonaws.services.detective.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TTPsObservedDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TTPsObservedDetailJsonUnmarshaller implements Unmarshaller<TTPsObservedDetail, JsonUnmarshallerContext> {

    public TTPsObservedDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        TTPsObservedDetail tTPsObservedDetail = new TTPsObservedDetail();

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
                if (context.testExpression("Tactic", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setTactic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Technique", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setTechnique(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Procedure", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setProcedure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("APIName", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setAPIName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("APISuccessCount", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setAPISuccessCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("APIFailureCount", targetDepth)) {
                    context.nextToken();
                    tTPsObservedDetail.setAPIFailureCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tTPsObservedDetail;
    }

    private static TTPsObservedDetailJsonUnmarshaller instance;

    public static TTPsObservedDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TTPsObservedDetailJsonUnmarshaller();
        return instance;
    }
}
