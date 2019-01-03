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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartContinuousExportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContinuousExportResultJsonUnmarshaller implements Unmarshaller<StartContinuousExportResult, JsonUnmarshallerContext> {

    public StartContinuousExportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartContinuousExportResult startContinuousExportResult = new StartContinuousExportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startContinuousExportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("exportId", targetDepth)) {
                    context.nextToken();
                    startContinuousExportResult.setExportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3Bucket", targetDepth)) {
                    context.nextToken();
                    startContinuousExportResult.setS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    startContinuousExportResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataSource", targetDepth)) {
                    context.nextToken();
                    startContinuousExportResult.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schemaStorageConfig", targetDepth)) {
                    context.nextToken();
                    startContinuousExportResult.setSchemaStorageConfig(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return startContinuousExportResult;
    }

    private static StartContinuousExportResultJsonUnmarshaller instance;

    public static StartContinuousExportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartContinuousExportResultJsonUnmarshaller();
        return instance;
    }
}
