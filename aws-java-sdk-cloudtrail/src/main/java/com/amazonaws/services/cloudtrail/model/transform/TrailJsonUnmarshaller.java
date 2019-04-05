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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Trail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrailJsonUnmarshaller implements Unmarshaller<Trail, JsonUnmarshallerContext> {

    public Trail unmarshall(JsonUnmarshallerContext context) throws Exception {
        Trail trail = new Trail();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    trail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    context.nextToken();
                    trail.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    context.nextToken();
                    trail.setS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicName", targetDepth)) {
                    context.nextToken();
                    trail.setSnsTopicName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicARN", targetDepth)) {
                    context.nextToken();
                    trail.setSnsTopicARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludeGlobalServiceEvents", targetDepth)) {
                    context.nextToken();
                    trail.setIncludeGlobalServiceEvents(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsMultiRegionTrail", targetDepth)) {
                    context.nextToken();
                    trail.setIsMultiRegionTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HomeRegion", targetDepth)) {
                    context.nextToken();
                    trail.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrailARN", targetDepth)) {
                    context.nextToken();
                    trail.setTrailARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFileValidationEnabled", targetDepth)) {
                    context.nextToken();
                    trail.setLogFileValidationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsLogGroupArn", targetDepth)) {
                    context.nextToken();
                    trail.setCloudWatchLogsLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsRoleArn", targetDepth)) {
                    context.nextToken();
                    trail.setCloudWatchLogsRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    trail.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HasCustomEventSelectors", targetDepth)) {
                    context.nextToken();
                    trail.setHasCustomEventSelectors(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsOrganizationTrail", targetDepth)) {
                    context.nextToken();
                    trail.setIsOrganizationTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trail;
    }

    private static TrailJsonUnmarshaller instance;

    public static TrailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrailJsonUnmarshaller();
        return instance;
    }
}
