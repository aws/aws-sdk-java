/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAgreementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAgreementRequestMarshaller {

    private static final MarshallingInfo<String> AGREEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgreementId").build();
    private static final MarshallingInfo<String> SERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServerId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> LOCALPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalProfileId").build();
    private static final MarshallingInfo<String> PARTNERPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartnerProfileId").build();
    private static final MarshallingInfo<String> BASEDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseDirectory").build();
    private static final MarshallingInfo<String> ACCESSROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessRole").build();

    private static final UpdateAgreementRequestMarshaller instance = new UpdateAgreementRequestMarshaller();

    public static UpdateAgreementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAgreementRequest updateAgreementRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAgreementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAgreementRequest.getAgreementId(), AGREEMENTID_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getServerId(), SERVERID_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getLocalProfileId(), LOCALPROFILEID_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getPartnerProfileId(), PARTNERPROFILEID_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getBaseDirectory(), BASEDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateAgreementRequest.getAccessRole(), ACCESSROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
