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
package com.amazonaws.services.ecr.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RepositoryScanningConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RepositoryScanningConfigurationMarshaller {

    private static final MarshallingInfo<String> REPOSITORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryArn").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<Boolean> SCANONPUSH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanOnPush").build();
    private static final MarshallingInfo<String> SCANFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanFrequency").build();
    private static final MarshallingInfo<List> APPLIEDSCANFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appliedScanFilters").build();

    private static final RepositoryScanningConfigurationMarshaller instance = new RepositoryScanningConfigurationMarshaller();

    public static RepositoryScanningConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RepositoryScanningConfiguration repositoryScanningConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (repositoryScanningConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(repositoryScanningConfiguration.getRepositoryArn(), REPOSITORYARN_BINDING);
            protocolMarshaller.marshall(repositoryScanningConfiguration.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(repositoryScanningConfiguration.getScanOnPush(), SCANONPUSH_BINDING);
            protocolMarshaller.marshall(repositoryScanningConfiguration.getScanFrequency(), SCANFREQUENCY_BINDING);
            protocolMarshaller.marshall(repositoryScanningConfiguration.getAppliedScanFilters(), APPLIEDSCANFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
