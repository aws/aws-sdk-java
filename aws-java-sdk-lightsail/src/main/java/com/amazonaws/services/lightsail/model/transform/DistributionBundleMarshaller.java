/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DistributionBundleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DistributionBundleMarshaller {

    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bundleId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Float> PRICE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("price").build();
    private static final MarshallingInfo<Integer> TRANSFERPERMONTHINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferPerMonthInGb").build();
    private static final MarshallingInfo<Boolean> ISACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isActive").build();

    private static final DistributionBundleMarshaller instance = new DistributionBundleMarshaller();

    public static DistributionBundleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DistributionBundle distributionBundle, ProtocolMarshaller protocolMarshaller) {

        if (distributionBundle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(distributionBundle.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(distributionBundle.getName(), NAME_BINDING);
            protocolMarshaller.marshall(distributionBundle.getPrice(), PRICE_BINDING);
            protocolMarshaller.marshall(distributionBundle.getTransferPerMonthInGb(), TRANSFERPERMONTHINGB_BINDING);
            protocolMarshaller.marshall(distributionBundle.getIsActive(), ISACTIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
