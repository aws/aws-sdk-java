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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetImportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportResultJsonUnmarshaller implements Unmarshaller<GetImportResult, JsonUnmarshallerContext> {

    public GetImportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImportResult getImportResult = new GetImportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getImportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ImportId", targetDepth)) {
                    context.nextToken();
                    getImportResult.setImportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destinations", targetDepth)) {
                    context.nextToken();
                    getImportResult.setDestinations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ImportSource", targetDepth)) {
                    context.nextToken();
                    getImportResult.setImportSource(ImportSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartEventTime", targetDepth)) {
                    context.nextToken();
                    getImportResult.setStartEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndEventTime", targetDepth)) {
                    context.nextToken();
                    getImportResult.setEndEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportStatus", targetDepth)) {
                    context.nextToken();
                    getImportResult.setImportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getImportResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getImportResult.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportStatistics", targetDepth)) {
                    context.nextToken();
                    getImportResult.setImportStatistics(ImportStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getImportResult;
    }

    private static GetImportResultJsonUnmarshaller instance;

    public static GetImportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImportResultJsonUnmarshaller();
        return instance;
    }
}
