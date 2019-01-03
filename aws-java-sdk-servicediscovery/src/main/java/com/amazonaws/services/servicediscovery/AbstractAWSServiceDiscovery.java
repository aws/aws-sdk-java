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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSServiceDiscovery}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSServiceDiscovery implements AWSServiceDiscovery {

    protected AbstractAWSServiceDiscovery() {
    }

    @Override
    public CreateHttpNamespaceResult createHttpNamespace(CreateHttpNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(CreatePrivateDnsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePublicDnsNamespaceResult createPublicDnsNamespace(CreatePublicDnsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DiscoverInstancesResult discoverInstances(DiscoverInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceResult getInstance(GetInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstancesHealthStatusResult getInstancesHealthStatus(GetInstancesHealthStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetNamespaceResult getNamespace(GetNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListNamespacesResult listNamespaces(ListNamespacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOperationsResult listOperations(ListOperationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateInstanceCustomHealthStatusResult updateInstanceCustomHealthStatus(UpdateInstanceCustomHealthStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
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
