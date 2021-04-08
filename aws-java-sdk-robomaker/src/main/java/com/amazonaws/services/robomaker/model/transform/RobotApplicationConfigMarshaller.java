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
package com.amazonaws.services.robomaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RobotApplicationConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RobotApplicationConfigMarshaller {

    private static final MarshallingInfo<String> APPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("application").build();
    private static final MarshallingInfo<String> APPLICATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationVersion").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchConfig").build();
    private static final MarshallingInfo<List> UPLOADCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uploadConfigurations").build();
    private static final MarshallingInfo<Boolean> USEDEFAULTUPLOADCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useDefaultUploadConfigurations").build();
    private static final MarshallingInfo<List> TOOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tools").build();
    private static final MarshallingInfo<Boolean> USEDEFAULTTOOLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useDefaultTools").build();

    private static final RobotApplicationConfigMarshaller instance = new RobotApplicationConfigMarshaller();

    public static RobotApplicationConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RobotApplicationConfig robotApplicationConfig, ProtocolMarshaller protocolMarshaller) {

        if (robotApplicationConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(robotApplicationConfig.getApplication(), APPLICATION_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getApplicationVersion(), APPLICATIONVERSION_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getLaunchConfig(), LAUNCHCONFIG_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getUploadConfigurations(), UPLOADCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getUseDefaultUploadConfigurations(), USEDEFAULTUPLOADCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getTools(), TOOLS_BINDING);
            protocolMarshaller.marshall(robotApplicationConfig.getUseDefaultTools(), USEDEFAULTTOOLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
