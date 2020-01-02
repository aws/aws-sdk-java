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
package com.amazonaws.services.marketplacecatalog;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSMarketplaceCatalog}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMarketplaceCatalog implements AWSMarketplaceCatalog {

    protected AbstractAWSMarketplaceCatalog() {
    }

    @Override
    public CancelChangeSetResult cancelChangeSet(CancelChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEntityResult describeEntity(DescribeEntityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEntitiesResult listEntities(ListEntitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartChangeSetResult startChangeSet(StartChangeSetRequest request) {
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
