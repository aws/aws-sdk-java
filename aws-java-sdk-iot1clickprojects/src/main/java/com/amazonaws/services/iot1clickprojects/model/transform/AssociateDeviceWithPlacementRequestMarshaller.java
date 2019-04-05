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
package com.amazonaws.services.iot1clickprojects.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot1clickprojects.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateDeviceWithPlacementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateDeviceWithPlacementRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectName").build();
    private static final MarshallingInfo<String> PLACEMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("placementName").build();
    private static final MarshallingInfo<String> DEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("deviceId").build();
    private static final MarshallingInfo<String> DEVICETEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("deviceTemplateName").build();

    private static final AssociateDeviceWithPlacementRequestMarshaller instance = new AssociateDeviceWithPlacementRequestMarshaller();

    public static AssociateDeviceWithPlacementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateDeviceWithPlacementRequest associateDeviceWithPlacementRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateDeviceWithPlacementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateDeviceWithPlacementRequest.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(associateDeviceWithPlacementRequest.getPlacementName(), PLACEMENTNAME_BINDING);
            protocolMarshaller.marshall(associateDeviceWithPlacementRequest.getDeviceId(), DEVICEID_BINDING);
            protocolMarshaller.marshall(associateDeviceWithPlacementRequest.getDeviceTemplateName(), DEVICETEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
