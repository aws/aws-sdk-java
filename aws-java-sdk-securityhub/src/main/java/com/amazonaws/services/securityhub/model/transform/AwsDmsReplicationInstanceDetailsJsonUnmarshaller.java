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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsDmsReplicationInstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsReplicationInstanceDetailsJsonUnmarshaller implements Unmarshaller<AwsDmsReplicationInstanceDetails, JsonUnmarshallerContext> {

    public AwsDmsReplicationInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsDmsReplicationInstanceDetails awsDmsReplicationInstanceDetails = new AwsDmsReplicationInstanceDetails();

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
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setMultiAZ(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceClass", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setReplicationInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setReplicationInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationSubnetGroup", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setReplicationSubnetGroup(AwsDmsReplicationInstanceReplicationSubnetGroupDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsDmsReplicationInstanceDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsDmsReplicationInstanceVpcSecurityGroupsDetails>(
                            AwsDmsReplicationInstanceVpcSecurityGroupsDetailsJsonUnmarshaller.getInstance())

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

        return awsDmsReplicationInstanceDetails;
    }

    private static AwsDmsReplicationInstanceDetailsJsonUnmarshaller instance;

    public static AwsDmsReplicationInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsDmsReplicationInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
