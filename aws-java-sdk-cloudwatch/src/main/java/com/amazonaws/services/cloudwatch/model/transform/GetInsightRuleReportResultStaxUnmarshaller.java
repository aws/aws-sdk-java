/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetInsightRuleReportResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightRuleReportResultStaxUnmarshaller implements Unmarshaller<GetInsightRuleReportResult, StaxUnmarshallerContext> {

    public GetInsightRuleReportResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetInsightRuleReportResult getInsightRuleReportResult = new GetInsightRuleReportResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getInsightRuleReportResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("KeyLabels", targetDepth)) {
                    getInsightRuleReportResult.withKeyLabels(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("KeyLabels/member", targetDepth)) {
                    getInsightRuleReportResult.withKeyLabels(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AggregationStatistic", targetDepth)) {
                    getInsightRuleReportResult.setAggregationStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AggregateValue", targetDepth)) {
                    getInsightRuleReportResult.setAggregateValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApproximateUniqueCount", targetDepth)) {
                    getInsightRuleReportResult.setApproximateUniqueCount(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Contributors", targetDepth)) {
                    getInsightRuleReportResult.withContributors(new ArrayList<InsightRuleContributor>());
                    continue;
                }

                if (context.testExpression("Contributors/member", targetDepth)) {
                    getInsightRuleReportResult.withContributors(InsightRuleContributorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricDatapoints", targetDepth)) {
                    getInsightRuleReportResult.withMetricDatapoints(new ArrayList<InsightRuleMetricDatapoint>());
                    continue;
                }

                if (context.testExpression("MetricDatapoints/member", targetDepth)) {
                    getInsightRuleReportResult.withMetricDatapoints(InsightRuleMetricDatapointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getInsightRuleReportResult;
                }
            }
        }
    }

    private static GetInsightRuleReportResultStaxUnmarshaller instance;

    public static GetInsightRuleReportResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetInsightRuleReportResultStaxUnmarshaller();
        return instance;
    }
}
