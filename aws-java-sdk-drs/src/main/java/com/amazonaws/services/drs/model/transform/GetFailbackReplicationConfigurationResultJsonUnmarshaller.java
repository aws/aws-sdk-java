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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetFailbackReplicationConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFailbackReplicationConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetFailbackReplicationConfigurationResult, JsonUnmarshallerContext> {

    public GetFailbackReplicationConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetFailbackReplicationConfigurationResult getFailbackReplicationConfigurationResult = new GetFailbackReplicationConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getFailbackReplicationConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bandwidthThrottling", targetDepth)) {
                    context.nextToken();
                    getFailbackReplicationConfigurationResult.setBandwidthThrottling(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getFailbackReplicationConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recoveryInstanceID", targetDepth)) {
                    context.nextToken();
                    getFailbackReplicationConfigurationResult.setRecoveryInstanceID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usePrivateIP", targetDepth)) {
                    context.nextToken();
                    getFailbackReplicationConfigurationResult.setUsePrivateIP(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getFailbackReplicationConfigurationResult;
    }

    private static GetFailbackReplicationConfigurationResultJsonUnmarshaller instance;

    public static GetFailbackReplicationConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFailbackReplicationConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
