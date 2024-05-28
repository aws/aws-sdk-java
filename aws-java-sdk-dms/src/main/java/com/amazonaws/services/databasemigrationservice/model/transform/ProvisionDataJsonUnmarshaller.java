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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProvisionData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionDataJsonUnmarshaller implements Unmarshaller<ProvisionData, JsonUnmarshallerContext> {

    public ProvisionData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionData provisionData = new ProvisionData();

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
                if (context.testExpression("ProvisionState", targetDepth)) {
                    context.nextToken();
                    provisionData.setProvisionState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedCapacityUnits", targetDepth)) {
                    context.nextToken();
                    provisionData.setProvisionedCapacityUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DateProvisioned", targetDepth)) {
                    context.nextToken();
                    provisionData.setDateProvisioned(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IsNewProvisioningAvailable", targetDepth)) {
                    context.nextToken();
                    provisionData.setIsNewProvisioningAvailable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DateNewProvisioningDataAvailable", targetDepth)) {
                    context.nextToken();
                    provisionData.setDateNewProvisioningDataAvailable(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReasonForNewProvisioningData", targetDepth)) {
                    context.nextToken();
                    provisionData.setReasonForNewProvisioningData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return provisionData;
    }

    private static ProvisionDataJsonUnmarshaller instance;

    public static ProvisionDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionDataJsonUnmarshaller();
        return instance;
    }
}
