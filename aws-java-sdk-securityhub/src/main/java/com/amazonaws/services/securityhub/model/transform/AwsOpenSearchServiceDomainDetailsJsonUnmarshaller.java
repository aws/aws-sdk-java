/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsOpenSearchServiceDomainDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainDetailsJsonUnmarshaller implements Unmarshaller<AwsOpenSearchServiceDomainDetails, JsonUnmarshallerContext> {

    public AwsOpenSearchServiceDomainDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsOpenSearchServiceDomainDetails awsOpenSearchServiceDomainDetails = new AwsOpenSearchServiceDomainDetails();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setAccessPolicies(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainEndpoint", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setDomainEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setEncryptionAtRestOptions(AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails
                            .setNodeToNodeEncryptionOptions(AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("ServiceSoftwareOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setServiceSoftwareOptions(AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterConfig", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setClusterConfig(AwsOpenSearchServiceDomainClusterConfigDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setDomainEndpointOptions(AwsOpenSearchServiceDomainDomainEndpointOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setVpcOptions(AwsOpenSearchServiceDomainVpcOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setLogPublishingOptions(AwsOpenSearchServiceDomainLogPublishingOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainEndpoints", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setDomainEndpoints(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AdvancedSecurityOptions", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainDetails.setAdvancedSecurityOptions(AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsOpenSearchServiceDomainDetails;
    }

    private static AwsOpenSearchServiceDomainDetailsJsonUnmarshaller instance;

    public static AwsOpenSearchServiceDomainDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsOpenSearchServiceDomainDetailsJsonUnmarshaller();
        return instance;
    }
}
