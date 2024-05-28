/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CisScanResultDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisScanResultDetailsMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> CHECKDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkDescription").build();
    private static final MarshallingInfo<String> CHECKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkId").build();
    private static final MarshallingInfo<String> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArn").build();
    private static final MarshallingInfo<String> LEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("level").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remediation").build();
    private static final MarshallingInfo<String> SCANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<String> TARGETRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();

    private static final CisScanResultDetailsMarshaller instance = new CisScanResultDetailsMarshaller();

    public static CisScanResultDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisScanResultDetails cisScanResultDetails, ProtocolMarshaller protocolMarshaller) {

        if (cisScanResultDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisScanResultDetails.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getCheckDescription(), CHECKDESCRIPTION_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getCheckId(), CHECKID_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getLevel(), LEVEL_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getScanArn(), SCANARN_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getTargetResourceId(), TARGETRESOURCEID_BINDING);
            protocolMarshaller.marshall(cisScanResultDetails.getTitle(), TITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
