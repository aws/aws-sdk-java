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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdatePatchBaselineResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePatchBaselineResultJsonUnmarshaller implements Unmarshaller<UpdatePatchBaselineResult, JsonUnmarshallerContext> {

    public UpdatePatchBaselineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePatchBaselineResult updatePatchBaselineResult = new UpdatePatchBaselineResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updatePatchBaselineResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BaselineId", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setBaselineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperatingSystem", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalFilters", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setGlobalFilters(PatchFilterGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovalRules", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setApprovalRules(PatchRuleGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovedPatches", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setApprovedPatches(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ApprovedPatchesComplianceLevel", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setApprovedPatchesComplianceLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApprovedPatchesEnableNonSecurity", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setApprovedPatchesEnableNonSecurity(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RejectedPatches", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setRejectedPatches(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RejectedPatchesAction", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setRejectedPatchesAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedDate", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sources", targetDepth)) {
                    context.nextToken();
                    updatePatchBaselineResult.setSources(new ListUnmarshaller<PatchSource>(PatchSourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updatePatchBaselineResult;
    }

    private static UpdatePatchBaselineResultJsonUnmarshaller instance;

    public static UpdatePatchBaselineResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePatchBaselineResultJsonUnmarshaller();
        return instance;
    }
}
