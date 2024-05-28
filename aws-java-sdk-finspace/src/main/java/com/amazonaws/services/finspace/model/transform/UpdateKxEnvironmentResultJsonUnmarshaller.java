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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateKxEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxEnvironmentResultJsonUnmarshaller implements Unmarshaller<UpdateKxEnvironmentResult, JsonUnmarshallerContext> {

    public UpdateKxEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateKxEnvironmentResult updateKxEnvironmentResult = new UpdateKxEnvironmentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateKxEnvironmentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tgwStatus", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setTgwStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsStatus", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setDnsStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dedicatedServiceAccountId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setDedicatedServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transitGatewayConfiguration", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setTransitGatewayConfiguration(TransitGatewayConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customDNSConfiguration", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setCustomDNSConfiguration(new ListUnmarshaller<CustomDNSServer>(CustomDNSServerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTimestamp", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("availabilityZoneIds", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentResult.setAvailabilityZoneIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return updateKxEnvironmentResult;
    }

    private static UpdateKxEnvironmentResultJsonUnmarshaller instance;

    public static UpdateKxEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateKxEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
