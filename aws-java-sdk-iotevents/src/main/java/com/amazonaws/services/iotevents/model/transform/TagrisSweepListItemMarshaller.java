/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TagrisSweepListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TagrisSweepListItemMarshaller {

    private static final MarshallingInfo<String> TAGRISACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagrisAccountId").build();
    private static final MarshallingInfo<String> TAGRISAMAZONRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagrisAmazonResourceName").build();
    private static final MarshallingInfo<String> TAGRISINTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagrisInternalId").build();
    private static final MarshallingInfo<Long> TAGRISVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagrisVersion").build();

    private static final TagrisSweepListItemMarshaller instance = new TagrisSweepListItemMarshaller();

    public static TagrisSweepListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TagrisSweepListItem tagrisSweepListItem, ProtocolMarshaller protocolMarshaller) {

        if (tagrisSweepListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tagrisSweepListItem.getTagrisAccountId(), TAGRISACCOUNTID_BINDING);
            protocolMarshaller.marshall(tagrisSweepListItem.getTagrisAmazonResourceName(), TAGRISAMAZONRESOURCENAME_BINDING);
            protocolMarshaller.marshall(tagrisSweepListItem.getTagrisInternalId(), TAGRISINTERNALID_BINDING);
            protocolMarshaller.marshall(tagrisSweepListItem.getTagrisVersion(), TAGRISVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
