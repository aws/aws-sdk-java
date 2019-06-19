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
package com.amazonaws.services.textract.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Block JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockJsonUnmarshaller implements Unmarshaller<Block, JsonUnmarshallerContext> {

    public Block unmarshall(JsonUnmarshallerContext context) throws Exception {
        Block block = new Block();

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
                if (context.testExpression("BlockType", targetDepth)) {
                    context.nextToken();
                    block.setBlockType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    context.nextToken();
                    block.setConfidence(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    block.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RowIndex", targetDepth)) {
                    context.nextToken();
                    block.setRowIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ColumnIndex", targetDepth)) {
                    context.nextToken();
                    block.setColumnIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RowSpan", targetDepth)) {
                    context.nextToken();
                    block.setRowSpan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ColumnSpan", targetDepth)) {
                    context.nextToken();
                    block.setColumnSpan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Geometry", targetDepth)) {
                    context.nextToken();
                    block.setGeometry(GeometryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    block.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Relationships", targetDepth)) {
                    context.nextToken();
                    block.setRelationships(new ListUnmarshaller<Relationship>(RelationshipJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("EntityTypes", targetDepth)) {
                    context.nextToken();
                    block.setEntityTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SelectionStatus", targetDepth)) {
                    context.nextToken();
                    block.setSelectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Page", targetDepth)) {
                    context.nextToken();
                    block.setPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return block;
    }

    private static BlockJsonUnmarshaller instance;

    public static BlockJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlockJsonUnmarshaller();
        return instance;
    }
}
