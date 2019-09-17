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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteReservationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReservationResultJsonUnmarshaller implements Unmarshaller<DeleteReservationResult, JsonUnmarshallerContext> {

    public DeleteReservationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteReservationResult deleteReservationResult = new DeleteReservationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteReservationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("count", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("currencyCode", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("duration", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("durationUnits", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setDurationUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("end", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fixedPrice", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setFixedPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringDescription", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setOfferingDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringId", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringType", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setOfferingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservationId", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setReservationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceSpecification", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setResourceSpecification(ReservationResourceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("start", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("usagePrice", targetDepth)) {
                    context.nextToken();
                    deleteReservationResult.setUsagePrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deleteReservationResult;
    }

    private static DeleteReservationResultJsonUnmarshaller instance;

    public static DeleteReservationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteReservationResultJsonUnmarshaller();
        return instance;
    }
}
