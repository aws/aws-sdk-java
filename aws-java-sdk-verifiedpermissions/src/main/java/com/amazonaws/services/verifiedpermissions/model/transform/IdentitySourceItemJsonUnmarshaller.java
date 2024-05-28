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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.verifiedpermissions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IdentitySourceItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentitySourceItemJsonUnmarshaller implements Unmarshaller<IdentitySourceItem, JsonUnmarshallerContext> {

    public IdentitySourceItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        IdentitySourceItem identitySourceItem = new IdentitySourceItem();

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
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setDetails(IdentitySourceItemDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("identitySourceId", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setIdentitySourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("policyStoreId", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setPolicyStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("principalEntityType", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setPrincipalEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    identitySourceItem.setConfiguration(ConfigurationItemJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return identitySourceItem;
    }

    private static IdentitySourceItemJsonUnmarshaller instance;

    public static IdentitySourceItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IdentitySourceItemJsonUnmarshaller();
        return instance;
    }
}
