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
package com.amazonaws.services.workspaces;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonWorkspaces}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonWorkspaces implements AmazonWorkspaces {

    protected AbstractAmazonWorkspaces() {
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
    public AssociateIpGroupsResult associateIpGroups(AssociateIpGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AuthorizeIpRulesResult authorizeIpRules(AuthorizeIpRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateIpGroupResult createIpGroup(CreateIpGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIpGroupResult deleteIpGroup(DeleteIpGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountResult describeAccount(DescribeAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountModificationsResult describeAccountModifications(DescribeAccountModificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIpGroupsResult describeIpGroups(DescribeIpGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() {
        return describeWorkspaceBundles(new DescribeWorkspaceBundlesRequest());
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() {
        return describeWorkspaceDirectories(new DescribeWorkspaceDirectoriesRequest());
    }

    @Override
    public DescribeWorkspaceImagesResult describeWorkspaceImages(DescribeWorkspaceImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces() {
        return describeWorkspaces(new DescribeWorkspacesRequest());
    }

    @Override
    public DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(DescribeWorkspacesConnectionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateIpGroupsResult disassociateIpGroups(DisassociateIpGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportWorkspaceImageResult importWorkspaceImage(ImportWorkspaceImageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyAccountResult modifyAccount(ModifyAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyClientPropertiesResult modifyClientProperties(ModifyClientPropertiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspaceStateResult modifyWorkspaceState(ModifyWorkspaceStateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RevokeIpRulesResult revokeIpRules(RevokeIpRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartWorkspacesResult startWorkspaces(StartWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRulesOfIpGroupResult updateRulesOfIpGroup(UpdateRulesOfIpGroupRequest request) {
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

}
