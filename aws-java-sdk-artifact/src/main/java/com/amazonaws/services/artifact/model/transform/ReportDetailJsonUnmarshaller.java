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
package com.amazonaws.services.artifact.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.artifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDetailJsonUnmarshaller implements Unmarshaller<ReportDetail, JsonUnmarshallerContext> {

    public ReportDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportDetail reportDetail = new ReportDetail();

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
                if (context.testExpression("acceptanceType", targetDepth)) {
                    context.nextToken();
                    reportDetail.setAcceptanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    reportDetail.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    reportDetail.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("companyName", targetDepth)) {
                    context.nextToken();
                    reportDetail.setCompanyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    reportDetail.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deletedAt", targetDepth)) {
                    context.nextToken();
                    reportDetail.setDeletedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    reportDetail.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    reportDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    context.nextToken();
                    reportDetail.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    reportDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("periodEnd", targetDepth)) {
                    context.nextToken();
                    reportDetail.setPeriodEnd(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("periodStart", targetDepth)) {
                    context.nextToken();
                    reportDetail.setPeriodStart(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("productName", targetDepth)) {
                    context.nextToken();
                    reportDetail.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sequenceNumber", targetDepth)) {
                    context.nextToken();
                    reportDetail.setSequenceNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("series", targetDepth)) {
                    context.nextToken();
                    reportDetail.setSeries(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    reportDetail.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    reportDetail.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("termArn", targetDepth)) {
                    context.nextToken();
                    reportDetail.setTermArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadState", targetDepth)) {
                    context.nextToken();
                    reportDetail.setUploadState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    reportDetail.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reportDetail;
    }

    private static ReportDetailJsonUnmarshaller instance;

    public static ReportDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportDetailJsonUnmarshaller();
        return instance;
    }
}
