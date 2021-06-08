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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationTaskAssessmentRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskAssessmentRunJsonUnmarshaller implements Unmarshaller<ReplicationTaskAssessmentRun, JsonUnmarshallerContext> {

    public ReplicationTaskAssessmentRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationTaskAssessmentRun replicationTaskAssessmentRun = new ReplicationTaskAssessmentRun();

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
                if (context.testExpression("ReplicationTaskAssessmentRunArn", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setReplicationTaskAssessmentRunArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskArn", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setReplicationTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskAssessmentRunCreationDate", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setReplicationTaskAssessmentRunCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp")
                            .unmarshall(context));
                }
                if (context.testExpression("AssessmentProgress", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setAssessmentProgress(ReplicationTaskAssessmentRunProgressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setLastFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultLocationBucket", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setResultLocationBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultLocationFolder", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setResultLocationFolder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultEncryptionMode", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setResultEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultKmsKeyArn", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setResultKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssessmentRunName", targetDepth)) {
                    context.nextToken();
                    replicationTaskAssessmentRun.setAssessmentRunName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationTaskAssessmentRun;
    }

    private static ReplicationTaskAssessmentRunJsonUnmarshaller instance;

    public static ReplicationTaskAssessmentRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskAssessmentRunJsonUnmarshaller();
        return instance;
    }
}
