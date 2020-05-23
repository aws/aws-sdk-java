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
package com.amazonaws.services.appstream;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.*;
import com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters;

/**
 * Abstract implementation of {@code AmazonAppStream}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAppStream implements AmazonAppStream {

    protected AbstractAmazonAppStream() {
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
    public AssociateFleetResult associateFleet(AssociateFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchAssociateUserStackResult batchAssociateUserStack(BatchAssociateUserStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchDisassociateUserStackResult batchDisassociateUserStack(BatchDisassociateUserStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CopyImageResult copyImage(CopyImageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateDirectoryConfigResult createDirectoryConfig(CreateDirectoryConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateImageBuilderResult createImageBuilder(CreateImageBuilderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateImageBuilderStreamingURLResult createImageBuilderStreamingURL(CreateImageBuilderStreamingURLRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateUsageReportSubscriptionResult createUsageReportSubscription(CreateUsageReportSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDirectoryConfigResult deleteDirectoryConfig(DeleteDirectoryConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteImageResult deleteImage(DeleteImageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteImageBuilderResult deleteImageBuilder(DeleteImageBuilderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteImagePermissionsResult deleteImagePermissions(DeleteImagePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteUsageReportSubscriptionResult deleteUsageReportSubscription(DeleteUsageReportSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDirectoryConfigsResult describeDirectoryConfigs(DescribeDirectoryConfigsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeFleetsResult describeFleets(DescribeFleetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeImageBuildersResult describeImageBuilders(DescribeImageBuildersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeImagePermissionsResult describeImagePermissions(DescribeImagePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeSessionsResult describeSessions(DescribeSessionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUsageReportSubscriptionsResult describeUsageReportSubscriptions(DescribeUsageReportSubscriptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUserStackAssociationsResult describeUserStackAssociations(DescribeUserStackAssociationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUsersResult describeUsers(DescribeUsersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisableUserResult disableUser(DisableUserRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisassociateFleetResult disassociateFleet(DisassociateFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EnableUserResult enableUser(EnableUserRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExpireSessionResult expireSession(ExpireSessionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssociatedFleetsResult listAssociatedFleets(ListAssociatedFleetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartFleetResult startFleet(StartFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartImageBuilderResult startImageBuilder(StartImageBuilderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopFleetResult stopFleet(StopFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopImageBuilderResult stopImageBuilder(StopImageBuilderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateDirectoryConfigResult updateDirectoryConfig(UpdateDirectoryConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateFleetResult updateFleet(UpdateFleetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateImagePermissionsResult updateImagePermissions(UpdateImagePermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
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

    @Override
    public AmazonAppStreamWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
