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
 * StartReadSetImportJobSourceItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReadSetImportJobSourceItemJsonUnmarshaller implements Unmarshaller<StartReadSetImportJobSourceItem, JsonUnmarshallerContext> {

    public StartReadSetImportJobSourceItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartReadSetImportJobSourceItem startReadSetImportJobSourceItem = new StartReadSetImportJobSourceItem();

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
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("generatedFrom", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setGeneratedFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceArn", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setReferenceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleId", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setSampleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceFileType", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setSourceFileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceFiles", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setSourceFiles(SourceFilesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    startReadSetImportJobSourceItem.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startReadSetImportJobSourceItem;
    }

    private static StartReadSetImportJobSourceItemJsonUnmarshaller instance;

    public static StartReadSetImportJobSourceItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartReadSetImportJobSourceItemJsonUnmarshaller();
        return instance;
    }
}
