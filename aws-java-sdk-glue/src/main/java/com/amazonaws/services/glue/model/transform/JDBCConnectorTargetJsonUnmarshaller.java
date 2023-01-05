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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JDBCConnectorTarget JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JDBCConnectorTargetJsonUnmarshaller implements Unmarshaller<JDBCConnectorTarget, JsonUnmarshallerContext> {

    public JDBCConnectorTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        JDBCConnectorTarget jDBCConnectorTarget = new JDBCConnectorTarget();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setInputs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ConnectionName", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionTable", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setConnectionTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectorName", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionType", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setAdditionalOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("OutputSchemas", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorTarget.setOutputSchemas(new ListUnmarshaller<GlueSchema>(GlueSchemaJsonUnmarshaller.getInstance())

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

        return jDBCConnectorTarget;
    }

    private static JDBCConnectorTargetJsonUnmarshaller instance;

    public static JDBCConnectorTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JDBCConnectorTargetJsonUnmarshaller();
        return instance;
    }
}
