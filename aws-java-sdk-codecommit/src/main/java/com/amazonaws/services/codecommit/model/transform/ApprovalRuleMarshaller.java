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
 * ApprovalRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApprovalRuleMarshaller {

    private static final MarshallingInfo<String> APPROVALRULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleId").build();
    private static final MarshallingInfo<String> APPROVALRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleName").build();
    private static final MarshallingInfo<String> APPROVALRULECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRuleContent").build();
    private static final MarshallingInfo<String> RULECONTENTSHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleContentSha256").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedUser").build();
    private static final MarshallingInfo<StructuredPojo> ORIGINAPPROVALRULETEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originApprovalRuleTemplate").build();

    private static final ApprovalRuleMarshaller instance = new ApprovalRuleMarshaller();

    public static ApprovalRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApprovalRule approvalRule, ProtocolMarshaller protocolMarshaller) {

        if (approvalRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(approvalRule.getApprovalRuleId(), APPROVALRULEID_BINDING);
            protocolMarshaller.marshall(approvalRule.getApprovalRuleName(), APPROVALRULENAME_BINDING);
            protocolMarshaller.marshall(approvalRule.getApprovalRuleContent(), APPROVALRULECONTENT_BINDING);
            protocolMarshaller.marshall(approvalRule.getRuleContentSha256(), RULECONTENTSHA256_BINDING);
            protocolMarshaller.marshall(approvalRule.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(approvalRule.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(approvalRule.getLastModifiedUser(), LASTMODIFIEDUSER_BINDING);
            protocolMarshaller.marshall(approvalRule.getOriginApprovalRuleTemplate(), ORIGINAPPROVALRULETEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
