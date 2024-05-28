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
package com.amazonaws.services.workspacesweb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IpAccessSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAccessSettingsJsonUnmarshaller implements Unmarshaller<IpAccessSettings, JsonUnmarshallerContext> {

    public IpAccessSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        IpAccessSettings ipAccessSettings = new IpAccessSettings();

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
                if (context.testExpression("additionalEncryptionContext", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setAdditionalEncryptionContext(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("associatedPortalArns", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setAssociatedPortalArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("customerManagedKey", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setCustomerManagedKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAccessSettingsArn", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setIpAccessSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipRules", targetDepth)) {
                    context.nextToken();
                    ipAccessSettings.setIpRules(new ListUnmarshaller<IpRule>(IpRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ipAccessSettings;
    }

    private static IpAccessSettingsJsonUnmarshaller instance;

    public static IpAccessSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpAccessSettingsJsonUnmarshaller();
        return instance;
    }
}
