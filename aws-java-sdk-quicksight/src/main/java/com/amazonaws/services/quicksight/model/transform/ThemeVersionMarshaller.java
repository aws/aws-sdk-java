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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThemeVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThemeVersionMarshaller {

    private static final MarshallingInfo<Long> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VersionNumber").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> BASETHEMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseThemeId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configuration").build();
    private static final MarshallingInfo<List> ERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Errors").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final ThemeVersionMarshaller instance = new ThemeVersionMarshaller();

    public static ThemeVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThemeVersion themeVersion, ProtocolMarshaller protocolMarshaller) {

        if (themeVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(themeVersion.getVersionNumber(), VERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(themeVersion.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(themeVersion.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(themeVersion.getBaseThemeId(), BASETHEMEID_BINDING);
            protocolMarshaller.marshall(themeVersion.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(themeVersion.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(themeVersion.getErrors(), ERRORS_BINDING);
            protocolMarshaller.marshall(themeVersion.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
