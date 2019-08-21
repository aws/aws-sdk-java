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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DatasetImportJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetImportJobSummaryJsonUnmarshaller implements Unmarshaller<DatasetImportJobSummary, JsonUnmarshallerContext> {

    public DatasetImportJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatasetImportJobSummary datasetImportJobSummary = new DatasetImportJobSummary();

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
                if (context.testExpression("DatasetImportJobArn", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setDatasetImportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetImportJobName", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setDatasetImportJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setDataSource(DataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    datasetImportJobSummary.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return datasetImportJobSummary;
    }

    private static DatasetImportJobSummaryJsonUnmarshaller instance;

    public static DatasetImportJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetImportJobSummaryJsonUnmarshaller();
        return instance;
    }
}
