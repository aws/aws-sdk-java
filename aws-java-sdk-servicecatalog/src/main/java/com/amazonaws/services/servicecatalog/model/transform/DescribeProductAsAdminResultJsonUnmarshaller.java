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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProductAsAdminResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductAsAdminResultJsonUnmarshaller implements Unmarshaller<DescribeProductAsAdminResult, JsonUnmarshallerContext> {

    public DescribeProductAsAdminResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProductAsAdminResult describeProductAsAdminResult = new DescribeProductAsAdminResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProductAsAdminResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProductViewDetail", targetDepth)) {
                    context.nextToken();
                    describeProductAsAdminResult.setProductViewDetail(ProductViewDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactSummaries", targetDepth)) {
                    context.nextToken();
                    describeProductAsAdminResult.setProvisioningArtifactSummaries(new ListUnmarshaller<ProvisioningArtifactSummary>(
                            ProvisioningArtifactSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeProductAsAdminResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TagOptions", targetDepth)) {
                    context.nextToken();
                    describeProductAsAdminResult.setTagOptions(new ListUnmarshaller<TagOptionDetail>(TagOptionDetailJsonUnmarshaller.getInstance())
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

        return describeProductAsAdminResult;
    }

    private static DescribeProductAsAdminResultJsonUnmarshaller instance;

    public static DescribeProductAsAdminResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProductAsAdminResultJsonUnmarshaller();
        return instance;
    }
}
