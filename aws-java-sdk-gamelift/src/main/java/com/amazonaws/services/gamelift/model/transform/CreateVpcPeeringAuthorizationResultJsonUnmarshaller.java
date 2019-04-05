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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateVpcPeeringAuthorizationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringAuthorizationResultJsonUnmarshaller implements Unmarshaller<CreateVpcPeeringAuthorizationResult, JsonUnmarshallerContext> {

    public CreateVpcPeeringAuthorizationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateVpcPeeringAuthorizationResult createVpcPeeringAuthorizationResult = new CreateVpcPeeringAuthorizationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createVpcPeeringAuthorizationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VpcPeeringAuthorization", targetDepth)) {
                    context.nextToken();
                    createVpcPeeringAuthorizationResult.setVpcPeeringAuthorization(VpcPeeringAuthorizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createVpcPeeringAuthorizationResult;
    }

    private static CreateVpcPeeringAuthorizationResultJsonUnmarshaller instance;

    public static CreateVpcPeeringAuthorizationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpcPeeringAuthorizationResultJsonUnmarshaller();
        return instance;
    }
}
