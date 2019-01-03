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
package com.amazonaws.services.codedeploy;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.*;
import com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters;

/**
 * Abstract implementation of {@code AmazonCodeDeploy}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCodeDeploy implements AmazonCodeDeploy {

    protected AbstractAmazonCodeDeploy() {
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
    public AddTagsToOnPremisesInstancesResult addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetApplicationRevisionsResult batchGetApplicationRevisions(BatchGetApplicationRevisionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetApplicationsResult batchGetApplications() {
        return batchGetApplications(new BatchGetApplicationsRequest());
    }

    @Override
    public BatchGetDeploymentGroupsResult batchGetDeploymentGroups(BatchGetDeploymentGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public BatchGetDeploymentInstancesResult batchGetDeploymentInstances(BatchGetDeploymentInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetDeploymentTargetsResult batchGetDeploymentTargets(BatchGetDeploymentTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetDeploymentsResult batchGetDeployments() {
        return batchGetDeployments(new BatchGetDeploymentsRequest());
    }

    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances() {
        return batchGetOnPremisesInstances(new BatchGetOnPremisesInstancesRequest());
    }

    @Override
    public ContinueDeploymentResult continueDeployment(ContinueDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDeploymentConfigResult deleteDeploymentConfig(DeleteDeploymentConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteGitHubAccountTokenResult deleteGitHubAccountToken(DeleteGitHubAccountTokenRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterOnPremisesInstanceResult deregisterOnPremisesInstance(DeregisterOnPremisesInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOnPremisesInstanceResult getOnPremisesInstance(GetOnPremisesInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications() {
        return listApplications(new ListApplicationsRequest());
    }

    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeploymentConfigsResult listDeploymentConfigs() {
        return listDeploymentConfigs(new ListDeploymentConfigsRequest());
    }

    @Override
    public ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeploymentTargetsResult listDeploymentTargets(ListDeploymentTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeploymentsResult listDeployments() {
        return listDeployments(new ListDeploymentsRequest());
    }

    @Override
    public ListGitHubAccountTokenNamesResult listGitHubAccountTokenNames(ListGitHubAccountTokenNamesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances(ListOnPremisesInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOnPremisesInstancesResult listOnPremisesInstances() {
        return listOnPremisesInstances(new ListOnPremisesInstancesRequest());
    }

    @Override
    public PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(PutLifecycleEventHookExecutionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterApplicationRevisionResult registerApplicationRevision(RegisterApplicationRevisionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterOnPremisesInstanceResult registerOnPremisesInstance(RegisterOnPremisesInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromOnPremisesInstancesResult removeTagsFromOnPremisesInstances(RemoveTagsFromOnPremisesInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public SkipWaitTimeForInstanceTerminationResult skipWaitTimeForInstanceTermination(SkipWaitTimeForInstanceTerminationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopDeploymentResult stopDeployment(StopDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateApplicationResult updateApplication() {
        return updateApplication(new UpdateApplicationRequest());
    }

    @Override
    public UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonCodeDeployWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
