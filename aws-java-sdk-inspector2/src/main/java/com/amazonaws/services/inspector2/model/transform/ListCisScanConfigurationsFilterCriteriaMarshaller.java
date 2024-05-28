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
 * ListCisScanConfigurationsFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCisScanConfigurationsFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> SCANCONFIGURATIONARNFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanConfigurationArnFilters").build();
    private static final MarshallingInfo<List> SCANNAMEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanNameFilters").build();
    private static final MarshallingInfo<List> TARGETRESOURCETAGFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceTagFilters").build();

    private static final ListCisScanConfigurationsFilterCriteriaMarshaller instance = new ListCisScanConfigurationsFilterCriteriaMarshaller();

    public static ListCisScanConfigurationsFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCisScanConfigurationsFilterCriteria listCisScanConfigurationsFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (listCisScanConfigurationsFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCisScanConfigurationsFilterCriteria.getScanConfigurationArnFilters(), SCANCONFIGURATIONARNFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScanConfigurationsFilterCriteria.getScanNameFilters(), SCANNAMEFILTERS_BINDING);
            protocolMarshaller.marshall(listCisScanConfigurationsFilterCriteria.getTargetResourceTagFilters(), TARGETRESOURCETAGFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
