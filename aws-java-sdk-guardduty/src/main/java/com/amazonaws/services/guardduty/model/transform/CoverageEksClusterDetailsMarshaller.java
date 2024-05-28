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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CoverageEksClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoverageEksClusterDetailsMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<Long> COVEREDNODES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("coveredNodes").build();
    private static final MarshallingInfo<Long> COMPATIBLENODES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compatibleNodes").build();
    private static final MarshallingInfo<StructuredPojo> ADDONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addonDetails").build();
    private static final MarshallingInfo<String> MANAGEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("managementType").build();

    private static final CoverageEksClusterDetailsMarshaller instance = new CoverageEksClusterDetailsMarshaller();

    public static CoverageEksClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoverageEksClusterDetails coverageEksClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (coverageEksClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coverageEksClusterDetails.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(coverageEksClusterDetails.getCoveredNodes(), COVEREDNODES_BINDING);
            protocolMarshaller.marshall(coverageEksClusterDetails.getCompatibleNodes(), COMPATIBLENODES_BINDING);
            protocolMarshaller.marshall(coverageEksClusterDetails.getAddonDetails(), ADDONDETAILS_BINDING);
            protocolMarshaller.marshall(coverageEksClusterDetails.getManagementType(), MANAGEMENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
