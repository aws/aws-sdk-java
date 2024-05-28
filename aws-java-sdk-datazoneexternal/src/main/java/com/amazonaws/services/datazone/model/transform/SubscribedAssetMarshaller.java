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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscribedAssetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscribedAssetMarshaller {

    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> ASSETREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetRevision").build();
    private static final MarshallingInfo<StructuredPojo> FAILURECAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureCause").build();
    private static final MarshallingInfo<java.util.Date> FAILURETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> GRANTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("grantedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TARGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetName").build();

    private static final SubscribedAssetMarshaller instance = new SubscribedAssetMarshaller();

    public static SubscribedAssetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscribedAsset subscribedAsset, ProtocolMarshaller protocolMarshaller) {

        if (subscribedAsset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscribedAsset.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getAssetRevision(), ASSETREVISION_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getFailureCause(), FAILURECAUSE_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getFailureTimestamp(), FAILURETIMESTAMP_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getGrantedTimestamp(), GRANTEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(subscribedAsset.getTargetName(), TARGETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
