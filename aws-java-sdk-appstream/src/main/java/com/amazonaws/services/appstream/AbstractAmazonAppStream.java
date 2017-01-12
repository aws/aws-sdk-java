/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateFleetResult associateFleet(AssociateFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFleetsResult describeFleets(DescribeFleetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSessionsResult describeSessions(DescribeSessionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateFleetResult disassociateFleet(DisassociateFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExpireSessionResult expireSession(ExpireSessionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssociatedFleetsResult listAssociatedFleets(ListAssociatedFleetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartFleetResult startFleet(StartFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopFleetResult stopFleet(StopFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateFleetResult updateFleet(UpdateFleetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
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
    public AmazonAppStreamWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
