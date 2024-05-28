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
 * KxEnvironment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxEnvironmentJsonUnmarshaller implements Unmarshaller<KxEnvironment, JsonUnmarshallerContext> {

    public KxEnvironment unmarshall(JsonUnmarshallerContext context) throws Exception {
        KxEnvironment kxEnvironment = new KxEnvironment();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tgwStatus", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setTgwStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsStatus", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setDnsStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dedicatedServiceAccountId", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setDedicatedServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transitGatewayConfiguration", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setTransitGatewayConfiguration(TransitGatewayConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customDNSConfiguration", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setCustomDNSConfiguration(new ListUnmarshaller<CustomDNSServer>(CustomDNSServerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTimestamp", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("availabilityZoneIds", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setAvailabilityZoneIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("certificateAuthorityArn", targetDepth)) {
                    context.nextToken();
                    kxEnvironment.setCertificateAuthorityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kxEnvironment;
    }

    private static KxEnvironmentJsonUnmarshaller instance;

    public static KxEnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KxEnvironmentJsonUnmarshaller();
        return instance;
    }
}
