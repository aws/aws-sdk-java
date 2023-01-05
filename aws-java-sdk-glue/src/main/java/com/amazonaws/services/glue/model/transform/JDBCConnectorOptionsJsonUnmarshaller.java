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
 * JDBCConnectorOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JDBCConnectorOptionsJsonUnmarshaller implements Unmarshaller<JDBCConnectorOptions, JsonUnmarshallerContext> {

    public JDBCConnectorOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        JDBCConnectorOptions jDBCConnectorOptions = new JDBCConnectorOptions();

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
                if (context.testExpression("FilterPredicate", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setFilterPredicate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartitionColumn", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setPartitionColumn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LowerBound", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setLowerBound(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("UpperBound", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setUpperBound(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumPartitions", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setNumPartitions(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("JobBookmarkKeys", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setJobBookmarkKeys(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("JobBookmarkKeysSortOrder", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setJobBookmarkKeysSortOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataTypeMapping", targetDepth)) {
                    context.nextToken();
                    jDBCConnectorOptions.setDataTypeMapping(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return jDBCConnectorOptions;
    }

    private static JDBCConnectorOptionsJsonUnmarshaller instance;

    public static JDBCConnectorOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JDBCConnectorOptionsJsonUnmarshaller();
        return instance;
    }
}
