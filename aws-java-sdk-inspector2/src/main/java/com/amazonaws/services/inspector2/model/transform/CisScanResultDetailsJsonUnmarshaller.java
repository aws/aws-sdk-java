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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CisScanResultDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultDetailsJsonUnmarshaller implements Unmarshaller<CisScanResultDetails, JsonUnmarshallerContext> {

    public CisScanResultDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisScanResultDetails cisScanResultDetails = new CisScanResultDetails();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checkDescription", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setCheckDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checkId", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setCheckId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setFindingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("level", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setRemediation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanArn", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setScanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetResourceId", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setTargetResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    cisScanResultDetails.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cisScanResultDetails;
    }

    private static CisScanResultDetailsJsonUnmarshaller instance;

    public static CisScanResultDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisScanResultDetailsJsonUnmarshaller();
        return instance;
    }
}
