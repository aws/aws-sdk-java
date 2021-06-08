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
package com.amazonaws.services.greengrassv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentLatestVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentLatestVersionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> COMPONENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentVersion").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PUBLISHER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("publisher").build();
    private static final MarshallingInfo<List> PLATFORMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platforms").build();

    private static final ComponentLatestVersionMarshaller instance = new ComponentLatestVersionMarshaller();

    public static ComponentLatestVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentLatestVersion componentLatestVersion, ProtocolMarshaller protocolMarshaller) {

        if (componentLatestVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentLatestVersion.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(componentLatestVersion.getComponentVersion(), COMPONENTVERSION_BINDING);
            protocolMarshaller.marshall(componentLatestVersion.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(componentLatestVersion.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(componentLatestVersion.getPublisher(), PUBLISHER_BINDING);
            protocolMarshaller.marshall(componentLatestVersion.getPlatforms(), PLATFORMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
