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
 * AwsSageMakerNotebookInstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller implements Unmarshaller<AwsSageMakerNotebookInstanceDetails, JsonUnmarshallerContext> {

    public AwsSageMakerNotebookInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSageMakerNotebookInstanceDetails awsSageMakerNotebookInstanceDetails = new AwsSageMakerNotebookInstanceDetails();

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
                if (context.testExpression("AcceleratorTypes", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setAcceleratorTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalCodeRepositories", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setAdditionalCodeRepositories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultCodeRepository", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setDefaultCodeRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectInternetAccess", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setDirectInternetAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceMetadataServiceConfiguration", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails
                            .setInstanceMetadataServiceConfiguration(AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetailsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceArn", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceLifecycleConfigName", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceLifecycleConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceName", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceStatus", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformIdentifier", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setPlatformIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootAccess", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setRootAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInGB", targetDepth)) {
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setVolumeSizeInGB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsSageMakerNotebookInstanceDetails;
    }

    private static AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller instance;

    public static AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
