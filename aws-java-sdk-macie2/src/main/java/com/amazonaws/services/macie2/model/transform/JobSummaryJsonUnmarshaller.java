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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummaryJsonUnmarshaller implements Unmarshaller<JobSummary, JsonUnmarshallerContext> {

    public JobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobSummary jobSummary = new JobSummary();

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
                if (context.testExpression("bucketDefinitions", targetDepth)) {
                    context.nextToken();
                    jobSummary.setBucketDefinitions(new ListUnmarshaller<S3BucketDefinitionForJob>(S3BucketDefinitionForJobJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    jobSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    jobSummary.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    context.nextToken();
                    jobSummary.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobType", targetDepth)) {
                    context.nextToken();
                    jobSummary.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRunErrorStatus", targetDepth)) {
                    context.nextToken();
                    jobSummary.setLastRunErrorStatus(LastRunErrorStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    jobSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userPausedDetails", targetDepth)) {
                    context.nextToken();
                    jobSummary.setUserPausedDetails(UserPausedDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bucketCriteria", targetDepth)) {
                    context.nextToken();
                    jobSummary.setBucketCriteria(S3BucketCriteriaForJobJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobSummary;
    }

    private static JobSummaryJsonUnmarshaller instance;

    public static JobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobSummaryJsonUnmarshaller();
        return instance;
    }
}
