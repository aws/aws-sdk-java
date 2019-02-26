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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InitiateJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateJobResultJsonUnmarshaller implements Unmarshaller<InitiateJobResult, JsonUnmarshallerContext> {

    public InitiateJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InitiateJobResult initiateJobResult = new InitiateJobResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Location") != null) {
                context.setCurrentHeader("Location");
                initiateJobResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-job-id") != null) {
                context.setCurrentHeader("x-amz-job-id");
                initiateJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-job-output-path") != null) {
                context.setCurrentHeader("x-amz-job-output-path");
                initiateJobResult.setJobOutputPath(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return initiateJobResult;
    }

    private static InitiateJobResultJsonUnmarshaller instance;

    public static InitiateJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InitiateJobResultJsonUnmarshaller();
        return instance;
    }
}
