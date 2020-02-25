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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsElasticsearchDomainDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainDetailsJsonUnmarshaller implements Unmarshaller<AwsElasticsearchDomainDetails, JsonUnmarshallerContext> {

    public AwsElasticsearchDomainDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElasticsearchDomainDetails awsElasticsearchDomainDetails = new AwsElasticsearchDomainDetails();

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
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setAccessPolicies(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setDomainEndpointOptions(AwsElasticsearchDomainDomainEndpointOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoints", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setEndpoints(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ElasticsearchVersion", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setElasticsearchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setEncryptionAtRestOptions(AwsElasticsearchDomainEncryptionAtRestOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setNodeToNodeEncryptionOptions(AwsElasticsearchDomainNodeToNodeEncryptionOptionsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("VPCOptions", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainDetails.setVPCOptions(AwsElasticsearchDomainVPCOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsElasticsearchDomainDetails;
    }

    private static AwsElasticsearchDomainDetailsJsonUnmarshaller instance;

    public static AwsElasticsearchDomainDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElasticsearchDomainDetailsJsonUnmarshaller();
        return instance;
    }
}
