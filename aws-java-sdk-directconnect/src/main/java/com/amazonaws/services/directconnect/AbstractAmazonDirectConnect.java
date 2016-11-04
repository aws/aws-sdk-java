/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonDirectConnect}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonDirectConnect implements AmazonDirectConnect {

    protected AbstractAmazonDirectConnect() {
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
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInterconnectResult createInterconnect(CreateInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionsResult describeConnections() {
        return describeConnections(new DescribeConnectionsRequest());
    }

    @Override
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects() {
        return describeInterconnects(new DescribeInterconnectsRequest());
    }

    @Override
    public DescribeLocationsResult describeLocations(DescribeLocationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLocationsResult describeLocations() {
        return describeLocations(new DescribeLocationsRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways() {
        return describeVirtualGateways(new DescribeVirtualGatewaysRequest());
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
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
