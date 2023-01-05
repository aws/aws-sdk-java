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
 * S3ParquetSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ParquetSourceJsonUnmarshaller implements Unmarshaller<S3ParquetSource, JsonUnmarshallerContext> {

    public S3ParquetSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3ParquetSource s3ParquetSource = new S3ParquetSource();

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
                    s3ParquetSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Paths", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setPaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CompressionType", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Exclusions", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setExclusions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("GroupSize", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setGroupSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupFiles", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setGroupFiles(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Recurse", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setRecurse(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxBand", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setMaxBand(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxFilesInBand", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setMaxFilesInBand(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setAdditionalOptions(S3DirectSourceAdditionalOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputSchemas", targetDepth)) {
                    context.nextToken();
                    s3ParquetSource.setOutputSchemas(new ListUnmarshaller<GlueSchema>(GlueSchemaJsonUnmarshaller.getInstance())

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

        return s3ParquetSource;
    }

    private static S3ParquetSourceJsonUnmarshaller instance;

    public static S3ParquetSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ParquetSourceJsonUnmarshaller();
        return instance;
    }
}
