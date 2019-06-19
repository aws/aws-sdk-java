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
package com.amazonaws.services.fms;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSFMS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSFMS implements AWSFMS {

    protected AbstractAWSFMS() {
    }

    @Override
    public AssociateAdminAccountResult associateAdminAccount(AssociateAdminAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNotificationChannelResult deleteNotificationChannel(DeleteNotificationChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateAdminAccountResult disassociateAdminAccount(DisassociateAdminAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAdminAccountResult getAdminAccount(GetAdminAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailResult getComplianceDetail(GetComplianceDetailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetNotificationChannelResult getNotificationChannel(GetNotificationChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProtectionStatusResult getProtectionStatus(GetProtectionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListComplianceStatusResult listComplianceStatus(ListComplianceStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutNotificationChannelResult putNotificationChannel(PutNotificationChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutPolicyResult putPolicy(PutPolicyRequest request) {
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
