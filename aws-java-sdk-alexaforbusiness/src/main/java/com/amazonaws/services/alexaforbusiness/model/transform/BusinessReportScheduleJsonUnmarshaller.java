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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BusinessReportSchedule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessReportScheduleJsonUnmarshaller implements Unmarshaller<BusinessReportSchedule, JsonUnmarshallerContext> {

    public BusinessReportSchedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        BusinessReportSchedule businessReportSchedule = new BusinessReportSchedule();

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
                if (context.testExpression("ScheduleArn", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setScheduleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleName", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setScheduleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentRange", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setContentRange(BusinessReportContentRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Recurrence", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setRecurrence(BusinessReportRecurrenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastBusinessReport", targetDepth)) {
                    context.nextToken();
                    businessReportSchedule.setLastBusinessReport(BusinessReportJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return businessReportSchedule;
    }

    private static BusinessReportScheduleJsonUnmarshaller instance;

    public static BusinessReportScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportScheduleJsonUnmarshaller();
        return instance;
    }
}
