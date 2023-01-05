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
 * S3CatalogTarget JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CatalogTargetJsonUnmarshaller implements Unmarshaller<S3CatalogTarget, JsonUnmarshallerContext> {

    public S3CatalogTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3CatalogTarget s3CatalogTarget = new S3CatalogTarget();

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
                    s3CatalogTarget.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    s3CatalogTarget.setInputs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    context.nextToken();
                    s3CatalogTarget.setPartitionKeys(new ListUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    )

                    .unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    s3CatalogTarget.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    s3CatalogTarget.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaChangePolicy", targetDepth)) {
                    context.nextToken();
                    s3CatalogTarget.setSchemaChangePolicy(CatalogSchemaChangePolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3CatalogTarget;
    }

    private static S3CatalogTargetJsonUnmarshaller instance;

    public static S3CatalogTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3CatalogTargetJsonUnmarshaller();
        return instance;
    }
}
