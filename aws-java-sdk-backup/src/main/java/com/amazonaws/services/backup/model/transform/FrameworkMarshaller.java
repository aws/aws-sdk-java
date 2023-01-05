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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FrameworkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FrameworkMarshaller {

    private static final MarshallingInfo<String> FRAMEWORKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkName").build();
    private static final MarshallingInfo<String> FRAMEWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkArn").build();
    private static final MarshallingInfo<String> FRAMEWORKDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkDescription").build();
    private static final MarshallingInfo<Integer> NUMBEROFCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfControls").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStatus").build();

    private static final FrameworkMarshaller instance = new FrameworkMarshaller();

    public static FrameworkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Framework framework, ProtocolMarshaller protocolMarshaller) {

        if (framework == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(framework.getFrameworkName(), FRAMEWORKNAME_BINDING);
            protocolMarshaller.marshall(framework.getFrameworkArn(), FRAMEWORKARN_BINDING);
            protocolMarshaller.marshall(framework.getFrameworkDescription(), FRAMEWORKDESCRIPTION_BINDING);
            protocolMarshaller.marshall(framework.getNumberOfControls(), NUMBEROFCONTROLS_BINDING);
            protocolMarshaller.marshall(framework.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(framework.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
