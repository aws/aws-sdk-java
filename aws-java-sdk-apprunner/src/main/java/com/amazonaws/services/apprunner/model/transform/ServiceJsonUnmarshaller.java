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
package com.amazonaws.services.apprunner.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apprunner.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Service JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        Service service = new Service();

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
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    service.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceId", targetDepth)) {
                    context.nextToken();
                    service.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceArn", targetDepth)) {
                    context.nextToken();
                    service.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceUrl", targetDepth)) {
                    context.nextToken();
                    service.setServiceUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    service.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    service.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletedAt", targetDepth)) {
                    context.nextToken();
                    service.setDeletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    service.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setSourceConfiguration(SourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setInstanceConfiguration(InstanceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HealthCheckConfiguration", targetDepth)) {
                    context.nextToken();
                    service.setHealthCheckConfiguration(HealthCheckConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoScalingConfigurationSummary", targetDepth)) {
                    context.nextToken();
                    service.setAutoScalingConfigurationSummary(AutoScalingConfigurationSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
