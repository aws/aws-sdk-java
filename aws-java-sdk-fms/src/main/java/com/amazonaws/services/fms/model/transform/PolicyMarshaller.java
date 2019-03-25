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
 * PolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PolicyMarshaller {

    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> POLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyName").build();
    private static final MarshallingInfo<String> POLICYUPDATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyUpdateToken").build();
    private static final MarshallingInfo<StructuredPojo> SECURITYSERVICEPOLICYDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityServicePolicyData").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<List> RESOURCETYPELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceTypeList").build();
    private static final MarshallingInfo<List> RESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceTags").build();
    private static final MarshallingInfo<Boolean> EXCLUDERESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeResourceTags").build();
    private static final MarshallingInfo<Boolean> REMEDIATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationEnabled").build();
    private static final MarshallingInfo<Map> INCLUDEMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IncludeMap").build();
    private static final MarshallingInfo<Map> EXCLUDEMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExcludeMap").build();

    private static final PolicyMarshaller instance = new PolicyMarshaller();

    public static PolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Policy policy, ProtocolMarshaller protocolMarshaller) {

        if (policy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(policy.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(policy.getPolicyName(), POLICYNAME_BINDING);
            protocolMarshaller.marshall(policy.getPolicyUpdateToken(), POLICYUPDATETOKEN_BINDING);
            protocolMarshaller.marshall(policy.getSecurityServicePolicyData(), SECURITYSERVICEPOLICYDATA_BINDING);
            protocolMarshaller.marshall(policy.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(policy.getResourceTypeList(), RESOURCETYPELIST_BINDING);
            protocolMarshaller.marshall(policy.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(policy.getExcludeResourceTags(), EXCLUDERESOURCETAGS_BINDING);
            protocolMarshaller.marshall(policy.getRemediationEnabled(), REMEDIATIONENABLED_BINDING);
            protocolMarshaller.marshall(policy.getIncludeMap(), INCLUDEMAP_BINDING);
            protocolMarshaller.marshall(policy.getExcludeMap(), EXCLUDEMAP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
