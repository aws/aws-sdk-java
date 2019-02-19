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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Activation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivationJsonUnmarshaller implements Unmarshaller<Activation, JsonUnmarshallerContext> {

    public Activation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Activation activation = new Activation();

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
                if (context.testExpression("ActivationId", targetDepth)) {
                    context.nextToken();
                    activation.setActivationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    activation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultInstanceName", targetDepth)) {
                    context.nextToken();
                    activation.setDefaultInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    context.nextToken();
                    activation.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationLimit", targetDepth)) {
                    context.nextToken();
                    activation.setRegistrationLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationsCount", targetDepth)) {
                    context.nextToken();
                    activation.setRegistrationsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    activation.setExpirationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Expired", targetDepth)) {
                    context.nextToken();
                    activation.setExpired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    activation.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    activation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activation;
    }

    private static ActivationJsonUnmarshaller instance;

    public static ActivationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivationJsonUnmarshaller();
        return instance;
    }
}
