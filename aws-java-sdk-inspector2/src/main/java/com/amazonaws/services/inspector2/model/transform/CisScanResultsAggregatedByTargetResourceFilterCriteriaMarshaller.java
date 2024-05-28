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
 * CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> ACCOUNTIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountIdFilters").build();
    private static final MarshallingInfo<List> CHECKIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("checkIdFilters").build();
    private static final MarshallingInfo<List> FAILEDCHECKSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedChecksFilters").build();
    private static final MarshallingInfo<List> PLATFORMFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformFilters").build();
    private static final MarshallingInfo<List> STATUSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statusFilters").build();
    private static final MarshallingInfo<List> TARGETRESOURCEIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceIdFilters").build();
    private static final MarshallingInfo<List> TARGETRESOURCETAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceTagFilters").build();
    private static final MarshallingInfo<List> TARGETSTATUSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetStatusFilters").build();
    private static final MarshallingInfo<List> TARGETSTATUSREASONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetStatusReasonFilters").build();

    private static final CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller instance = new CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller();

    public static CisScanResultsAggregatedByTargetResourceFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisScanResultsAggregatedByTargetResourceFilterCriteria cisScanResultsAggregatedByTargetResourceFilterCriteria,
            ProtocolMarshaller protocolMarshaller) {

        if (cisScanResultsAggregatedByTargetResourceFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getAccountIdFilters(), ACCOUNTIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getCheckIdFilters(), CHECKIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getFailedChecksFilters(), FAILEDCHECKSFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getPlatformFilters(), PLATFORMFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getStatusFilters(), STATUSFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getTargetResourceIdFilters(), TARGETRESOURCEIDFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getTargetResourceTagFilters(), TARGETRESOURCETAGFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getTargetStatusFilters(), TARGETSTATUSFILTERS_BINDING);
            protocolMarshaller.marshall(cisScanResultsAggregatedByTargetResourceFilterCriteria.getTargetStatusReasonFilters(),
                    TARGETSTATUSREASONFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
