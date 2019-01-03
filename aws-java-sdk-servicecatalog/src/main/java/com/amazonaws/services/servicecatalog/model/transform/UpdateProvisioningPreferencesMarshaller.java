/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateProvisioningPreferencesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProvisioningPreferencesMarshaller {

    private static final MarshallingInfo<List> STACKSETACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetAccounts").build();
    private static final MarshallingInfo<List> STACKSETREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetRegions").build();
    private static final MarshallingInfo<Integer> STACKSETFAILURETOLERANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetFailureToleranceCount").build();
    private static final MarshallingInfo<Integer> STACKSETFAILURETOLERANCEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetFailureTolerancePercentage").build();
    private static final MarshallingInfo<Integer> STACKSETMAXCONCURRENCYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetMaxConcurrencyCount").build();
    private static final MarshallingInfo<Integer> STACKSETMAXCONCURRENCYPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetMaxConcurrencyPercentage").build();
    private static final MarshallingInfo<String> STACKSETOPERATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackSetOperationType").build();

    private static final UpdateProvisioningPreferencesMarshaller instance = new UpdateProvisioningPreferencesMarshaller();

    public static UpdateProvisioningPreferencesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProvisioningPreferences updateProvisioningPreferences, ProtocolMarshaller protocolMarshaller) {

        if (updateProvisioningPreferences == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetAccounts(), STACKSETACCOUNTS_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetRegions(), STACKSETREGIONS_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetFailureToleranceCount(), STACKSETFAILURETOLERANCECOUNT_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetFailureTolerancePercentage(), STACKSETFAILURETOLERANCEPERCENTAGE_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetMaxConcurrencyCount(), STACKSETMAXCONCURRENCYCOUNT_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetMaxConcurrencyPercentage(), STACKSETMAXCONCURRENCYPERCENTAGE_BINDING);
            protocolMarshaller.marshall(updateProvisioningPreferences.getStackSetOperationType(), STACKSETOPERATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
