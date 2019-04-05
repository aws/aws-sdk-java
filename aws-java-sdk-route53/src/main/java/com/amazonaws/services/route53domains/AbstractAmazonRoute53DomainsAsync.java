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
package com.amazonaws.services.route53domains;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;

/**
 * Abstract implementation of {@code AmazonRoute53DomainsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRoute53DomainsAsync extends AbstractAmazonRoute53Domains implements AmazonRoute53DomainsAsync {

    protected AbstractAmazonRoute53DomainsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest request) {

        return checkDomainAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<CheckDomainAvailabilityRequest, CheckDomainAvailabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CheckDomainTransferabilityResult> checkDomainTransferabilityAsync(CheckDomainTransferabilityRequest request) {

        return checkDomainTransferabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDomainTransferabilityResult> checkDomainTransferabilityAsync(CheckDomainTransferabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<CheckDomainTransferabilityRequest, CheckDomainTransferabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(DeleteTagsForDomainRequest request) {

        return deleteTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(DeleteTagsForDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsForDomainRequest, DeleteTagsForDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(DisableDomainAutoRenewRequest request) {

        return disableDomainAutoRenewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(DisableDomainAutoRenewRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableDomainAutoRenewRequest, DisableDomainAutoRenewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(DisableDomainTransferLockRequest request) {

        return disableDomainTransferLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(DisableDomainTransferLockRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableDomainTransferLockRequest, DisableDomainTransferLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(EnableDomainAutoRenewRequest request) {

        return enableDomainAutoRenewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(EnableDomainAutoRenewRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableDomainAutoRenewRequest, EnableDomainAutoRenewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest request) {

        return enableDomainTransferLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableDomainTransferLockRequest, EnableDomainTransferLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(GetContactReachabilityStatusRequest request) {

        return getContactReachabilityStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(GetContactReachabilityStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContactReachabilityStatusRequest, GetContactReachabilityStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest request) {

        return getDomainDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainDetailRequest, GetDomainDetailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(GetDomainSuggestionsRequest request) {

        return getDomainSuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(GetDomainSuggestionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainSuggestionsRequest, GetDomainSuggestionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest request) {

        return getOperationDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationDetailRequest, GetOperationDetailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomainsAsync(ListDomainsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync() {

        return listDomainsAsync(new ListDomainsRequest());
    }

    /**
     * Simplified method form for invoking the ListDomains operation with an AsyncHandler.
     *
     * @see #listDomainsAsync(ListDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        return listDomainsAsync(new ListDomainsRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the ListOperations operation.
     *
     * @see #listOperationsAsync(ListOperationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync() {

        return listOperationsAsync(new ListOperationsRequest());
    }

    /**
     * Simplified method form for invoking the ListOperations operation with an AsyncHandler.
     *
     * @see #listOperationsAsync(ListOperationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler) {

        return listOperationsAsync(new ListOperationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(ListTagsForDomainRequest request) {

        return listTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(ListTagsForDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForDomainRequest, ListTagsForDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest request) {

        return registerDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, RegisterDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(RenewDomainRequest request) {

        return renewDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(RenewDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<RenewDomainRequest, RenewDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(ResendContactReachabilityEmailRequest request) {

        return resendContactReachabilityEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(ResendContactReachabilityEmailRequest request,
            com.amazonaws.handlers.AsyncHandler<ResendContactReachabilityEmailRequest, ResendContactReachabilityEmailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest request) {

        return retrieveDomainAuthCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<RetrieveDomainAuthCodeRequest, RetrieveDomainAuthCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest request) {

        return transferDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<TransferDomainRequest, TransferDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest request) {

        return updateDomainContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainContactRequest, UpdateDomainContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(UpdateDomainContactPrivacyRequest request) {

        return updateDomainContactPrivacyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(UpdateDomainContactPrivacyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainContactPrivacyRequest, UpdateDomainContactPrivacyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest request) {

        return updateDomainNameserversAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameserversRequest, UpdateDomainNameserversResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(UpdateTagsForDomainRequest request) {

        return updateTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(UpdateTagsForDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTagsForDomainRequest, UpdateTagsForDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(ViewBillingRequest request) {

        return viewBillingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(ViewBillingRequest request,
            com.amazonaws.handlers.AsyncHandler<ViewBillingRequest, ViewBillingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
