/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonInspector}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonInspector implements AmazonInspector {

    protected AbstractAmazonInspector() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddAttributesToFindingsResult addAttributesToFindings(AddAttributesToFindingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateAssessmentTargetResult createAssessmentTarget(CreateAssessmentTargetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateAssessmentTemplateResult createAssessmentTemplate(CreateAssessmentTemplateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateExclusionsPreviewResult createExclusionsPreview(CreateExclusionsPreviewRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateResourceGroupResult createResourceGroup(CreateResourceGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAssessmentRunResult deleteAssessmentRun(DeleteAssessmentRunRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAssessmentTargetResult deleteAssessmentTarget(DeleteAssessmentTargetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAssessmentTemplateResult deleteAssessmentTemplate(DeleteAssessmentTemplateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentRunsResult describeAssessmentRuns(DescribeAssessmentRunsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentTargetsResult describeAssessmentTargets(DescribeAssessmentTargetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentTemplatesResult describeAssessmentTemplates(DescribeAssessmentTemplatesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(DescribeCrossAccountAccessRoleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeExclusionsResult describeExclusions(DescribeExclusionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeFindingsResult describeFindings(DescribeFindingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeResourceGroupsResult describeResourceGroups(DescribeResourceGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRulesPackagesResult describeRulesPackages(DescribeRulesPackagesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAssessmentReportResult getAssessmentReport(GetAssessmentReportRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetExclusionsPreviewResult getExclusionsPreview(GetExclusionsPreviewRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTelemetryMetadataResult getTelemetryMetadata(GetTelemetryMetadataRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssessmentRunAgentsResult listAssessmentRunAgents(ListAssessmentRunAgentsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssessmentRunsResult listAssessmentRuns(ListAssessmentRunsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssessmentTargetsResult listAssessmentTargets(ListAssessmentTargetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListEventSubscriptionsResult listEventSubscriptions(ListEventSubscriptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListExclusionsResult listExclusions(ListExclusionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListRulesPackagesResult listRulesPackages(ListRulesPackagesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreviewAgentsResult previewAgents(PreviewAgentsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(RegisterCrossAccountAccessRoleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(RemoveAttributesFromFindingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartAssessmentRunResult startAssessmentRun(StartAssessmentRunRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopAssessmentRunResult stopAssessmentRun(StopAssessmentRunRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubscribeToEventResult subscribeToEvent(SubscribeToEventRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UnsubscribeFromEventResult unsubscribeFromEvent(UnsubscribeFromEventRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
