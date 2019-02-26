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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BundleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BundleMarshaller {

    private static final MarshallingInfo<Float> PRICE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("price").build();
    private static final MarshallingInfo<Integer> CPUCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpuCount").build();
    private static final MarshallingInfo<Integer> DISKSIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskSizeInGb").build();
    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bundleId").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<Boolean> ISACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isActive").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> POWER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("power").build();
    private static final MarshallingInfo<Float> RAMSIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ramSizeInGb").build();
    private static final MarshallingInfo<Integer> TRANSFERPERMONTHINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferPerMonthInGb").build();
    private static final MarshallingInfo<List> SUPPORTEDPLATFORMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedPlatforms").build();

    private static final BundleMarshaller instance = new BundleMarshaller();

    public static BundleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Bundle bundle, ProtocolMarshaller protocolMarshaller) {

        if (bundle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bundle.getPrice(), PRICE_BINDING);
            protocolMarshaller.marshall(bundle.getCpuCount(), CPUCOUNT_BINDING);
            protocolMarshaller.marshall(bundle.getDiskSizeInGb(), DISKSIZEINGB_BINDING);
            protocolMarshaller.marshall(bundle.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(bundle.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(bundle.getIsActive(), ISACTIVE_BINDING);
            protocolMarshaller.marshall(bundle.getName(), NAME_BINDING);
            protocolMarshaller.marshall(bundle.getPower(), POWER_BINDING);
            protocolMarshaller.marshall(bundle.getRamSizeInGb(), RAMSIZEINGB_BINDING);
            protocolMarshaller.marshall(bundle.getTransferPerMonthInGb(), TRANSFERPERMONTHINGB_BINDING);
            protocolMarshaller.marshall(bundle.getSupportedPlatforms(), SUPPORTEDPLATFORMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
