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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MediaAnalysisJobDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisJobDescriptionJsonUnmarshaller implements Unmarshaller<MediaAnalysisJobDescription, JsonUnmarshallerContext> {

    public MediaAnalysisJobDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaAnalysisJobDescription mediaAnalysisJobDescription = new MediaAnalysisJobDescription();

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
                    mediaAnalysisJobDescription.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperationsConfig", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setOperationsConfig(MediaAnalysisOperationsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setFailureDetails(MediaAnalysisJobFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setCompletionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setInput(MediaAnalysisInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setOutputConfig(MediaAnalysisOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Results", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setResults(MediaAnalysisResultsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManifestSummary", targetDepth)) {
                    context.nextToken();
                    mediaAnalysisJobDescription.setManifestSummary(MediaAnalysisManifestSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mediaAnalysisJobDescription;
    }

    private static MediaAnalysisJobDescriptionJsonUnmarshaller instance;

    public static MediaAnalysisJobDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaAnalysisJobDescriptionJsonUnmarshaller();
        return instance;
    }
}
