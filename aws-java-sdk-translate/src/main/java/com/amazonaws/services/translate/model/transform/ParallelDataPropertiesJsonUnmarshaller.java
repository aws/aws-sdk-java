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
package com.amazonaws.services.translate.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParallelDataProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelDataPropertiesJsonUnmarshaller implements Unmarshaller<ParallelDataProperties, JsonUnmarshallerContext> {

    public ParallelDataProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParallelDataProperties parallelDataProperties = new ParallelDataProperties();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLanguageCode", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setSourceLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLanguageCodes", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setTargetLanguageCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ParallelDataConfig", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setParallelDataConfig(ParallelDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportedDataSize", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setImportedDataSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ImportedRecordCount", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setImportedRecordCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailedRecordCount", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setFailedRecordCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SkippedRecordCount", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setSkippedRecordCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKey", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setEncryptionKey(EncryptionKeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestUpdateAttemptStatus", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setLatestUpdateAttemptStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestUpdateAttemptAt", targetDepth)) {
                    context.nextToken();
                    parallelDataProperties.setLatestUpdateAttemptAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parallelDataProperties;
    }

    private static ParallelDataPropertiesJsonUnmarshaller instance;

    public static ParallelDataPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParallelDataPropertiesJsonUnmarshaller();
        return instance;
    }
}
