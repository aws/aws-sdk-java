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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Job JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

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
                if (context.testExpression("accelerationSettings", targetDepth)) {
                    context.nextToken();
                    job.setAccelerationSettings(AccelerationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    job.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("billingTagsSource", targetDepth)) {
                    context.nextToken();
                    job.setBillingTagsSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    job.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("currentPhase", targetDepth)) {
                    context.nextToken();
                    job.setCurrentPhase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    context.nextToken();
                    job.setErrorCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    job.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    job.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobPercentComplete", targetDepth)) {
                    context.nextToken();
                    job.setJobPercentComplete(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jobTemplate", targetDepth)) {
                    context.nextToken();
                    job.setJobTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputGroupDetails", targetDepth)) {
                    context.nextToken();
                    job.setOutputGroupDetails(new ListUnmarshaller<OutputGroupDetail>(OutputGroupDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("queue", targetDepth)) {
                    context.nextToken();
                    job.setQueue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("retryCount", targetDepth)) {
                    context.nextToken();
                    job.setRetryCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("role", targetDepth)) {
                    context.nextToken();
                    job.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("settings", targetDepth)) {
                    context.nextToken();
                    job.setSettings(JobSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    job.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusUpdateInterval", targetDepth)) {
                    context.nextToken();
                    job.setStatusUpdateInterval(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timing", targetDepth)) {
                    context.nextToken();
                    job.setTiming(TimingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("userMetadata", targetDepth)) {
                    context.nextToken();
                    job.setUserMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
