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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePendingMaintenanceActionsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePendingMaintenanceActionsResultJsonUnmarshaller implements Unmarshaller<DescribePendingMaintenanceActionsResult, JsonUnmarshallerContext> {

    public DescribePendingMaintenanceActionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePendingMaintenanceActionsResult describePendingMaintenanceActionsResult = new DescribePendingMaintenanceActionsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePendingMaintenanceActionsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PendingMaintenanceActions", targetDepth)) {
                    context.nextToken();
                    describePendingMaintenanceActionsResult.setPendingMaintenanceActions(new ListUnmarshaller<ResourcePendingMaintenanceActions>(
                            ResourcePendingMaintenanceActionsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    describePendingMaintenanceActionsResult.setMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePendingMaintenanceActionsResult;
    }

    private static DescribePendingMaintenanceActionsResultJsonUnmarshaller instance;

    public static DescribePendingMaintenanceActionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePendingMaintenanceActionsResultJsonUnmarshaller();
        return instance;
    }
}
