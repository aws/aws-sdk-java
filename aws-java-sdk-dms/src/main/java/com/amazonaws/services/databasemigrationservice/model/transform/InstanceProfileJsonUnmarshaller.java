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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceProfileJsonUnmarshaller implements Unmarshaller<InstanceProfile, JsonUnmarshallerContext> {

    public InstanceProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceProfile instanceProfile = new InstanceProfile();

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
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NetworkType", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setNetworkType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileName", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setInstanceProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileCreationTime", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setInstanceProfileCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("SubnetGroupIdentifier", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setSubnetGroupIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    instanceProfile.setVpcSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return instanceProfile;
    }

    private static InstanceProfileJsonUnmarshaller instance;

    public static InstanceProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceProfileJsonUnmarshaller();
        return instance;
    }
}
