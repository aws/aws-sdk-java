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
package com.amazonaws.services.simpledb;

import javax.annotation.Generated;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonSimpleDB}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSimpleDB implements AmazonSimpleDB {

    protected AbstractAmazonSimpleDB() {
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
    public BatchDeleteAttributesResult batchDeleteAttributes(BatchDeleteAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchPutAttributesResult batchPutAttributes(BatchPutAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAttributesResult deleteAttributes(DeleteAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DomainMetadataResult domainMetadata(DomainMetadataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAttributesResult getAttributes(GetAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainsResult listDomains() {
        return listDomains(new ListDomainsRequest());
    }

    @Override
    public PutAttributesResult putAttributes(PutAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SelectResult select(SelectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
