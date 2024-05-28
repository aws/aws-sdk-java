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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PropertygraphSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertygraphSummaryJsonUnmarshaller implements Unmarshaller<PropertygraphSummary, JsonUnmarshallerContext> {

    public PropertygraphSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PropertygraphSummary propertygraphSummary = new PropertygraphSummary();

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
                if (context.testExpression("numNodes", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumNodes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numEdges", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumEdges(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numNodeLabels", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumNodeLabels(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numEdgeLabels", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumEdgeLabels(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("nodeLabels", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNodeLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("edgeLabels", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setEdgeLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("numNodeProperties", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumNodeProperties(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numEdgeProperties", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNumEdgeProperties(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("nodeProperties", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNodeProperties(new ListUnmarshaller<java.util.Map<String, Long>>(new MapUnmarshaller<String, Long>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(Long.class)))

                    .unmarshall(context));
                }
                if (context.testExpression("edgeProperties", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setEdgeProperties(new ListUnmarshaller<java.util.Map<String, Long>>(new MapUnmarshaller<String, Long>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(Long.class)))

                    .unmarshall(context));
                }
                if (context.testExpression("totalNodePropertyValues", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setTotalNodePropertyValues(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalEdgePropertyValues", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setTotalEdgePropertyValues(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("nodeStructures", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setNodeStructures(new ListUnmarshaller<NodeStructure>(NodeStructureJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("edgeStructures", targetDepth)) {
                    context.nextToken();
                    propertygraphSummary.setEdgeStructures(new ListUnmarshaller<EdgeStructure>(EdgeStructureJsonUnmarshaller.getInstance())

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

        return propertygraphSummary;
    }

    private static PropertygraphSummaryJsonUnmarshaller instance;

    public static PropertygraphSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PropertygraphSummaryJsonUnmarshaller();
        return instance;
    }
}
