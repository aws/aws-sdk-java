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
 * AwsRdsDbSnapshotDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSnapshotDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbSnapshotDetails, JsonUnmarshallerContext> {

    public AwsRdsDbSnapshotDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbSnapshotDetails awsRdsDbSnapshotDetails = new AwsRdsDbSnapshotDetails();

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
                if (context.testExpression("DbSnapshotIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSnapshotCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setInstanceCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSnapshotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OptionGroupName", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setOptionGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setPercentProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SourceRegion", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSourceRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceDbSnapshotIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSourceDbSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setTdeCredentialArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setProcessorFeatures(new ListUnmarshaller<AwsRdsDbProcessorFeature>(AwsRdsDbProcessorFeatureJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbiResourceId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbiResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsDbSnapshotDetails;
    }

    private static AwsRdsDbSnapshotDetailsJsonUnmarshaller instance;

    public static AwsRdsDbSnapshotDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbSnapshotDetailsJsonUnmarshaller();
        return instance;
    }
}
