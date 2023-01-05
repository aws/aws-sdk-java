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
 * AwsElasticsearchDomainElasticsearchClusterConfigDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainElasticsearchClusterConfigDetailsJsonUnmarshaller implements
        Unmarshaller<AwsElasticsearchDomainElasticsearchClusterConfigDetails, JsonUnmarshallerContext> {

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElasticsearchDomainElasticsearchClusterConfigDetails awsElasticsearchDomainElasticsearchClusterConfigDetails = new AwsElasticsearchDomainElasticsearchClusterConfigDetails();

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
                if (context.testExpression("DedicatedMasterCount", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setDedicatedMasterCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DedicatedMasterEnabled", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setDedicatedMasterEnabled(context.getUnmarshaller(Boolean.class)
                            .unmarshall(context));
                }
                if (context.testExpression("DedicatedMasterType", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setDedicatedMasterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZoneAwarenessConfig", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails
                            .setZoneAwarenessConfig(AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("ZoneAwarenessEnabled", targetDepth)) {
                    context.nextToken();
                    awsElasticsearchDomainElasticsearchClusterConfigDetails.setZoneAwarenessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsElasticsearchDomainElasticsearchClusterConfigDetails;
    }

    private static AwsElasticsearchDomainElasticsearchClusterConfigDetailsJsonUnmarshaller instance;

    public static AwsElasticsearchDomainElasticsearchClusterConfigDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElasticsearchDomainElasticsearchClusterConfigDetailsJsonUnmarshaller();
        return instance;
    }
}
