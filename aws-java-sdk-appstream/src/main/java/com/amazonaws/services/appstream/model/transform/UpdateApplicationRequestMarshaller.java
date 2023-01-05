/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApplicationRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> ICONS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IconS3Location").build();
    private static final MarshallingInfo<String> LAUNCHPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchPath").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkingDirectory").build();
    private static final MarshallingInfo<String> LAUNCHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchParameters").build();
    private static final MarshallingInfo<String> APPBLOCKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppBlockArn").build();
    private static final MarshallingInfo<List> ATTRIBUTESTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributesToDelete").build();

    private static final UpdateApplicationRequestMarshaller instance = new UpdateApplicationRequestMarshaller();

    public static UpdateApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApplicationRequest updateApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApplicationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getIconS3Location(), ICONS3LOCATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getLaunchPath(), LAUNCHPATH_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getLaunchParameters(), LAUNCHPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getAppBlockArn(), APPBLOCKARN_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getAttributesToDelete(), ATTRIBUTESTODELETE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
