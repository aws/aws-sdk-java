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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetReadSetMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetMetadataResultJsonUnmarshaller implements Unmarshaller<GetReadSetMetadataResult, JsonUnmarshallerContext> {

    public GetReadSetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetReadSetMetadataResult getReadSetMetadataResult = new GetReadSetMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getReadSetMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileType", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setFileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("files", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setFiles(ReadSetFilesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceArn", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setReferenceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleId", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setSampleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sequenceInformation", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setSequenceInformation(SequenceInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sequenceStoreId", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setSequenceStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    context.nextToken();
                    getReadSetMetadataResult.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getReadSetMetadataResult;
    }

    private static GetReadSetMetadataResultJsonUnmarshaller instance;

    public static GetReadSetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReadSetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
