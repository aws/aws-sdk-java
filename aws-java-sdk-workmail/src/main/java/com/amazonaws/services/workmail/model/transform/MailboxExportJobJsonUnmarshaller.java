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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MailboxExportJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MailboxExportJobJsonUnmarshaller implements Unmarshaller<MailboxExportJob, JsonUnmarshallerContext> {

    public MailboxExportJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        MailboxExportJob mailboxExportJob = new MailboxExportJob();

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
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityId", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Path", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedProgress", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setEstimatedProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    mailboxExportJob.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mailboxExportJob;
    }

    private static MailboxExportJobJsonUnmarshaller instance;

    public static MailboxExportJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MailboxExportJobJsonUnmarshaller();
        return instance;
    }
}
