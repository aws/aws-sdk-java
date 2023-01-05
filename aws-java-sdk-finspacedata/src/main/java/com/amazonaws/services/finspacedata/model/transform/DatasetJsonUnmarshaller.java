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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Dataset JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetJsonUnmarshaller implements Unmarshaller<Dataset, JsonUnmarshallerContext> {

    public Dataset unmarshall(JsonUnmarshallerContext context) throws Exception {
        Dataset dataset = new Dataset();

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
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    dataset.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetArn", targetDepth)) {
                    context.nextToken();
                    dataset.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetTitle", targetDepth)) {
                    context.nextToken();
                    dataset.setDatasetTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kind", targetDepth)) {
                    context.nextToken();
                    dataset.setKind(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetDescription", targetDepth)) {
                    context.nextToken();
                    dataset.setDatasetDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerInfo", targetDepth)) {
                    context.nextToken();
                    dataset.setOwnerInfo(DatasetOwnerInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    dataset.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    dataset.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("schemaDefinition", targetDepth)) {
                    context.nextToken();
                    dataset.setSchemaDefinition(SchemaUnionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alias", targetDepth)) {
                    context.nextToken();
                    dataset.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataset;
    }

    private static DatasetJsonUnmarshaller instance;

    public static DatasetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonUnmarshaller();
        return instance;
    }
}
