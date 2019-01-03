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
package com.amazonaws.services.servicediscovery;

import javax.annotation.Generated;

import com.amazonaws.services.servicediscovery.model.*;

/**
 * Abstract implementation of {@code AWSServiceDiscoveryAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSServiceDiscoveryAsync extends AbstractAWSServiceDiscovery implements AWSServiceDiscoveryAsync {

    protected AbstractAWSServiceDiscoveryAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(CreateHttpNamespaceRequest request) {

        return createHttpNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(CreateHttpNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHttpNamespaceRequest, CreateHttpNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(CreatePrivateDnsNamespaceRequest request) {

        return createPrivateDnsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(CreatePrivateDnsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePrivateDnsNamespaceRequest, CreatePrivateDnsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(CreatePublicDnsNamespaceRequest request) {

        return createPublicDnsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(CreatePublicDnsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePublicDnsNamespaceRequest, CreatePublicDnsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest request) {

        return deleteNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest request) {

        return deregisterInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, DeregisterInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(DiscoverInstancesRequest request) {

        return discoverInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(DiscoverInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DiscoverInstancesRequest, DiscoverInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request) {

        return getInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(GetInstancesHealthStatusRequest request) {

        return getInstancesHealthStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(GetInstancesHealthStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstancesHealthStatusRequest, GetInstancesHealthStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest request) {

        return getNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetNamespaceRequest, GetNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest request) {

        return listNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest request) {

        return listOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest request) {

        return registerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            UpdateInstanceCustomHealthStatusRequest request) {

        return updateInstanceCustomHealthStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            UpdateInstanceCustomHealthStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceCustomHealthStatusRequest, UpdateInstanceCustomHealthStatusResult> asyncHandler) {

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

}
