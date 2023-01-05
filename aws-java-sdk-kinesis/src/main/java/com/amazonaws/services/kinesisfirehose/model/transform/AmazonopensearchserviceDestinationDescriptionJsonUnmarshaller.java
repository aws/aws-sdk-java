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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AmazonopensearchserviceDestinationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceDestinationDescriptionJsonUnmarshaller implements
        Unmarshaller<AmazonopensearchserviceDestinationDescription, JsonUnmarshallerContext> {

    public AmazonopensearchserviceDestinationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonopensearchserviceDestinationDescription amazonopensearchserviceDestinationDescription = new AmazonopensearchserviceDestinationDescription();

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
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainARN", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setDomainARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterEndpoint", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setClusterEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexName", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexRotationPeriod", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setIndexRotationPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setBufferingHints(AmazonopensearchserviceBufferingHintsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setRetryOptions(AmazonopensearchserviceRetryOptionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3DestinationDescription", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setS3DestinationDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("VpcConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    amazonopensearchserviceDestinationDescription.setVpcConfigurationDescription(VpcConfigurationDescriptionJsonUnmarshaller.getInstance()
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

        return amazonopensearchserviceDestinationDescription;
    }

    private static AmazonopensearchserviceDestinationDescriptionJsonUnmarshaller instance;

    public static AmazonopensearchserviceDestinationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonopensearchserviceDestinationDescriptionJsonUnmarshaller();
        return instance;
    }
}
