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
 * CatalogKafkaSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogKafkaSourceJsonUnmarshaller implements Unmarshaller<CatalogKafkaSource, JsonUnmarshallerContext> {

    public CatalogKafkaSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        CatalogKafkaSource catalogKafkaSource = new CatalogKafkaSource();

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
                    catalogKafkaSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowSize", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setWindowSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DetectSchema", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setDetectSchema(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamingOptions", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setStreamingOptions(KafkaStreamingSourceOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataPreviewOptions", targetDepth)) {
                    context.nextToken();
                    catalogKafkaSource.setDataPreviewOptions(StreamingDataPreviewOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return catalogKafkaSource;
    }

    private static CatalogKafkaSourceJsonUnmarshaller instance;

    public static CatalogKafkaSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CatalogKafkaSourceJsonUnmarshaller();
        return instance;
    }
}
