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
package com.amazonaws.services.b2bi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.b2bi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePartnershipResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePartnershipResultJsonUnmarshaller implements Unmarshaller<CreatePartnershipResult, JsonUnmarshallerContext> {

    public CreatePartnershipResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePartnershipResult createPartnershipResult = new CreatePartnershipResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPartnershipResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("profileId", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("partnershipId", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setPartnershipId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("partnershipArn", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setPartnershipArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("email", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phone", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setPhone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capabilities", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tradingPartnerId", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setTradingPartnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createPartnershipResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createPartnershipResult;
    }

    private static CreatePartnershipResultJsonUnmarshaller instance;

    public static CreatePartnershipResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePartnershipResultJsonUnmarshaller();
        return instance;
    }
}
