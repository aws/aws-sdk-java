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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubjectNameFlagsV3 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectNameFlagsV3JsonUnmarshaller implements Unmarshaller<SubjectNameFlagsV3, JsonUnmarshallerContext> {

    public SubjectNameFlagsV3 unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubjectNameFlagsV3 subjectNameFlagsV3 = new SubjectNameFlagsV3();

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
                if (context.testExpression("RequireCommonName", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setRequireCommonName(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireDirectoryPath", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setRequireDirectoryPath(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireDnsAsCn", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setRequireDnsAsCn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireEmail", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setRequireEmail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDirectoryGuid", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireDirectoryGuid(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDns", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireDns(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDomainDns", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireDomainDns(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireEmail", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireEmail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireSpn", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireSpn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireUpn", targetDepth)) {
                    context.nextToken();
                    subjectNameFlagsV3.setSanRequireUpn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subjectNameFlagsV3;
    }

    private static SubjectNameFlagsV3JsonUnmarshaller instance;

    public static SubjectNameFlagsV3JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubjectNameFlagsV3JsonUnmarshaller();
        return instance;
    }
}
