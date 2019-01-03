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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RelationalDatabaseBundleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelationalDatabaseBundleMarshaller {

    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bundleId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Float> PRICE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("price").build();
    private static final MarshallingInfo<Float> RAMSIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ramSizeInGb").build();
    private static final MarshallingInfo<Integer> DISKSIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskSizeInGb").build();
    private static final MarshallingInfo<Integer> TRANSFERPERMONTHINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferPerMonthInGb").build();
    private static final MarshallingInfo<Integer> CPUCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpuCount").build();
    private static final MarshallingInfo<Boolean> ISENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isEncrypted").build();
    private static final MarshallingInfo<Boolean> ISACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isActive").build();

    private static final RelationalDatabaseBundleMarshaller instance = new RelationalDatabaseBundleMarshaller();

    public static RelationalDatabaseBundleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelationalDatabaseBundle relationalDatabaseBundle, ProtocolMarshaller protocolMarshaller) {

        if (relationalDatabaseBundle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relationalDatabaseBundle.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getName(), NAME_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getPrice(), PRICE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getRamSizeInGb(), RAMSIZEINGB_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getDiskSizeInGb(), DISKSIZEINGB_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getTransferPerMonthInGb(), TRANSFERPERMONTHINGB_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getCpuCount(), CPUCOUNT_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getIsEncrypted(), ISENCRYPTED_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBundle.getIsActive(), ISACTIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
