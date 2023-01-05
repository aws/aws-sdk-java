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
 * AwsCloudFrontDistributionViewerCertificate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionViewerCertificateJsonUnmarshaller implements
        Unmarshaller<AwsCloudFrontDistributionViewerCertificate, JsonUnmarshallerContext> {

    public AwsCloudFrontDistributionViewerCertificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCloudFrontDistributionViewerCertificate awsCloudFrontDistributionViewerCertificate = new AwsCloudFrontDistributionViewerCertificate();

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
                if (context.testExpression("AcmCertificateArn", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setAcmCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificate", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateSource", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setCertificateSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudFrontDefaultCertificate", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setCloudFrontDefaultCertificate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IamCertificateId", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setIamCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinimumProtocolVersion", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setMinimumProtocolVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslSupportMethod", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionViewerCertificate.setSslSupportMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsCloudFrontDistributionViewerCertificate;
    }

    private static AwsCloudFrontDistributionViewerCertificateJsonUnmarshaller instance;

    public static AwsCloudFrontDistributionViewerCertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionViewerCertificateJsonUnmarshaller();
        return instance;
    }
}
