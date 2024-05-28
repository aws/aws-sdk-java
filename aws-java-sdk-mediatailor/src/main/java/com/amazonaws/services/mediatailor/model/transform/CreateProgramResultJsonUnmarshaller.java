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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateProgramResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProgramResultJsonUnmarshaller implements Unmarshaller<CreateProgramResult, JsonUnmarshallerContext> {

    public CreateProgramResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateProgramResult createProgramResult = new CreateProgramResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createProgramResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AdBreaks", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setAdBreaks(new ListUnmarshaller<AdBreak>(AdBreakJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AudienceMedia", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setAudienceMedia(new ListUnmarshaller<AudienceMedia>(AudienceMediaJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClipRange", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setClipRange(ClipRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DurationMillis", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setDurationMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LiveSourceName", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setLiveSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgramName", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setProgramName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledStartTime", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setScheduledStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SourceLocationName", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setSourceLocationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VodSourceName", targetDepth)) {
                    context.nextToken();
                    createProgramResult.setVodSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createProgramResult;
    }

    private static CreateProgramResultJsonUnmarshaller instance;

    public static CreateProgramResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateProgramResultJsonUnmarshaller();
        return instance;
    }
}
