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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobProcessDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobProcessDetailsJsonUnmarshaller implements Unmarshaller<JobProcessDetails, JsonUnmarshallerContext> {

    public JobProcessDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobProcessDetails jobProcessDetails = new JobProcessDetails();

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
                if (context.testExpression("processingTargets", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setProcessingTargets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("numberOfCanceledThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfCanceledThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfSucceededThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfSucceededThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfFailedThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfFailedThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRejectedThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfRejectedThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfQueuedThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfQueuedThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInProgressThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfInProgressThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRemovedThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfRemovedThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfTimedOutThings", targetDepth)) {
                    context.nextToken();
                    jobProcessDetails.setNumberOfTimedOutThings(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobProcessDetails;
    }

    private static JobProcessDetailsJsonUnmarshaller instance;

    public static JobProcessDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobProcessDetailsJsonUnmarshaller();
        return instance;
    }
}
