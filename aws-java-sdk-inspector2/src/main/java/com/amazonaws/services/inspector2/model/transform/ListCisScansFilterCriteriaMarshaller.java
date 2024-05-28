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
 * ListCisScansFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCisScansFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> FAILEDCHECKSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedChecksFilters").build();
    private static final MarshallingInfo<List> SCANARNFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanArnFilters").build();
    private static final MarshallingInfo<List> SCANATFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanAtFilters").build();
    private static final MarshallingInfo<List> SCANCONFIGURATIONARNFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanConfigurationArnFilters").build();
    private static final MarshallingInfo<List> SCANNAMEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanNameFilters").build();
    private static final MarshallingInfo<List> SCANSTATUSFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStatusFilters").build();
    private static final MarshallingInfo<List> SCHEDULEDBYFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledByFilters").build();
    private static final MarshallingInfo<List> TARGETACCOUNTIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetAccountIdFilters").build();
    private static final MarshallingInfo<List> TARGETRESOURCEIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceIdFilters").build();
    private static final MarshallingInfo<List> TARGETRESOURCETAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceTagFilters").build();

    private static final ListCisScansFilterCriteriaMarshaller instance = new ListCisScansFilterCriteriaMarshaller();

    public static ListCisScansFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCisScansFilterCriteria listCisScansFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (listCisScansFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCisScansFilterCriteria.getFailedChecksFilters(), FAILEDCHECKSFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScanArnFilters(), SCANARNFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScanAtFilters(), SCANATFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScanConfigurationArnFilters(), SCANCONFIGURATIONARNFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScanNameFilters(), SCANNAMEFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScanStatusFilters(), SCANSTATUSFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getScheduledByFilters(), SCHEDULEDBYFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getTargetAccountIdFilters(), TARGETACCOUNTIDFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getTargetResourceIdFilters(), TARGETRESOURCEIDFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScansFilterCriteria.getTargetResourceTagFilters(), TARGETRESOURCETAGFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
