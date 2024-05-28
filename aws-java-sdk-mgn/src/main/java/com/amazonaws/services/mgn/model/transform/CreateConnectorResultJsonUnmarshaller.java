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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateConnectorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorResultJsonUnmarshaller implements Unmarshaller<CreateConnectorResult, JsonUnmarshallerContext> {

    public CreateConnectorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateConnectorResult createConnectorResult = new CreateConnectorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createConnectorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorID", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setConnectorID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ssmCommandConfig", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setSsmCommandConfig(ConnectorSsmCommandConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ssmInstanceID", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setSsmInstanceID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createConnectorResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createConnectorResult;
    }

    private static CreateConnectorResultJsonUnmarshaller instance;

    public static CreateConnectorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateConnectorResultJsonUnmarshaller();
        return instance;
    }
}
