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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SnapshotJobResultFileGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJobResultFileGroupJsonUnmarshaller implements Unmarshaller<SnapshotJobResultFileGroup, JsonUnmarshallerContext> {

    public SnapshotJobResultFileGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnapshotJobResultFileGroup snapshotJobResultFileGroup = new SnapshotJobResultFileGroup();

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
                if (context.testExpression("Files", targetDepth)) {
                    context.nextToken();
                    snapshotJobResultFileGroup.setFiles(new ListUnmarshaller<SnapshotFile>(SnapshotFileJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("S3Results", targetDepth)) {
                    context.nextToken();
                    snapshotJobResultFileGroup.setS3Results(new ListUnmarshaller<SnapshotJobS3Result>(SnapshotJobS3ResultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snapshotJobResultFileGroup;
    }

    private static SnapshotJobResultFileGroupJsonUnmarshaller instance;

    public static SnapshotJobResultFileGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotJobResultFileGroupJsonUnmarshaller();
        return instance;
    }
}
