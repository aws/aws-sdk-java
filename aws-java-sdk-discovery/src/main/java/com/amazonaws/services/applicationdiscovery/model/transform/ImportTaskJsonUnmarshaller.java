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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTaskJsonUnmarshaller implements Unmarshaller<ImportTask, JsonUnmarshallerContext> {

    public ImportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportTask importTask = new ImportTask();

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
                if (context.testExpression("importTaskId", targetDepth)) {
                    context.nextToken();
                    importTask.setImportTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    importTask.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    importTask.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importUrl", targetDepth)) {
                    context.nextToken();
                    importTask.setImportUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    importTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importRequestTime", targetDepth)) {
                    context.nextToken();
                    importTask.setImportRequestTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("importCompletionTime", targetDepth)) {
                    context.nextToken();
                    importTask.setImportCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("importDeletedTime", targetDepth)) {
                    context.nextToken();
                    importTask.setImportDeletedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("serverImportSuccess", targetDepth)) {
                    context.nextToken();
                    importTask.setServerImportSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("serverImportFailure", targetDepth)) {
                    context.nextToken();
                    importTask.setServerImportFailure(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("applicationImportSuccess", targetDepth)) {
                    context.nextToken();
                    importTask.setApplicationImportSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("applicationImportFailure", targetDepth)) {
                    context.nextToken();
                    importTask.setApplicationImportFailure(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("errorsAndFailedEntriesZip", targetDepth)) {
                    context.nextToken();
                    importTask.setErrorsAndFailedEntriesZip(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importTask;
    }

    private static ImportTaskJsonUnmarshaller instance;

    public static ImportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportTaskJsonUnmarshaller();
        return instance;
    }
}
