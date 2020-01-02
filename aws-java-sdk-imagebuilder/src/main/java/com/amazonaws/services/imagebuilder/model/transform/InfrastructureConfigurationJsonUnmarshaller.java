/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InfrastructureConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfrastructureConfigurationJsonUnmarshaller implements Unmarshaller<InfrastructureConfiguration, JsonUnmarshallerContext> {

    public InfrastructureConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        InfrastructureConfiguration infrastructureConfiguration = new InfrastructureConfiguration();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceTypes", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("instanceProfileName", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setInstanceProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logging", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setLogging(LoggingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("keyPair", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setKeyPair(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("terminateInstanceOnFailure", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setTerminateInstanceOnFailure(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("snsTopicArn", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateUpdated", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setDateUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    infrastructureConfiguration.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return infrastructureConfiguration;
    }

    private static InfrastructureConfigurationJsonUnmarshaller instance;

    public static InfrastructureConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InfrastructureConfigurationJsonUnmarshaller();
        return instance;
    }
}
