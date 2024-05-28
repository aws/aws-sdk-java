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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CapacityReservation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationJsonUnmarshaller implements Unmarshaller<CapacityReservation, JsonUnmarshallerContext> {

    public CapacityReservation unmarshall(JsonUnmarshallerContext context) throws Exception {
        CapacityReservation capacityReservation = new CapacityReservation();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetDpus", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setTargetDpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedDpus", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setAllocatedDpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LastAllocation", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setLastAllocation(CapacityAllocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulAllocationTime", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setLastSuccessfulAllocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    capacityReservation.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return capacityReservation;
    }

    private static CapacityReservationJsonUnmarshaller instance;

    public static CapacityReservationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CapacityReservationJsonUnmarshaller();
        return instance;
    }
}
