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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedConnector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedConnectorJsonUnmarshaller implements Unmarshaller<DescribedConnector, JsonUnmarshallerContext> {

    public DescribedConnector unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedConnector describedConnector = new DescribedConnector();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describedConnector.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectorId", targetDepth)) {
                    context.nextToken();
                    describedConnector.setConnectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    describedConnector.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("As2Config", targetDepth)) {
                    context.nextToken();
                    describedConnector.setAs2Config(As2ConnectorConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessRole", targetDepth)) {
                    context.nextToken();
                    describedConnector.setAccessRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingRole", targetDepth)) {
                    context.nextToken();
                    describedConnector.setLoggingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describedConnector.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return describedConnector;
    }

    private static DescribedConnectorJsonUnmarshaller instance;

    public static DescribedConnectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedConnectorJsonUnmarshaller();
        return instance;
    }
}
