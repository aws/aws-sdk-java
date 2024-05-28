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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SecurityControlDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlDefinitionJsonUnmarshaller implements Unmarshaller<SecurityControlDefinition, JsonUnmarshallerContext> {

    public SecurityControlDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        SecurityControlDefinition securityControlDefinition = new SecurityControlDefinition();

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
                if (context.testExpression("SecurityControlId", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setSecurityControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RemediationUrl", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setRemediationUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SeverityRating", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setSeverityRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentRegionAvailability", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setCurrentRegionAvailability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomizableProperties", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setCustomizableProperties(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ParameterDefinitions", targetDepth)) {
                    context.nextToken();
                    securityControlDefinition.setParameterDefinitions(new MapUnmarshaller<String, ParameterDefinition>(context.getUnmarshaller(String.class),
                            ParameterDefinitionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return securityControlDefinition;
    }

    private static SecurityControlDefinitionJsonUnmarshaller instance;

    public static SecurityControlDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SecurityControlDefinitionJsonUnmarshaller();
        return instance;
    }
}
