/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetMetricStreamResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricStreamResultStaxUnmarshaller implements Unmarshaller<GetMetricStreamResult, StaxUnmarshallerContext> {

    public GetMetricStreamResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetMetricStreamResult getMetricStreamResult = new GetMetricStreamResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getMetricStreamResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Arn", targetDepth)) {
                    getMetricStreamResult.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    getMetricStreamResult.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IncludeFilters", targetDepth)) {
                    getMetricStreamResult.withIncludeFilters(new ArrayList<MetricStreamFilter>());
                    continue;
                }

                if (context.testExpression("IncludeFilters/member", targetDepth)) {
                    getMetricStreamResult.withIncludeFilters(MetricStreamFilterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExcludeFilters", targetDepth)) {
                    getMetricStreamResult.withExcludeFilters(new ArrayList<MetricStreamFilter>());
                    continue;
                }

                if (context.testExpression("ExcludeFilters/member", targetDepth)) {
                    getMetricStreamResult.withExcludeFilters(MetricStreamFilterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FirehoseArn", targetDepth)) {
                    getMetricStreamResult.setFirehoseArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleArn", targetDepth)) {
                    getMetricStreamResult.setRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    getMetricStreamResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationDate", targetDepth)) {
                    getMetricStreamResult.setCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastUpdateDate", targetDepth)) {
                    getMetricStreamResult.setLastUpdateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("OutputFormat", targetDepth)) {
                    getMetricStreamResult.setOutputFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getMetricStreamResult;
                }
            }
        }
    }

    private static GetMetricStreamResultStaxUnmarshaller instance;

    public static GetMetricStreamResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMetricStreamResultStaxUnmarshaller();
        return instance;
    }
}
