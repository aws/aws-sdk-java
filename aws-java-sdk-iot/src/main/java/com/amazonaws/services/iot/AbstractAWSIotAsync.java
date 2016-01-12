/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.iot;

import com.amazonaws.services.iot.model.*;

/**
 * Abstract implementation of {@code AWSIotAsync}. Convenient method forms pass
 * through to the corresponding overload that takes a request object and an
 * {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSIotAsync extends AbstractAWSIot implements AWSIotAsync {

    protected AbstractAWSIotAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest request) {

        return acceptCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptCertificateTransferRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            AttachPrincipalPolicyRequest request) {

        return attachPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            AttachPrincipalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            AttachThingPrincipalRequest request) {

        return attachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            AttachThingPrincipalRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachThingPrincipalRequest, AttachThingPrincipalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest request) {

        return cancelCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelCertificateTransferRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            CreateCertificateFromCsrRequest request) {

        return createCertificateFromCsrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            CreateCertificateFromCsrRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateFromCsrRequest, CreateCertificateFromCsrResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            CreateKeysAndCertificateRequest request) {

        return createKeysAndCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            CreateKeysAndCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeysAndCertificateRequest, CreateKeysAndCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest request) {

        return createPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(
            CreateThingRequest request) {

        return createThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(
            CreateThingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateThingRequest, CreateThingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> createTopicRuleAsync(
            CreateTopicRuleRequest request) {

        return createTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createTopicRuleAsync(
            CreateTopicRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRuleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest request) {

        return deletePolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            DeleteThingRequest request) {

        return deleteThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            DeleteThingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteThingRequest, DeleteThingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            DeleteTopicRuleRequest request) {

        return deleteTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            DeleteTopicRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRuleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            DescribeThingRequest request) {

        return describeThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            DescribeThingRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeThingRequest, DescribeThingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            DetachPrincipalPolicyRequest request) {

        return detachPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            DetachPrincipalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            DetachThingPrincipalRequest request) {

        return detachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            DetachThingPrincipalRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachThingPrincipalRequest, DetachThingPrincipalResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            GetLoggingOptionsRequest request) {

        return getLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            GetLoggingOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest request) {

        return getPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            GetTopicRuleRequest request) {

        return getTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            GetTopicRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTopicRuleRequest, GetTopicRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest request) {

        return listPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            ListPrincipalPoliciesRequest request) {

        return listPrincipalPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            ListPrincipalPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            ListPrincipalThingsRequest request) {

        return listPrincipalThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            ListPrincipalThingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalThingsRequest, ListPrincipalThingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            ListThingPrincipalsRequest request) {

        return listThingPrincipalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            ListThingPrincipalsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListThingPrincipalsRequest, ListThingPrincipalsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            ListThingsRequest request) {

        return listThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            ListThingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListThingsRequest, ListThingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            ListTopicRulesRequest request) {

        return listTopicRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            ListTopicRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTopicRulesRequest, ListTopicRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest request) {

        return rejectCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectCertificateTransferRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            ReplaceTopicRuleRequest request) {

        return replaceTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            ReplaceTopicRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<ReplaceTopicRuleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest request) {

        return setDefaultPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            SetLoggingOptionsRequest request) {

        return setLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            SetLoggingOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<SetLoggingOptionsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            TransferCertificateRequest request) {

        return transferCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            TransferCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<TransferCertificateRequest, TransferCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateCertificateAsync(
            UpdateCertificateRequest request) {

        return updateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateCertificateAsync(
            UpdateCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            UpdateThingRequest request) {

        return updateThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            UpdateThingRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateThingRequest, UpdateThingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
