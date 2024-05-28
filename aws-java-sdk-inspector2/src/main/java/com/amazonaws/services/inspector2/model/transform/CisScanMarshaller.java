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
 * CisScanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisScanMarshaller {

    private static final MarshallingInfo<Integer> FAILEDCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedChecks").build();
    private static final MarshallingInfo<String> SCANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanArn").build();
    private static final MarshallingInfo<String> SCANCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanConfigurationArn").build();
    private static final MarshallingInfo<java.util.Date> SCANDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SCANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanName").build();
    private static final MarshallingInfo<String> SCHEDULEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledBy").build();
    private static final MarshallingInfo<String> SECURITYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityLevel").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targets").build();
    private static final MarshallingInfo<Integer> TOTALCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalChecks").build();

    private static final CisScanMarshaller instance = new CisScanMarshaller();

    public static CisScanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisScan cisScan, ProtocolMarshaller protocolMarshaller) {

        if (cisScan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisScan.getFailedChecks(), FAILEDCHECKS_BINDING);
            protocolMarshaller.marshall(cisScan.getScanArn(), SCANARN_BINDING);
            protocolMarshaller.marshall(cisScan.getScanConfigurationArn(), SCANCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(cisScan.getScanDate(), SCANDATE_BINDING);
            protocolMarshaller.marshall(cisScan.getScanName(), SCANNAME_BINDING);
            protocolMarshaller.marshall(cisScan.getScheduledBy(), SCHEDULEDBY_BINDING);
            protocolMarshaller.marshall(cisScan.getSecurityLevel(), SECURITYLEVEL_BINDING);
            protocolMarshaller.marshall(cisScan.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(cisScan.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(cisScan.getTotalChecks(), TOTALCHECKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
