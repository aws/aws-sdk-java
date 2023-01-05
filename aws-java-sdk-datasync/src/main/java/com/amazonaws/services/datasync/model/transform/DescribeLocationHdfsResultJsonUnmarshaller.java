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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeLocationHdfsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationHdfsResultJsonUnmarshaller implements Unmarshaller<DescribeLocationHdfsResult, JsonUnmarshallerContext> {

    public DescribeLocationHdfsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLocationHdfsResult describeLocationHdfsResult = new DescribeLocationHdfsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLocationHdfsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LocationArn", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NameNodes", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setNameNodes(new ListUnmarshaller<HdfsNameNode>(HdfsNameNodeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BlockSize", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setBlockSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationFactor", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setReplicationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyProviderUri", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setKmsKeyProviderUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QopConfiguration", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setQopConfiguration(QopConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AuthenticationType", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setAuthenticationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SimpleUser", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setSimpleUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KerberosPrincipal", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setKerberosPrincipal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentArns", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setAgentArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeLocationHdfsResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeLocationHdfsResult;
    }

    private static DescribeLocationHdfsResultJsonUnmarshaller instance;

    public static DescribeLocationHdfsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLocationHdfsResultJsonUnmarshaller();
        return instance;
    }
}
