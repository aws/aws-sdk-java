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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddonMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddonMarshaller {

    private static final MarshallingInfo<String> ADDONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("addonName").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> ADDONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addonVersion").build();
    private static final MarshallingInfo<StructuredPojo> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("health").build();
    private static final MarshallingInfo<String> ADDONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("addonArn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SERVICEACCOUNTROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceAccountRoleArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final AddonMarshaller instance = new AddonMarshaller();

    public static AddonMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Addon addon, ProtocolMarshaller protocolMarshaller) {

        if (addon == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addon.getAddonName(), ADDONNAME_BINDING);
            protocolMarshaller.marshall(addon.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(addon.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(addon.getAddonVersion(), ADDONVERSION_BINDING);
            protocolMarshaller.marshall(addon.getHealth(), HEALTH_BINDING);
            protocolMarshaller.marshall(addon.getAddonArn(), ADDONARN_BINDING);
            protocolMarshaller.marshall(addon.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(addon.getModifiedAt(), MODIFIEDAT_BINDING);
            protocolMarshaller.marshall(addon.getServiceAccountRoleArn(), SERVICEACCOUNTROLEARN_BINDING);
            protocolMarshaller.marshall(addon.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
