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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CisScanResultDetailsFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisScanResultDetailsFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> CHECKIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkIdFilters").build();
    private static final MarshallingInfo<List> FINDINGARNFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArnFilters").build();
    private static final MarshallingInfo<List> FINDINGSTATUSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingStatusFilters").build();
    private static final MarshallingInfo<List> SECURITYLEVELFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityLevelFilters").build();
    private static final MarshallingInfo<List> TITLEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("titleFilters").build();

    private static final CisScanResultDetailsFilterCriteriaMarshaller instance = new CisScanResultDetailsFilterCriteriaMarshaller();

    public static CisScanResultDetailsFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisScanResultDetailsFilterCriteria cisScanResultDetailsFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (cisScanResultDetailsFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisScanResultDetailsFilterCriteria.getCheckIdFilters(), CHECKIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultDetailsFilterCriteria.getFindingArnFilters(), FINDINGARNFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultDetailsFilterCriteria.getFindingStatusFilters(), FINDINGSTATUSFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultDetailsFilterCriteria.getSecurityLevelFilters(), SECURITYLEVELFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultDetailsFilterCriteria.getTitleFilters(), TITLEFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
