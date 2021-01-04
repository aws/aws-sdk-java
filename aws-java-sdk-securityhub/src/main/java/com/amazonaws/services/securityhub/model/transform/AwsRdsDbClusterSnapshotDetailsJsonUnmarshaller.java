/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsRdsDbClusterSnapshotDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbClusterSnapshotDetails, JsonUnmarshallerContext> {

    public AwsRdsDbClusterSnapshotDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshotDetails = new AwsRdsDbClusterSnapshotDetails();

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
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setSnapshotCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setSnapshotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setPercentProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setStorageEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setDbClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterSnapshotIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setDbClusterSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsDbClusterSnapshotDetails;
    }

    private static AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller instance;

    public static AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller();
        return instance;
    }
}
