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
 * IdentityResolutionJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityResolutionJobJsonUnmarshaller implements Unmarshaller<IdentityResolutionJob, JsonUnmarshallerContext> {

    public IdentityResolutionJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        IdentityResolutionJob identityResolutionJob = new IdentityResolutionJob();

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
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStartTime", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setJobStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobEndTime", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setJobEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobStats", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setJobStats(JobStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportingLocation", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setExportingLocation(ExportingLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    identityResolutionJob.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return identityResolutionJob;
    }

    private static IdentityResolutionJobJsonUnmarshaller instance;

    public static IdentityResolutionJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IdentityResolutionJobJsonUnmarshaller();
        return instance;
    }
}
