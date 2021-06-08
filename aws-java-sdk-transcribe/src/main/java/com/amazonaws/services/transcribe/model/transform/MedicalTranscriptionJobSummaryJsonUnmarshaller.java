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
package com.amazonaws.services.transcribe.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MedicalTranscriptionJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJobSummaryJsonUnmarshaller implements Unmarshaller<MedicalTranscriptionJobSummary, JsonUnmarshallerContext> {

    public MedicalTranscriptionJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MedicalTranscriptionJobSummary medicalTranscriptionJobSummary = new MedicalTranscriptionJobSummary();

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
                if (context.testExpression("MedicalTranscriptionJobName", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setMedicalTranscriptionJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TranscriptionJobStatus", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setTranscriptionJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputLocationType", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setOutputLocationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Specialty", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setSpecialty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentIdentificationType", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setContentIdentificationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    medicalTranscriptionJobSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return medicalTranscriptionJobSummary;
    }

    private static MedicalTranscriptionJobSummaryJsonUnmarshaller instance;

    public static MedicalTranscriptionJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobSummaryJsonUnmarshaller();
        return instance;
    }
}
