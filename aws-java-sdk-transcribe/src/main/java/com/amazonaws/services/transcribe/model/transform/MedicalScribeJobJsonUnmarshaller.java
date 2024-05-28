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
package com.amazonaws.services.transcribe.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MedicalScribeJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalScribeJobJsonUnmarshaller implements Unmarshaller<MedicalScribeJob, JsonUnmarshallerContext> {

    public MedicalScribeJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        MedicalScribeJob medicalScribeJob = new MedicalScribeJob();

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
                if (context.testExpression("MedicalScribeJobName", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setMedicalScribeJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MedicalScribeJobStatus", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setMedicalScribeJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Media", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setMedia(MediaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MedicalScribeOutput", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setMedicalScribeOutput(MedicalScribeOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setSettings(MedicalScribeSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelDefinitions", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setChannelDefinitions(new ListUnmarshaller<MedicalScribeChannelDefinition>(MedicalScribeChannelDefinitionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    medicalScribeJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return medicalScribeJob;
    }

    private static MedicalScribeJobJsonUnmarshaller instance;

    public static MedicalScribeJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalScribeJobJsonUnmarshaller();
        return instance;
    }
}
