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
 * AthenaConnectorSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaConnectorSourceJsonUnmarshaller implements Unmarshaller<AthenaConnectorSource, JsonUnmarshallerContext> {

    public AthenaConnectorSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AthenaConnectorSource athenaConnectorSource = new AthenaConnectorSource();

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
                    athenaConnectorSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionName", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectorName", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionType", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionTable", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setConnectionTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputSchemas", targetDepth)) {
                    context.nextToken();
                    athenaConnectorSource.setOutputSchemas(new ListUnmarshaller<GlueSchema>(GlueSchemaJsonUnmarshaller.getInstance())

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

        return athenaConnectorSource;
    }

    private static AthenaConnectorSourceJsonUnmarshaller instance;

    public static AthenaConnectorSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AthenaConnectorSourceJsonUnmarshaller();
        return instance;
    }
}
