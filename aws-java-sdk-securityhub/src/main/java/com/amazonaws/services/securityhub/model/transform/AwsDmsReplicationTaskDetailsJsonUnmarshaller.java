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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsDmsReplicationTaskDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsReplicationTaskDetailsJsonUnmarshaller implements Unmarshaller<AwsDmsReplicationTaskDetails, JsonUnmarshallerContext> {

    public AwsDmsReplicationTaskDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsDmsReplicationTaskDetails awsDmsReplicationTaskDetails = new AwsDmsReplicationTaskDetails();

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
                if (context.testExpression("CdcStartPosition", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setCdcStartPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStartTime", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setCdcStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStopPosition", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setCdcStopPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationType", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setMigrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceIdentifier", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setResourceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskIdentifier", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setReplicationTaskIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskSettings", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setReplicationTaskSettings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEndpointArn", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setSourceEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableMappings", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setTableMappings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetEndpointArn", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setTargetEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskData", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationTaskDetails.setTaskData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsDmsReplicationTaskDetails;
    }

    private static AwsDmsReplicationTaskDetailsJsonUnmarshaller instance;

    public static AwsDmsReplicationTaskDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsDmsReplicationTaskDetailsJsonUnmarshaller();
        return instance;
    }
}
