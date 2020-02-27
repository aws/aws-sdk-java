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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Alarm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmJsonUnmarshaller implements Unmarshaller<Alarm, JsonUnmarshallerContext> {

    public Alarm unmarshall(JsonUnmarshallerContext context) throws Exception {
        Alarm alarm = new Alarm();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    alarm.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    alarm.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    alarm.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    alarm.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    alarm.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    alarm.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("monitoredResourceInfo", targetDepth)) {
                    context.nextToken();
                    alarm.setMonitoredResourceInfo(MonitoredResourceInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("comparisonOperator", targetDepth)) {
                    context.nextToken();
                    alarm.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evaluationPeriods", targetDepth)) {
                    context.nextToken();
                    alarm.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("period", targetDepth)) {
                    context.nextToken();
                    alarm.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("threshold", targetDepth)) {
                    context.nextToken();
                    alarm.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("datapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    alarm.setDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("treatMissingData", targetDepth)) {
                    context.nextToken();
                    alarm.setTreatMissingData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statistic", targetDepth)) {
                    context.nextToken();
                    alarm.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricName", targetDepth)) {
                    context.nextToken();
                    alarm.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    alarm.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    alarm.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contactProtocols", targetDepth)) {
                    context.nextToken();
                    alarm.setContactProtocols(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("notificationTriggers", targetDepth)) {
                    context.nextToken();
                    alarm.setNotificationTriggers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("notificationEnabled", targetDepth)) {
                    context.nextToken();
                    alarm.setNotificationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return alarm;
    }

    private static AlarmJsonUnmarshaller instance;

    public static AlarmJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlarmJsonUnmarshaller();
        return instance;
    }
}
