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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegistrationInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationInformationJsonUnmarshaller implements Unmarshaller<RegistrationInformation, JsonUnmarshallerContext> {

    public RegistrationInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegistrationInformation registrationInformation = new RegistrationInformation();

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
                if (context.testExpression("RegistrationArn", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setRegistrationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationId", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setRegistrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationType", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setRegistrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationStatus", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setRegistrationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentVersionNumber", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setCurrentVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ApprovedVersionNumber", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setApprovedVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestDeniedVersionNumber", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setLatestDeniedVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalAttributes", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setAdditionalAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationInformation.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registrationInformation;
    }

    private static RegistrationInformationJsonUnmarshaller instance;

    public static RegistrationInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegistrationInformationJsonUnmarshaller();
        return instance;
    }
}
