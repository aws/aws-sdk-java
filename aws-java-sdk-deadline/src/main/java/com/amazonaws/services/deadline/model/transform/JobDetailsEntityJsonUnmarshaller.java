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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobDetailsEntity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetailsEntityJsonUnmarshaller implements Unmarshaller<JobDetailsEntity, JsonUnmarshallerContext> {

    public JobDetailsEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobDetailsEntity jobDetailsEntity = new JobDetailsEntity();

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
                if (context.testExpression("jobAttachmentSettings", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setJobAttachmentSettings(JobAttachmentSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobRunAsUser", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setJobRunAsUser(JobRunAsUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logGroupName", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setParameters(new MapUnmarshaller<String, JobParameter>(context.getUnmarshaller(String.class),
                            JobParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("pathMappingRules", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setPathMappingRules(new ListUnmarshaller<PathMappingRule>(PathMappingRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("queueRoleArn", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setQueueRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    context.nextToken();
                    jobDetailsEntity.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobDetailsEntity;
    }

    private static JobDetailsEntityJsonUnmarshaller instance;

    public static JobDetailsEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobDetailsEntityJsonUnmarshaller();
        return instance;
    }
}
