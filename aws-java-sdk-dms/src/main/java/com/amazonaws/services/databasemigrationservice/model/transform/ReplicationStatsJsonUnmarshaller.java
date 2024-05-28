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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationStats JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationStatsJsonUnmarshaller implements Unmarshaller<ReplicationStats, JsonUnmarshallerContext> {

    public ReplicationStats unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationStats replicationStats = new ReplicationStats();

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
                if (context.testExpression("FullLoadProgressPercent", targetDepth)) {
                    context.nextToken();
                    replicationStats.setFullLoadProgressPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ElapsedTimeMillis", targetDepth)) {
                    context.nextToken();
                    replicationStats.setElapsedTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TablesLoaded", targetDepth)) {
                    context.nextToken();
                    replicationStats.setTablesLoaded(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesLoading", targetDepth)) {
                    context.nextToken();
                    replicationStats.setTablesLoading(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesQueued", targetDepth)) {
                    context.nextToken();
                    replicationStats.setTablesQueued(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesErrored", targetDepth)) {
                    context.nextToken();
                    replicationStats.setTablesErrored(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FreshStartDate", targetDepth)) {
                    context.nextToken();
                    replicationStats.setFreshStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    replicationStats.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StopDate", targetDepth)) {
                    context.nextToken();
                    replicationStats.setStopDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FullLoadStartDate", targetDepth)) {
                    context.nextToken();
                    replicationStats.setFullLoadStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FullLoadFinishDate", targetDepth)) {
                    context.nextToken();
                    replicationStats.setFullLoadFinishDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationStats;
    }

    private static ReplicationStatsJsonUnmarshaller instance;

    public static ReplicationStatsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationStatsJsonUnmarshaller();
        return instance;
    }
}
