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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MaintenanceWindowRunCommandParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowRunCommandParametersJsonUnmarshaller implements Unmarshaller<MaintenanceWindowRunCommandParameters, JsonUnmarshallerContext> {

    public MaintenanceWindowRunCommandParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters = new MaintenanceWindowRunCommandParameters();

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
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentHash", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setDocumentHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentHashType", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setDocumentHashType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfig", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputS3BucketName", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setOutputS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3KeyPrefix", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setOutputS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowRunCommandParameters.setTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return maintenanceWindowRunCommandParameters;
    }

    private static MaintenanceWindowRunCommandParametersJsonUnmarshaller instance;

    public static MaintenanceWindowRunCommandParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowRunCommandParametersJsonUnmarshaller();
        return instance;
    }
}
