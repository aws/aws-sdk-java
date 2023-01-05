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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FulfillmentUpdatesSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentUpdatesSpecificationJsonUnmarshaller implements Unmarshaller<FulfillmentUpdatesSpecification, JsonUnmarshallerContext> {

    public FulfillmentUpdatesSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        FulfillmentUpdatesSpecification fulfillmentUpdatesSpecification = new FulfillmentUpdatesSpecification();

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
                if (context.testExpression("active", targetDepth)) {
                    context.nextToken();
                    fulfillmentUpdatesSpecification.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("startResponse", targetDepth)) {
                    context.nextToken();
                    fulfillmentUpdatesSpecification.setStartResponse(FulfillmentStartResponseSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updateResponse", targetDepth)) {
                    context.nextToken();
                    fulfillmentUpdatesSpecification.setUpdateResponse(FulfillmentUpdateResponseSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutInSeconds", targetDepth)) {
                    context.nextToken();
                    fulfillmentUpdatesSpecification.setTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fulfillmentUpdatesSpecification;
    }

    private static FulfillmentUpdatesSpecificationJsonUnmarshaller instance;

    public static FulfillmentUpdatesSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FulfillmentUpdatesSpecificationJsonUnmarshaller();
        return instance;
    }
}
