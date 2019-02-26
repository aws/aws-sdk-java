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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CrawlerMetrics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerMetricsJsonUnmarshaller implements Unmarshaller<CrawlerMetrics, JsonUnmarshallerContext> {

    public CrawlerMetrics unmarshall(JsonUnmarshallerContext context) throws Exception {
        CrawlerMetrics crawlerMetrics = new CrawlerMetrics();

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
                if (context.testExpression("CrawlerName", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setCrawlerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeLeftSeconds", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setTimeLeftSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StillEstimating", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setStillEstimating(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastRuntimeSeconds", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setLastRuntimeSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MedianRuntimeSeconds", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setMedianRuntimeSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("TablesCreated", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setTablesCreated(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesUpdated", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setTablesUpdated(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesDeleted", targetDepth)) {
                    context.nextToken();
                    crawlerMetrics.setTablesDeleted(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return crawlerMetrics;
    }

    private static CrawlerMetricsJsonUnmarshaller instance;

    public static CrawlerMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerMetricsJsonUnmarshaller();
        return instance;
    }
}
