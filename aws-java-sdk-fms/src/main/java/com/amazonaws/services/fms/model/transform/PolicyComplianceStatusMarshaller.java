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
package com.amazonaws.services.fms.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PolicyComplianceStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PolicyComplianceStatusMarshaller {

    private static final MarshallingInfo<String> POLICYOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyOwner").build();
    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyName").build();
    private static final MarshallingInfo<String> MEMBERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemberAccount").build();
    private static final MarshallingInfo<List> EVALUATIONRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationResults").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> ISSUEINFOMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IssueInfoMap").build();

    private static final PolicyComplianceStatusMarshaller instance = new PolicyComplianceStatusMarshaller();

    public static PolicyComplianceStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PolicyComplianceStatus policyComplianceStatus, ProtocolMarshaller protocolMarshaller) {

        if (policyComplianceStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(policyComplianceStatus.getPolicyOwner(), POLICYOWNER_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getMemberAccount(), MEMBERACCOUNT_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getEvaluationResults(), EVALUATIONRESULTS_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(policyComplianceStatus.getIssueInfoMap(), ISSUEINFOMAP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
