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
 * InstanceInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceInfoMarshaller {

    private static final MarshallingInfo<String> INSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceName").build();
    private static final MarshallingInfo<String> IAMSESSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamSessionArn").build();
    private static final MarshallingInfo<String> IAMUSERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamUserArn").build();
    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceArn").build();
    private static final MarshallingInfo<java.util.Date> REGISTERTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registerTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEREGISTERTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deregisterTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final InstanceInfoMarshaller instance = new InstanceInfoMarshaller();

    public static InstanceInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceInfo instanceInfo, ProtocolMarshaller protocolMarshaller) {

        if (instanceInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceInfo.getInstanceName(), INSTANCENAME_BINDING);
            protocolMarshaller.marshall(instanceInfo.getIamSessionArn(), IAMSESSIONARN_BINDING);
            protocolMarshaller.marshall(instanceInfo.getIamUserArn(), IAMUSERARN_BINDING);
            protocolMarshaller.marshall(instanceInfo.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(instanceInfo.getRegisterTime(), REGISTERTIME_BINDING);
            protocolMarshaller.marshall(instanceInfo.getDeregisterTime(), DEREGISTERTIME_BINDING);
            protocolMarshaller.marshall(instanceInfo.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
