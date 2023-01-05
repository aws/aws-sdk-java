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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ArchiveWaveResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveWaveResultJsonUnmarshaller implements Unmarshaller<ArchiveWaveResult, JsonUnmarshallerContext> {

    public ArchiveWaveResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ArchiveWaveResult archiveWaveResult = new ArchiveWaveResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return archiveWaveResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArchived", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDateTime", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setLastModifiedDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("waveAggregatedStatus", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setWaveAggregatedStatus(WaveAggregatedStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("waveID", targetDepth)) {
                    context.nextToken();
                    archiveWaveResult.setWaveID(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return archiveWaveResult;
    }

    private static ArchiveWaveResultJsonUnmarshaller instance;

    public static ArchiveWaveResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ArchiveWaveResultJsonUnmarshaller();
        return instance;
    }
}
