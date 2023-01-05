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
 * ReadSetListItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadSetListItemJsonUnmarshaller implements Unmarshaller<ReadSetListItem, JsonUnmarshallerContext> {

    public ReadSetListItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReadSetListItem readSetListItem = new ReadSetListItem();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileType", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setFileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceArn", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setReferenceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleId", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setSampleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sequenceInformation", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setSequenceInformation(SequenceInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sequenceStoreId", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setSequenceStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    context.nextToken();
                    readSetListItem.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return readSetListItem;
    }

    private static ReadSetListItemJsonUnmarshaller instance;

    public static ReadSetListItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReadSetListItemJsonUnmarshaller();
        return instance;
    }
}
