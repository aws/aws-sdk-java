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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EksAttemptDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksAttemptDetailJsonUnmarshaller implements Unmarshaller<EksAttemptDetail, JsonUnmarshallerContext> {

    public EksAttemptDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        EksAttemptDetail eksAttemptDetail = new EksAttemptDetail();

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
                if (context.testExpression("containers", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setContainers(new ListUnmarshaller<EksAttemptContainerDetail>(EksAttemptContainerDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("podName", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setPodName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodeName", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setNodeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setStartedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setStoppedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    eksAttemptDetail.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eksAttemptDetail;
    }

    private static EksAttemptDetailJsonUnmarshaller instance;

    public static EksAttemptDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EksAttemptDetailJsonUnmarshaller();
        return instance;
    }
}
