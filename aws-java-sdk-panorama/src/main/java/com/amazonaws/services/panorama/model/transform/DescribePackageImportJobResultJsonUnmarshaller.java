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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePackageImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageImportJobResultJsonUnmarshaller implements Unmarshaller<DescribePackageImportJobResult, JsonUnmarshallerContext> {

    public DescribePackageImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePackageImportJobResult describePackageImportJobResult = new DescribePackageImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePackageImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ClientToken", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setInputConfig(PackageImportJobInputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobTags", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setJobTags(new ListUnmarshaller<JobResourceTags>(JobResourceTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setOutput(PackageImportJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setOutputConfig(PackageImportJobOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    describePackageImportJobResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePackageImportJobResult;
    }

    private static DescribePackageImportJobResultJsonUnmarshaller instance;

    public static DescribePackageImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePackageImportJobResultJsonUnmarshaller();
        return instance;
    }
}
