/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement;

import javax.annotation.Generated;

import com.amazonaws.services.marketplaceagreement.model.*;

/**
 * Abstract implementation of {@code AWSMarketplaceAgreementAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMarketplaceAgreementAsync extends AbstractAWSMarketplaceAgreement implements AWSMarketplaceAgreementAsync {

    protected AbstractAWSMarketplaceAgreementAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest request) {

        return describeAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAgreementRequest, DescribeAgreementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAgreementTermsResult> getAgreementTermsAsync(GetAgreementTermsRequest request) {

        return getAgreementTermsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgreementTermsResult> getAgreementTermsAsync(GetAgreementTermsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAgreementTermsRequest, GetAgreementTermsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchAgreementsResult> searchAgreementsAsync(SearchAgreementsRequest request) {

        return searchAgreementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAgreementsResult> searchAgreementsAsync(SearchAgreementsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchAgreementsRequest, SearchAgreementsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
