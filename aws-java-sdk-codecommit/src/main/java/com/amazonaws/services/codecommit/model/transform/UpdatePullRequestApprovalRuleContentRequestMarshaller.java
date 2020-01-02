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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePullRequestApprovalRuleContentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePullRequestApprovalRuleContentRequestMarshaller {

    private static final MarshallingInfo<String> PULLREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestId").build();
    private static final MarshallingInfo<String> APPROVALRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleName").build();
    private static final MarshallingInfo<String> EXISTINGRULECONTENTSHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingRuleContentSha256").build();
    private static final MarshallingInfo<String> NEWRULECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newRuleContent").build();

    private static final UpdatePullRequestApprovalRuleContentRequestMarshaller instance = new UpdatePullRequestApprovalRuleContentRequestMarshaller();

    public static UpdatePullRequestApprovalRuleContentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePullRequestApprovalRuleContentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePullRequestApprovalRuleContentRequest.getPullRequestId(), PULLREQUESTID_BINDING);
            protocolMarshaller.marshall(updatePullRequestApprovalRuleContentRequest.getApprovalRuleName(), APPROVALRULENAME_BINDING);
            protocolMarshaller.marshall(updatePullRequestApprovalRuleContentRequest.getExistingRuleContentSha256(), EXISTINGRULECONTENTSHA256_BINDING);
            protocolMarshaller.marshall(updatePullRequestApprovalRuleContentRequest.getNewRuleContent(), NEWRULECONTENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
