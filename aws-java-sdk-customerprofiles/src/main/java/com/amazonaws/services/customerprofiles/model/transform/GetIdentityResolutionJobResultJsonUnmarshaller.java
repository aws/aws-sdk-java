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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetIdentityResolutionJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityResolutionJobResultJsonUnmarshaller implements Unmarshaller<GetIdentityResolutionJobResult, JsonUnmarshallerContext> {

    public GetIdentityResolutionJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIdentityResolutionJobResult getIdentityResolutionJobResult = new GetIdentityResolutionJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIdentityResolutionJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStartTime", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setJobStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobEndTime", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setJobEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobExpirationTime", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setJobExpirationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AutoMerging", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setAutoMerging(AutoMergingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportingLocation", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setExportingLocation(ExportingLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStats", targetDepth)) {
                    context.nextToken();
                    getIdentityResolutionJobResult.setJobStats(JobStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getIdentityResolutionJobResult;
    }

    private static GetIdentityResolutionJobResultJsonUnmarshaller instance;

    public static GetIdentityResolutionJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityResolutionJobResultJsonUnmarshaller();
        return instance;
    }
}
