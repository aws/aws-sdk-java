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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VulnerablePackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VulnerablePackageMarshaller {

    private static final MarshallingInfo<String> ARCH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arch").build();
    private static final MarshallingInfo<Integer> EPOCH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("epoch").build();
    private static final MarshallingInfo<String> FILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filePath").build();
    private static final MarshallingInfo<String> FIXEDINVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedInVersion").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PACKAGEMANAGER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageManager").build();
    private static final MarshallingInfo<String> RELEASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("release").build();
    private static final MarshallingInfo<String> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remediation").build();
    private static final MarshallingInfo<String> SOURCELAMBDALAYERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLambdaLayerArn").build();
    private static final MarshallingInfo<String> SOURCELAYERHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLayerHash").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final VulnerablePackageMarshaller instance = new VulnerablePackageMarshaller();

    public static VulnerablePackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VulnerablePackage vulnerablePackage, ProtocolMarshaller protocolMarshaller) {

        if (vulnerablePackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vulnerablePackage.getArch(), ARCH_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getEpoch(), EPOCH_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getFilePath(), FILEPATH_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getFixedInVersion(), FIXEDINVERSION_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getName(), NAME_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getPackageManager(), PACKAGEMANAGER_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getRelease(), RELEASE_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getSourceLambdaLayerArn(), SOURCELAMBDALAYERARN_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getSourceLayerHash(), SOURCELAYERHASH_BINDING);
            protocolMarshaller.marshall(vulnerablePackage.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
