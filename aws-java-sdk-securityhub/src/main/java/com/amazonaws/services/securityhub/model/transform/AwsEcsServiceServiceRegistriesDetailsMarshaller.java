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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsServiceServiceRegistriesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsServiceServiceRegistriesDetailsMarshaller {

    private static final MarshallingInfo<String> CONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerName").build();
    private static final MarshallingInfo<Integer> CONTAINERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerPort").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> REGISTRYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistryArn").build();

    private static final AwsEcsServiceServiceRegistriesDetailsMarshaller instance = new AwsEcsServiceServiceRegistriesDetailsMarshaller();

    public static AwsEcsServiceServiceRegistriesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsServiceServiceRegistriesDetails awsEcsServiceServiceRegistriesDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsServiceServiceRegistriesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsServiceServiceRegistriesDetails.getContainerName(), CONTAINERNAME_BINDING);
            protocolMarshaller.marshall(awsEcsServiceServiceRegistriesDetails.getContainerPort(), CONTAINERPORT_BINDING);
            protocolMarshaller.marshall(awsEcsServiceServiceRegistriesDetails.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(awsEcsServiceServiceRegistriesDetails.getRegistryArn(), REGISTRYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
