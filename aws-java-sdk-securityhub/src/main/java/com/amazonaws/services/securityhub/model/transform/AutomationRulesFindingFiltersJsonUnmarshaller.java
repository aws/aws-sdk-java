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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomationRulesFindingFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesFindingFiltersJsonUnmarshaller implements Unmarshaller<AutomationRulesFindingFilters, JsonUnmarshallerContext> {

    public AutomationRulesFindingFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationRulesFindingFilters automationRulesFindingFilters = new AutomationRulesFindingFilters();

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
                if (context.testExpression("ProductArn", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setAwsAccountId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GeneratorId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setGeneratorId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FirstObservedAt", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setFirstObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastObservedAt", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setConfidence(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Criticality", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setCriticality(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setTitle(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setDescription(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setProductName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setCompanyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SeverityLabel", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setSeverityLabel(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourcePartition", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourcePartition(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceRegion", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceRegion(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceDetailsOther", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceDetailsOther(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceStatus", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceSecurityControlId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceSecurityControlId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceAssociatedStandardsId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceAssociatedStandardsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VerificationState", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setVerificationState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WorkflowStatus", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setWorkflowStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecordState", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setRecordState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsProductArn", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsId", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setRelatedFindingsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteText", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setNoteText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedAt", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setNoteUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedBy", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setNoteUpdatedBy(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserDefinedFields", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setUserDefinedFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceApplicationArn", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceApplicationArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceApplicationName", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setResourceApplicationName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AwsAccountName", targetDepth)) {
                    context.nextToken();
                    automationRulesFindingFilters.setAwsAccountName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

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

        return automationRulesFindingFilters;
    }

    private static AutomationRulesFindingFiltersJsonUnmarshaller instance;

    public static AutomationRulesFindingFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationRulesFindingFiltersJsonUnmarshaller();
        return instance;
    }
}
