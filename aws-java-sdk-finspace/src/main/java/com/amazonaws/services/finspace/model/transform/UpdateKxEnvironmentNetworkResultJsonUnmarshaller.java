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
 * UpdateKxEnvironmentNetworkResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxEnvironmentNetworkResultJsonUnmarshaller implements Unmarshaller<UpdateKxEnvironmentNetworkResult, JsonUnmarshallerContext> {

    public UpdateKxEnvironmentNetworkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateKxEnvironmentNetworkResult updateKxEnvironmentNetworkResult = new UpdateKxEnvironmentNetworkResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateKxEnvironmentNetworkResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tgwStatus", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setTgwStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsStatus", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setDnsStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dedicatedServiceAccountId", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setDedicatedServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transitGatewayConfiguration", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setTransitGatewayConfiguration(TransitGatewayConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("customDNSConfiguration", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setCustomDNSConfiguration(new ListUnmarshaller<CustomDNSServer>(CustomDNSServerJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTimestamp", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("availabilityZoneIds", targetDepth)) {
                    context.nextToken();
                    updateKxEnvironmentNetworkResult.setAvailabilityZoneIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return updateKxEnvironmentNetworkResult;
    }

    private static UpdateKxEnvironmentNetworkResultJsonUnmarshaller instance;

    public static UpdateKxEnvironmentNetworkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateKxEnvironmentNetworkResultJsonUnmarshaller();
        return instance;
    }
}
