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
package com.amazonaws.services.cloudtrail;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCloudTrail}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudTrail implements AWSCloudTrail {

    protected AbstractAWSCloudTrail() {
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
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTrailResult createTrail(CreateTrailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTrailResult deleteTrail(DeleteTrailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTrailsResult describeTrails(DescribeTrailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTrailsResult describeTrails() {
        return describeTrails(new DescribeTrailsRequest());
    }

    @Override
    public GetEventSelectorsResult getEventSelectors(GetEventSelectorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTrailStatusResult getTrailStatus(GetTrailStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPublicKeysResult listPublicKeys(ListPublicKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPublicKeysResult listPublicKeys() {
        return listPublicKeys(new ListPublicKeysRequest());
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public LookupEventsResult lookupEvents(LookupEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public LookupEventsResult lookupEvents() {
        return lookupEvents(new LookupEventsRequest());
    }

    @Override
    public PutEventSelectorsResult putEventSelectors(PutEventSelectorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartLoggingResult startLogging(StartLoggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopLoggingResult stopLogging(StopLoggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTrailResult updateTrail(UpdateTrailRequest request) {
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
