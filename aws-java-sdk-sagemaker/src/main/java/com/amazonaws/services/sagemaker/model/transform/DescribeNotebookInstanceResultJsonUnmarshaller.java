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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeNotebookInstanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotebookInstanceResultJsonUnmarshaller implements Unmarshaller<DescribeNotebookInstanceResult, JsonUnmarshallerContext> {

    public DescribeNotebookInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeNotebookInstanceResult describeNotebookInstanceResult = new DescribeNotebookInstanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeNotebookInstanceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NotebookInstanceArn", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setNotebookInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceName", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setNotebookInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceStatus", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setNotebookInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceLifecycleConfigName", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setNotebookInstanceLifecycleConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectInternetAccess", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setDirectInternetAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInGB", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setVolumeSizeInGB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AcceleratorTypes", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setAcceleratorTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DefaultCodeRepository", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setDefaultCodeRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalCodeRepositories", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setAdditionalCodeRepositories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("RootAccess", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceResult.setRootAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeNotebookInstanceResult;
    }

    private static DescribeNotebookInstanceResultJsonUnmarshaller instance;

    public static DescribeNotebookInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNotebookInstanceResultJsonUnmarshaller();
        return instance;
    }
}
