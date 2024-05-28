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
 * CisScanConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanConfigurationJsonUnmarshaller implements Unmarshaller<CisScanConfiguration, JsonUnmarshallerContext> {

    public CisScanConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisScanConfiguration cisScanConfiguration = new CisScanConfiguration();

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
                if (context.testExpression("ownerId", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanConfigurationArn", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setScanConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanName", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setScanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schedule", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("securityLevel", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setSecurityLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targets", targetDepth)) {
                    context.nextToken();
                    cisScanConfiguration.setTargets(CisTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cisScanConfiguration;
    }

    private static CisScanConfigurationJsonUnmarshaller instance;

    public static CisScanConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisScanConfigurationJsonUnmarshaller();
        return instance;
    }
}
