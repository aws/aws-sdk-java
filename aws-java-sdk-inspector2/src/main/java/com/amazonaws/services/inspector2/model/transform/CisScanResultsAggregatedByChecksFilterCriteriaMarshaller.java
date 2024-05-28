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
 * CisScanResultsAggregatedByChecksFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisScanResultsAggregatedByChecksFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> ACCOUNTIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountIdFilters").build();
    private static final MarshallingInfo<List> CHECKIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkIdFilters").build();
    private static final MarshallingInfo<List> FAILEDRESOURCESFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedResourcesFilters").build();
    private static final MarshallingInfo<List> PLATFORMFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformFilters").build();
    private static final MarshallingInfo<List> SECURITYLEVELFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityLevelFilters").build();
    private static final MarshallingInfo<List> TITLEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("titleFilters").build();

    private static final CisScanResultsAggregatedByChecksFilterCriteriaMarshaller instance = new CisScanResultsAggregatedByChecksFilterCriteriaMarshaller();

    public static CisScanResultsAggregatedByChecksFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisScanResultsAggregatedByChecksFilterCriteria cisScanResultsAggregatedByChecksFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (cisScanResultsAggregatedByChecksFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getAccountIdFilters(), ACCOUNTIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getCheckIdFilters(), CHECKIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getFailedResourcesFilters(), FAILEDRESOURCESFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getPlatformFilters(), PLATFORMFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getSecurityLevelFilters(), SECURITYLEVELFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByChecksFilterCriteria.getTitleFilters(), TITLEFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
