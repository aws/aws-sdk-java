/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetViolationDetailsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetViolationDetailsRequestMarshaller {

    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> MEMBERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemberAccount").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();

    private static final GetViolationDetailsRequestMarshaller instance = new GetViolationDetailsRequestMarshaller();

    public static GetViolationDetailsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetViolationDetailsRequest getViolationDetailsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getViolationDetailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getViolationDetailsRequest.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(getViolationDetailsRequest.getMemberAccount(), MEMBERACCOUNT_BINDING);
            protocolMarshaller.marshall(getViolationDetailsRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(getViolationDetailsRequest.getResourceType(), RESOURCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
