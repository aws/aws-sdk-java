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
 * CisScan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanJsonUnmarshaller implements Unmarshaller<CisScan, JsonUnmarshallerContext> {

    public CisScan unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisScan cisScan = new CisScan();

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
                if (context.testExpression("failedChecks", targetDepth)) {
                    context.nextToken();
                    cisScan.setFailedChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scanArn", targetDepth)) {
                    context.nextToken();
                    cisScan.setScanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanConfigurationArn", targetDepth)) {
                    context.nextToken();
                    cisScan.setScanConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanDate", targetDepth)) {
                    context.nextToken();
                    cisScan.setScanDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("scanName", targetDepth)) {
                    context.nextToken();
                    cisScan.setScanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduledBy", targetDepth)) {
                    context.nextToken();
                    cisScan.setScheduledBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityLevel", targetDepth)) {
                    context.nextToken();
                    cisScan.setSecurityLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    cisScan.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targets", targetDepth)) {
                    context.nextToken();
                    cisScan.setTargets(CisTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("totalChecks", targetDepth)) {
                    context.nextToken();
                    cisScan.setTotalChecks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cisScan;
    }

    private static CisScanJsonUnmarshaller instance;

    public static CisScanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisScanJsonUnmarshaller();
        return instance;
    }
}
