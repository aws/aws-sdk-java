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
package com.amazonaws.services.voiceid.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FraudsterRegistrationJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FraudsterRegistrationJobJsonUnmarshaller implements Unmarshaller<FraudsterRegistrationJob, JsonUnmarshallerContext> {

    public FraudsterRegistrationJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        FraudsterRegistrationJob fraudsterRegistrationJob = new FraudsterRegistrationJob();

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
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndedAt", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setEndedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setFailureDetails(FailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobProgress", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setJobProgress(JobProgressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegistrationConfig", targetDepth)) {
                    context.nextToken();
                    fraudsterRegistrationJob.setRegistrationConfig(RegistrationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fraudsterRegistrationJob;
    }

    private static FraudsterRegistrationJobJsonUnmarshaller instance;

    public static FraudsterRegistrationJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FraudsterRegistrationJobJsonUnmarshaller();
        return instance;
    }
}
