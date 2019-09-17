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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetMetricDataResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricDataResultStaxUnmarshaller implements Unmarshaller<GetMetricDataResult, StaxUnmarshallerContext> {

    public GetMetricDataResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetMetricDataResult getMetricDataResult = new GetMetricDataResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getMetricDataResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MetricDataResults", targetDepth)) {
                    getMetricDataResult.withMetricDataResults(new ArrayList<MetricDataResult>());
                    continue;
                }

                if (context.testExpression("MetricDataResults/member", targetDepth)) {
                    getMetricDataResult.withMetricDataResults(MetricDataResultStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    getMetricDataResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Messages", targetDepth)) {
                    getMetricDataResult.withMessages(new ArrayList<MessageData>());
                    continue;
                }

                if (context.testExpression("Messages/member", targetDepth)) {
                    getMetricDataResult.withMessages(MessageDataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getMetricDataResult;
                }
            }
        }
    }

    private static GetMetricDataResultStaxUnmarshaller instance;

    public static GetMetricDataResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMetricDataResultStaxUnmarshaller();
        return instance;
    }
}
