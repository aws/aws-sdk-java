/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvalidNetworkSettingsException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidNetworkSettingsExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InvalidNetworkSettingsExceptionUnmarshaller() {
        super(com.amazonaws.services.fsx.model.InvalidNetworkSettingsException.class, "InvalidNetworkSettings");
    }

    @Override
    public com.amazonaws.services.fsx.model.InvalidNetworkSettingsException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.fsx.model.InvalidNetworkSettingsException invalidNetworkSettingsException = new com.amazonaws.services.fsx.model.InvalidNetworkSettingsException(
                null);

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
                if (context.testExpression("InvalidSubnetId", targetDepth)) {
                    context.nextToken();
                    invalidNetworkSettingsException.setInvalidSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvalidSecurityGroupId", targetDepth)) {
                    context.nextToken();
                    invalidNetworkSettingsException.setInvalidSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return invalidNetworkSettingsException;
    }

    private static InvalidNetworkSettingsExceptionUnmarshaller instance;

    public static InvalidNetworkSettingsExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvalidNetworkSettingsExceptionUnmarshaller();
        return instance;
    }
}
