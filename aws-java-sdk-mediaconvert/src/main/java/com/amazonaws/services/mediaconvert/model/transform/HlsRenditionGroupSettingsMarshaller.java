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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsRenditionGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsRenditionGroupSettingsMarshaller {

    private static final MarshallingInfo<String> RENDITIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renditionGroupId").build();
    private static final MarshallingInfo<String> RENDITIONLANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renditionLanguageCode").build();
    private static final MarshallingInfo<String> RENDITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renditionName").build();

    private static final HlsRenditionGroupSettingsMarshaller instance = new HlsRenditionGroupSettingsMarshaller();

    public static HlsRenditionGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsRenditionGroupSettings hlsRenditionGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsRenditionGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsRenditionGroupSettings.getRenditionGroupId(), RENDITIONGROUPID_BINDING);
            protocolMarshaller.marshall(hlsRenditionGroupSettings.getRenditionLanguageCode(), RENDITIONLANGUAGECODE_BINDING);
            protocolMarshaller.marshall(hlsRenditionGroupSettings.getRenditionName(), RENDITIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
