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
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssociateIpGroupsResult associateIpGroups(AssociateIpGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AuthorizeIpRulesResult authorizeIpRules(AuthorizeIpRulesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CopyWorkspaceImageResult copyWorkspaceImage(CopyWorkspaceImageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateIpGroupResult createIpGroup(CreateIpGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteIpGroupResult deleteIpGroup(DeleteIpGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAccountResult describeAccount(DescribeAccountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAccountModificationsResult describeAccountModifications(DescribeAccountModificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeIpGroupsResult describeIpGroups(DescribeIpGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() {
        return describeWorkspaceBundles(new DescribeWorkspaceBundlesRequest());
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() {
        return describeWorkspaceDirectories(new DescribeWorkspaceDirectoriesRequest());
    }

    @Override
    public DescribeWorkspaceImagesResult describeWorkspaceImages(DescribeWorkspaceImagesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceSnapshotsResult describeWorkspaceSnapshots(DescribeWorkspaceSnapshotsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces() {
        return describeWorkspaces(new DescribeWorkspacesRequest());
    }

    @Override
    public DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(DescribeWorkspacesConnectionStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateIpGroupsResult disassociateIpGroups(DisassociateIpGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImportWorkspaceImageResult importWorkspaceImage(ImportWorkspaceImageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MigrateWorkspaceResult migrateWorkspace(MigrateWorkspaceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyAccountResult modifyAccount(ModifyAccountRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyClientPropertiesResult modifyClientProperties(ModifyClientPropertiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifySelfservicePermissionsResult modifySelfservicePermissions(ModifySelfservicePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspaceAccessPropertiesResult modifyWorkspaceAccessProperties(ModifyWorkspaceAccessPropertiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspaceCreationPropertiesResult modifyWorkspaceCreationProperties(ModifyWorkspaceCreationPropertiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyWorkspaceStateResult modifyWorkspaceState(ModifyWorkspaceStateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RestoreWorkspaceResult restoreWorkspace(RestoreWorkspaceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RevokeIpRulesResult revokeIpRules(RevokeIpRulesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartWorkspacesResult startWorkspaces(StartWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateRulesOfIpGroupResult updateRulesOfIpGroup(UpdateRulesOfIpGroupRequest request) {
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
