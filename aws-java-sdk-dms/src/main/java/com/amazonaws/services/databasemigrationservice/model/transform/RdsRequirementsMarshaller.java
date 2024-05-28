/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RdsRequirementsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RdsRequirementsMarshaller {

    private static final MarshallingInfo<String> ENGINEEDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineEdition").build();
    private static final MarshallingInfo<Double> INSTANCEVCPU_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceVcpu").build();
    private static final MarshallingInfo<Double> INSTANCEMEMORY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMemory").build();
    private static final MarshallingInfo<Integer> STORAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageSize").build();
    private static final MarshallingInfo<Integer> STORAGEIOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageIops").build();
    private static final MarshallingInfo<String> DEPLOYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentOption").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();

    private static final RdsRequirementsMarshaller instance = new RdsRequirementsMarshaller();

    public static RdsRequirementsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RdsRequirements rdsRequirements, ProtocolMarshaller protocolMarshaller) {

        if (rdsRequirements == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rdsRequirements.getEngineEdition(), ENGINEEDITION_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getInstanceVcpu(), INSTANCEVCPU_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getInstanceMemory(), INSTANCEMEMORY_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getStorageSize(), STORAGESIZE_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getStorageIops(), STORAGEIOPS_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getDeploymentOption(), DEPLOYMENTOPTION_BINDING);
            protocolMarshaller.marshall(rdsRequirements.getEngineVersion(), ENGINEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
