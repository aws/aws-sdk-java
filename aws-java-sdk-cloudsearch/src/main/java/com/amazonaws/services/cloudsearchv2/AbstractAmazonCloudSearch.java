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
package com.amazonaws.services.cloudsearchv2;

import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCloudSearch}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudSearch implements AmazonCloudSearch {

    protected AbstractAmazonCloudSearch() {
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
    public BuildSuggestersResult buildSuggesters(BuildSuggestersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DefineAnalysisSchemeResult defineAnalysisScheme(DefineAnalysisSchemeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DefineExpressionResult defineExpression(DefineExpressionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DefineSuggesterResult defineSuggester(DefineSuggesterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteExpressionResult deleteExpression(DeleteExpressionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAnalysisSchemesResult describeAnalysisSchemes(DescribeAnalysisSchemesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAvailabilityOptionsResult describeAvailabilityOptions(DescribeAvailabilityOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDomainsResult describeDomains() {
        return describeDomains(new DescribeDomainsRequest());
    }

    @Override
    public DescribeExpressionsResult describeExpressions(DescribeExpressionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSuggestersResult describeSuggesters(DescribeSuggestersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainNamesResult listDomainNames() {
        return listDomainNames(new ListDomainNamesRequest());
    }

    @Override
    public UpdateAvailabilityOptionsResult updateAvailabilityOptions(UpdateAvailabilityOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateScalingParametersResult updateScalingParameters(UpdateScalingParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest request) {
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
