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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Job JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    job.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    job.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineId", targetDepth)) {
                    context.nextToken();
                    job.setPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    context.nextToken();
                    job.setInput(JobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    job.setInputs(new ListUnmarshaller<JobInput>(JobInputJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    context.nextToken();
                    job.setOutput(JobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    context.nextToken();
                    job.setOutputs(new ListUnmarshaller<JobOutput>(JobOutputJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OutputKeyPrefix", targetDepth)) {
                    context.nextToken();
                    job.setOutputKeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Playlists", targetDepth)) {
                    context.nextToken();
                    job.setPlaylists(new ListUnmarshaller<Playlist>(PlaylistJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    job.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserMetadata", targetDepth)) {
                    context.nextToken();
                    job.setUserMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Timing", targetDepth)) {
                    context.nextToken();
                    job.setTiming(TimingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
