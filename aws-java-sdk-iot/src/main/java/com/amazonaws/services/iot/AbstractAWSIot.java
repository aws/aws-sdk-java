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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSIot}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSIot implements AWSIot {

    protected AbstractAWSIot() {
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
    public void acceptCertificateTransfer(
            AcceptCertificateTransferRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void attachPrincipalPolicy(AttachPrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachThingPrincipalResult attachThingPrincipal(
            AttachThingPrincipalRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void cancelCertificateTransfer(
            CancelCertificateTransferRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCertificateFromCsrResult createCertificateFromCsr(
            CreateCertificateFromCsrRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeysAndCertificateResult createKeysAndCertificate(
            CreateKeysAndCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateThingResult createThing(CreateThingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createTopicRule(CreateTopicRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteCertificate(DeleteCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deletePolicy(DeletePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deletePolicyVersion(DeletePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteThingResult deleteThing(DeleteThingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteTopicRule(DeleteTopicRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCertificateResult describeCertificate(
            DescribeCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEndpointResult describeEndpoint(
            DescribeEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeThingResult describeThing(DescribeThingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void detachPrincipalPolicy(DetachPrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachThingPrincipalResult detachThingPrincipal(
            DetachThingPrincipalRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLoggingOptionsResult getLoggingOptions(
            GetLoggingOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyVersionResult getPolicyVersion(
            GetPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTopicRuleResult getTopicRule(GetTopicRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCertificatesResult listCertificates(
            ListCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPolicyVersionsResult listPolicyVersions(
            ListPolicyVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPrincipalPoliciesResult listPrincipalPolicies(
            ListPrincipalPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPrincipalThingsResult listPrincipalThings(
            ListPrincipalThingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListThingPrincipalsResult listThingPrincipals(
            ListThingPrincipalsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListThingsResult listThings(ListThingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTopicRulesResult listTopicRules(ListTopicRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void rejectCertificateTransfer(
            RejectCertificateTransferRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void replaceTopicRule(ReplaceTopicRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setLoggingOptions(SetLoggingOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TransferCertificateResult transferCertificate(
            TransferCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateCertificate(UpdateCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateThingResult updateThing(UpdateThingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
