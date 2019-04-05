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
package com.amazonaws.services.ecs;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;

/**
 * Abstract implementation of {@code AmazonECSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonECSAsync extends AbstractAmazonECS implements AmazonECSAsync {

    protected AbstractAmazonECSAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateCluster operation.
     *
     * @see #createClusterAsync(CreateClusterRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync() {

        return createClusterAsync(new CreateClusterRequest());
    }

    /**
     * Simplified method form for invoking the CreateCluster operation with an AsyncHandler.
     *
     * @see #createClusterAsync(CreateClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {

        return createClusterAsync(new CreateClusterRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request) {

        return createServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTaskSetResult> createTaskSetAsync(CreateTaskSetRequest request) {

        return createTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskSetResult> createTaskSetAsync(CreateTaskSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTaskSetRequest, CreateTaskSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountSettingResult> deleteAccountSettingAsync(DeleteAccountSettingRequest request) {

        return deleteAccountSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountSettingResult> deleteAccountSettingAsync(DeleteAccountSettingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountSettingRequest, DeleteAccountSettingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request) {

        return deleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAttributesRequest, DeleteAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request) {

        return deleteServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskSetResult> deleteTaskSetAsync(DeleteTaskSetRequest request) {

        return deleteTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskSetResult> deleteTaskSetAsync(DeleteTaskSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTaskSetRequest, DeleteTaskSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(DeregisterContainerInstanceRequest request) {

        return deregisterContainerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(DeregisterContainerInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterContainerInstanceRequest, DeregisterContainerInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest request) {

        return deregisterTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterTaskDefinitionRequest, DeregisterTaskDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(DescribeContainerInstancesRequest request) {

        return describeContainerInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(DescribeContainerInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeContainerInstancesRequest, DescribeContainerInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest request) {

        return describeTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskDefinitionRequest, DescribeTaskDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskSetsResult> describeTaskSetsAsync(DescribeTaskSetsRequest request) {

        return describeTaskSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskSetsResult> describeTaskSetsAsync(DescribeTaskSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskSetsRequest, DescribeTaskSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest request) {

        return describeTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTasksRequest, DescribeTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest request) {

        return discoverPollEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest)
     */
    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync() {

        return discoverPollEndpointAsync(new DiscoverPollEndpointRequest());
    }

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation with an AsyncHandler.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(
            com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler) {

        return discoverPollEndpointAsync(new DiscoverPollEndpointRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAccountSettingsResult> listAccountSettingsAsync(ListAccountSettingsRequest request) {

        return listAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountSettingsResult> listAccountSettingsAsync(ListAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountSettingsRequest, ListAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttributesResult> listAttributesAsync(ListAttributesRequest request) {

        return listAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttributesResult> listAttributesAsync(ListAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttributesRequest, ListAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync() {

        return listClustersAsync(new ListClustersRequest());
    }

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        return listClustersAsync(new ListClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest request) {

        return listContainerInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListContainerInstances operation.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync() {

        return listContainerInstancesAsync(new ListContainerInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListContainerInstances operation with an AsyncHandler.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler) {

        return listContainerInstancesAsync(new ListContainerInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListServices operation.
     *
     * @see #listServicesAsync(ListServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync() {

        return listServicesAsync(new ListServicesRequest());
    }

    /**
     * Simplified method form for invoking the ListServices operation with an AsyncHandler.
     *
     * @see #listServicesAsync(ListServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {

        return listServicesAsync(new ListServicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest request) {

        return listTaskDefinitionFamiliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync() {

        return listTaskDefinitionFamiliesAsync(new ListTaskDefinitionFamiliesRequest());
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler) {

        return listTaskDefinitionFamiliesAsync(new ListTaskDefinitionFamiliesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest request) {

        return listTaskDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync() {

        return listTaskDefinitionsAsync(new ListTaskDefinitionsRequest());
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler) {

        return listTaskDefinitionsAsync(new ListTaskDefinitionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListTasks operation.
     *
     * @see #listTasksAsync(ListTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync() {

        return listTasksAsync(new ListTasksRequest());
    }

    /**
     * Simplified method form for invoking the ListTasks operation with an AsyncHandler.
     *
     * @see #listTasksAsync(ListTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {

        return listTasksAsync(new ListTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingResult> putAccountSettingAsync(PutAccountSettingRequest request) {

        return putAccountSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingResult> putAccountSettingAsync(PutAccountSettingRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccountSettingRequest, PutAccountSettingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingDefaultResult> putAccountSettingDefaultAsync(PutAccountSettingDefaultRequest request) {

        return putAccountSettingDefaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingDefaultResult> putAccountSettingDefaultAsync(PutAccountSettingDefaultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccountSettingDefaultRequest, PutAccountSettingDefaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request) {

        return putAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAttributesRequest, PutAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(RegisterContainerInstanceRequest request) {

        return registerContainerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(RegisterContainerInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterContainerInstanceRequest, RegisterContainerInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest request) {

        return registerTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterTaskDefinitionRequest, RegisterTaskDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RunTaskResult> runTaskAsync(RunTaskRequest request) {

        return runTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunTaskResult> runTaskAsync(RunTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<RunTaskRequest, RunTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTaskResult> startTaskAsync(StartTaskRequest request) {

        return startTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskResult> startTaskAsync(StartTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTaskRequest, StartTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopTaskResult> stopTaskAsync(StopTaskRequest request) {

        return stopTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTaskResult> stopTaskAsync(StopTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StopTaskRequest, StopTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(SubmitContainerStateChangeRequest request) {

        return submitContainerStateChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(SubmitContainerStateChangeRequest request,
            com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest)
     */
    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync() {

        return submitContainerStateChangeAsync(new SubmitContainerStateChangeRequest());
    }

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation with an AsyncHandler.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(
            com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler) {

        return submitContainerStateChangeAsync(new SubmitContainerStateChangeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest request) {

        return submitTaskStateChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest request,
            com.amazonaws.handlers.AsyncHandler<SubmitTaskStateChangeRequest, SubmitTaskStateChangeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest request) {

        return updateContainerAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateContainerAgentRequest, UpdateContainerAgentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerInstancesStateResult> updateContainerInstancesStateAsync(UpdateContainerInstancesStateRequest request) {

        return updateContainerInstancesStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerInstancesStateResult> updateContainerInstancesStateAsync(UpdateContainerInstancesStateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateContainerInstancesStateRequest, UpdateContainerInstancesStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request) {

        return updateServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServicePrimaryTaskSetResult> updateServicePrimaryTaskSetAsync(UpdateServicePrimaryTaskSetRequest request) {

        return updateServicePrimaryTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServicePrimaryTaskSetResult> updateServicePrimaryTaskSetAsync(UpdateServicePrimaryTaskSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServicePrimaryTaskSetRequest, UpdateServicePrimaryTaskSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskSetResult> updateTaskSetAsync(UpdateTaskSetRequest request) {

        return updateTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskSetResult> updateTaskSetAsync(UpdateTaskSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskSetRequest, UpdateTaskSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
