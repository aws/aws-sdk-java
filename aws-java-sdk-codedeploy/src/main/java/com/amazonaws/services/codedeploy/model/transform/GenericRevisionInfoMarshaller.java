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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GenericRevisionInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenericRevisionInfoMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> DEPLOYMENTGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentGroups").build();
    private static final MarshallingInfo<java.util.Date> FIRSTUSEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstUsedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUSEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUsedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REGISTERTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registerTime").timestampFormat("unixTimestamp").build();

    private static final GenericRevisionInfoMarshaller instance = new GenericRevisionInfoMarshaller();

    public static GenericRevisionInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenericRevisionInfo genericRevisionInfo, ProtocolMarshaller protocolMarshaller) {

        if (genericRevisionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(genericRevisionInfo.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(genericRevisionInfo.getDeploymentGroups(), DEPLOYMENTGROUPS_BINDING);
            protocolMarshaller.marshall(genericRevisionInfo.getFirstUsedTime(), FIRSTUSEDTIME_BINDING);
            protocolMarshaller.marshall(genericRevisionInfo.getLastUsedTime(), LASTUSEDTIME_BINDING);
            protocolMarshaller.marshall(genericRevisionInfo.getRegisterTime(), REGISTERTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
