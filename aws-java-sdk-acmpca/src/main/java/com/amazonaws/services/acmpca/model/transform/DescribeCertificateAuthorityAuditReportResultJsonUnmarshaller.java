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
package com.amazonaws.services.acmpca.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCertificateAuthorityAuditReportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateAuthorityAuditReportResultJsonUnmarshaller implements
        Unmarshaller<DescribeCertificateAuthorityAuditReportResult, JsonUnmarshallerContext> {

    public DescribeCertificateAuthorityAuditReportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCertificateAuthorityAuditReportResult describeCertificateAuthorityAuditReportResult = new DescribeCertificateAuthorityAuditReportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCertificateAuthorityAuditReportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AuditReportStatus", targetDepth)) {
                    context.nextToken();
                    describeCertificateAuthorityAuditReportResult.setAuditReportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    context.nextToken();
                    describeCertificateAuthorityAuditReportResult.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Key", targetDepth)) {
                    context.nextToken();
                    describeCertificateAuthorityAuditReportResult.setS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeCertificateAuthorityAuditReportResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCertificateAuthorityAuditReportResult;
    }

    private static DescribeCertificateAuthorityAuditReportResultJsonUnmarshaller instance;

    public static DescribeCertificateAuthorityAuditReportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCertificateAuthorityAuditReportResultJsonUnmarshaller();
        return instance;
    }
}
