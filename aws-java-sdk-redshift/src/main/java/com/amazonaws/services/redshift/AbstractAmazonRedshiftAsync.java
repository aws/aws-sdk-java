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
package com.amazonaws.services.redshift;

import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;

/**
 * Abstract implementation of {@code AmazonRedshiftAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRedshiftAsync extends AbstractAmazonRedshift implements AmazonRedshiftAsync {

    protected AbstractAmazonRedshiftAsync() {
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(AcceptReservedNodeExchangeRequest request) {

        return acceptReservedNodeExchangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(AcceptReservedNodeExchangeRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptReservedNodeExchangeRequest, ReservedNode> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest request) {

        return authorizeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest request) {

        return authorizeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeSnapshotAccessRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(BatchDeleteClusterSnapshotsRequest request) {

        return batchDeleteClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(BatchDeleteClusterSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteClusterSnapshotsRequest, BatchDeleteClusterSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(BatchModifyClusterSnapshotsRequest request) {

        return batchModifyClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(BatchModifyClusterSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchModifyClusterSnapshotsRequest, BatchModifyClusterSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(CancelResizeRequest request) {

        return cancelResizeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(CancelResizeRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelResizeRequest, CancelResizeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest request) {

        return copyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest request) {

        return createClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest request) {

        return createClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest request) {

        return createClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest request) {

        return createClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest request) {

        return createHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHsmClientCertificateRequest, HsmClientCertificate> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest request) {

        return createHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHsmConfigurationRequest, HsmConfiguration> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest request) {

        return createSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotCopyGrantRequest, SnapshotCopyGrant> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(CreateSnapshotScheduleRequest request) {

        return createSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(CreateSnapshotScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotScheduleRequest, CreateSnapshotScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest request) {

        return deleteClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterParameterGroupRequest, DeleteClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest request) {

        return deleteClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSecurityGroupRequest, DeleteClusterSecurityGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request) {

        return deleteClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest request) {

        return deleteClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSubnetGroupRequest, DeleteClusterSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, DeleteEventSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(DeleteHsmClientCertificateRequest request) {

        return deleteHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(DeleteHsmClientCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmClientCertificateRequest, DeleteHsmClientCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest request) {

        return deleteHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmConfigurationRequest, DeleteHsmConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest request) {

        return deleteSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotCopyGrantRequest, DeleteSnapshotCopyGrantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest request) {

        return deleteSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(DescribeClusterDbRevisionsRequest request) {

        return describeClusterDbRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(DescribeClusterDbRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterDbRevisionsRequest, DescribeClusterDbRevisionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest request) {

        return describeClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync() {

        return describeClusterParameterGroupsAsync(new DescribeClusterParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler) {

        return describeClusterParameterGroupsAsync(new DescribeClusterParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(DescribeClusterParametersRequest request) {

        return describeClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(DescribeClusterParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParametersRequest, DescribeClusterParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest request) {

        return describeClusterSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync() {

        return describeClusterSecurityGroupsAsync(new DescribeClusterSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler) {

        return describeClusterSecurityGroupsAsync(new DescribeClusterSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest request) {

        return describeClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync() {

        return describeClusterSnapshotsAsync(new DescribeClusterSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler) {

        return describeClusterSnapshotsAsync(new DescribeClusterSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest request) {

        return describeClusterSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync() {

        return describeClusterSubnetGroupsAsync(new DescribeClusterSubnetGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler) {

        return describeClusterSubnetGroupsAsync(new DescribeClusterSubnetGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(DescribeClusterTracksRequest request) {

        return describeClusterTracksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(DescribeClusterTracksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterTracksRequest, DescribeClusterTracksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest request) {

        return describeClusterVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync() {

        return describeClusterVersionsAsync(new DescribeClusterVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation with an AsyncHandler.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler) {

        return describeClusterVersionsAsync(new DescribeClusterVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request) {

        return describeClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClustersAsync(DescribeClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync() {

        return describeClustersAsync(new DescribeClustersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusters operation with an AsyncHandler.
     *
     * @see #describeClustersAsync(DescribeClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {

        return describeClustersAsync(new DescribeClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(DescribeDefaultClusterParametersRequest request) {

        return describeDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(DescribeDefaultClusterParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultClusterParametersRequest, DefaultClusterParameters> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync() {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventCategories operation with an AsyncHandler.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request) {

        return describeEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync() {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation with an AsyncHandler.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync() {

        return describeEventsAsync(new DescribeEventsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        return describeEventsAsync(new DescribeEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest request) {

        return describeHsmClientCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync() {

        return describeHsmClientCertificatesAsync(new DescribeHsmClientCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation with an AsyncHandler.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler) {

        return describeHsmClientCertificatesAsync(new DescribeHsmClientCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest request) {

        return describeHsmConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync() {

        return describeHsmConfigurationsAsync(new DescribeHsmConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation with an AsyncHandler.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler) {

        return describeHsmConfigurationsAsync(new DescribeHsmConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(DescribeLoggingStatusRequest request) {

        return describeLoggingStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(DescribeLoggingStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingStatusRequest, DescribeLoggingStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest request) {

        return describeOrderableClusterOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync() {

        return describeOrderableClusterOptionsAsync(new DescribeOrderableClusterOptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation with an AsyncHandler.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler) {

        return describeOrderableClusterOptionsAsync(new DescribeOrderableClusterOptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest request) {

        return describeReservedNodeOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync() {

        return describeReservedNodeOfferingsAsync(new DescribeReservedNodeOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler) {

        return describeReservedNodeOfferingsAsync(new DescribeReservedNodeOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request) {

        return describeReservedNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync() {

        return describeReservedNodesAsync(new DescribeReservedNodesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation with an AsyncHandler.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {

        return describeReservedNodesAsync(new DescribeReservedNodesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest request) {

        return describeResizeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResizeRequest, DescribeResizeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest request) {

        return describeSnapshotCopyGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync() {

        return describeSnapshotCopyGrantsAsync(new DescribeSnapshotCopyGrantsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation with an AsyncHandler.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {

        return describeSnapshotCopyGrantsAsync(new DescribeSnapshotCopyGrantsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(DescribeSnapshotSchedulesRequest request) {

        return describeSnapshotSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(DescribeSnapshotSchedulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotSchedulesRequest, DescribeSnapshotSchedulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(DescribeStorageRequest request) {

        return describeStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(DescribeStorageRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageRequest, DescribeStorageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest request) {

        return describeTableRestoreStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync() {

        return describeTableRestoreStatusAsync(new DescribeTableRestoreStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation with an AsyncHandler.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler) {

        return describeTableRestoreStatusAsync(new DescribeTableRestoreStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(DisableLoggingRequest request) {

        return disableLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(DisableLoggingRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableLoggingRequest, DisableLoggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest request) {

        return disableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableSnapshotCopyRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest request) {

        return enableLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableLoggingRequest, EnableLoggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest request) {

        return enableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableSnapshotCopyRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(GetClusterCredentialsRequest request) {

        return getClusterCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(GetClusterCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClusterCredentialsRequest, GetClusterCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            GetReservedNodeExchangeOfferingsRequest request) {

        return getReservedNodeExchangeOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            GetReservedNodeExchangeOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReservedNodeExchangeOfferingsRequest, GetReservedNodeExchangeOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest request) {

        return modifyClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(ModifyClusterDbRevisionRequest request) {

        return modifyClusterDbRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(ModifyClusterDbRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterDbRevisionRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest request) {

        return modifyClusterIamRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterIamRolesRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(ModifyClusterMaintenanceRequest request) {

        return modifyClusterMaintenanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(ModifyClusterMaintenanceRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterMaintenanceRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest request) {

        return modifyClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(ModifyClusterSnapshotRequest request) {

        return modifyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(ModifyClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(ModifyClusterSnapshotScheduleRequest request) {

        return modifyClusterSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(ModifyClusterSnapshotScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotScheduleRequest, ModifyClusterSnapshotScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest request) {

        return modifyClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(ModifySnapshotCopyRetentionPeriodRequest request) {

        return modifySnapshotCopyRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(ModifySnapshotCopyRetentionPeriodRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotCopyRetentionPeriodRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(ModifySnapshotScheduleRequest request) {

        return modifySnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(ModifySnapshotScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifySnapshotScheduleRequest, ModifySnapshotScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest request) {

        return purchaseReservedNodeOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest request) {

        return rebootClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootClusterRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest request) {

        return resetClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> resizeClusterAsync(ResizeClusterRequest request) {

        return resizeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> resizeClusterAsync(ResizeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ResizeClusterRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest request) {

        return restoreFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(RestoreTableFromClusterSnapshotRequest request) {

        return restoreTableFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(RestoreTableFromClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreTableFromClusterSnapshotRequest, TableRestoreStatus> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest request) {

        return revokeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest request) {

        return revokeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeSnapshotAccessRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest request) {

        return rotateEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<RotateEncryptionKeyRequest, Cluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
