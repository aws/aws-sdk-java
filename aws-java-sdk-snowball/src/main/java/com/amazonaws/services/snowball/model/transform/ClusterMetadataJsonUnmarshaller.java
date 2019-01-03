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
package com.amazonaws.services.snowball.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterMetadataJsonUnmarshaller implements Unmarshaller<ClusterMetadata, JsonUnmarshallerContext> {

    public ClusterMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterMetadata clusterMetadata = new ClusterMetadata();

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
                if (context.testExpression("ClusterId", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyARN", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setKmsKeyARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterState", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setClusterState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowballType", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setSnowballType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setResources(JobResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AddressId", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setAddressId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShippingOption", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setShippingOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notification", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setNotification(NotificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ForwardingAddressId", targetDepth)) {
                    context.nextToken();
                    clusterMetadata.setForwardingAddressId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterMetadata;
    }

    private static ClusterMetadataJsonUnmarshaller instance;

    public static ClusterMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterMetadataJsonUnmarshaller();
        return instance;
    }
}
