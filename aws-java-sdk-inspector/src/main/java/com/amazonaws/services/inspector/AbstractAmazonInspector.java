/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.inspector;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonInspector}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonInspector implements AmazonInspector {

    protected AbstractAmazonInspector() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddAttributesToFindingsResult addAttributesToFindings(
            AddAttributesToFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachAssessmentAndRulesPackageResult attachAssessmentAndRulesPackage(
            AttachAssessmentAndRulesPackageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateApplicationResult createApplication(
            CreateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAssessmentResult createAssessment(
            CreateAssessmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateResourceGroupResult createResourceGroup(
            CreateResourceGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationResult deleteApplication(
            DeleteApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAssessmentResult deleteAssessment(
            DeleteAssessmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRunResult deleteRun(DeleteRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeApplicationResult describeApplication(
            DescribeApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentResult describeAssessment(
            DescribeAssessmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(
            DescribeCrossAccountAccessRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFindingResult describeFinding(DescribeFindingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeResourceGroupResult describeResourceGroup(
            DescribeResourceGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRulesPackageResult describeRulesPackage(
            DescribeRulesPackageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRunResult describeRun(DescribeRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachAssessmentAndRulesPackageResult detachAssessmentAndRulesPackage(
            DetachAssessmentAndRulesPackageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAssessmentTelemetryResult getAssessmentTelemetry(
            GetAssessmentTelemetryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(
            ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentAgentsResult listAssessmentAgents(
            ListAssessmentAgentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentsResult listAssessments(ListAssessmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedAssessmentsResult listAttachedAssessments(
            ListAttachedAssessmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedRulesPackagesResult listAttachedRulesPackages(
            ListAttachedRulesPackagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRulesPackagesResult listRulesPackages(
            ListRulesPackagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRunsResult listRuns(ListRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public LocalizeTextResult localizeText(LocalizeTextRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PreviewAgentsForResourceGroupResult previewAgentsForResourceGroup(
            PreviewAgentsForResourceGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(
            RegisterCrossAccountAccessRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(
            RemoveAttributesFromFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RunAssessmentResult runAssessment(RunAssessmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetTagsForResourceResult setTagsForResource(
            SetTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartDataCollectionResult startDataCollection(
            StartDataCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopDataCollectionResult stopDataCollection(
            StopDataCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateApplicationResult updateApplication(
            UpdateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAssessmentResult updateAssessment(
            UpdateAssessmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
