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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonRoute53Domains}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRoute53Domains implements AmazonRoute53Domains {

    protected AbstractAmazonRoute53Domains() {
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
    public CheckDomainAvailabilityResult checkDomainAvailability(CheckDomainAvailabilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CheckDomainTransferabilityResult checkDomainTransferability(CheckDomainTransferabilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsForDomainResult deleteTagsForDomain(DeleteTagsForDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableDomainAutoRenewResult disableDomainAutoRenew(DisableDomainAutoRenewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableDomainTransferLockResult disableDomainTransferLock(DisableDomainTransferLockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableDomainAutoRenewResult enableDomainAutoRenew(EnableDomainAutoRenewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableDomainTransferLockResult enableDomainTransferLock(EnableDomainTransferLockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationDetailResult getOperationDetail(GetOperationDetailRequest request) {
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
    public ListOperationsResult listOperations(ListOperationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOperationsResult listOperations() {
        return listOperations(new ListOperationsRequest());
    }

    @Override
    public ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterDomainResult registerDomain(RegisterDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RenewDomainResult renewDomain(RenewDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResendContactReachabilityEmailResult resendContactReachabilityEmail(ResendContactReachabilityEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(RetrieveDomainAuthCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TransferDomainResult transferDomain(TransferDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainContactResult updateDomainContact(UpdateDomainContactRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainNameserversResult updateDomainNameservers(UpdateDomainNameserversRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTagsForDomainResult updateTagsForDomain(UpdateTagsForDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ViewBillingResult viewBilling(ViewBillingRequest request) {
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
