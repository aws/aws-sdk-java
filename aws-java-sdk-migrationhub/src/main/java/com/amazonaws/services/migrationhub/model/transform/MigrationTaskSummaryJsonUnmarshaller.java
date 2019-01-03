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
package com.amazonaws.services.migrationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MigrationTaskSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationTaskSummaryJsonUnmarshaller implements Unmarshaller<MigrationTaskSummary, JsonUnmarshallerContext> {

    public MigrationTaskSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MigrationTaskSummary migrationTaskSummary = new MigrationTaskSummary();

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
                if (context.testExpression("ProgressUpdateStream", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setProgressUpdateStream(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationTaskName", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setMigrationTaskName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgressPercent", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setProgressPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetail", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setStatusDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateDateTime", targetDepth)) {
                    context.nextToken();
                    migrationTaskSummary.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return migrationTaskSummary;
    }

    private static MigrationTaskSummaryJsonUnmarshaller instance;

    public static MigrationTaskSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MigrationTaskSummaryJsonUnmarshaller();
        return instance;
    }
}
