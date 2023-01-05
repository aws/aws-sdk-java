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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcrContainerImageDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcrContainerImageDetailsMarshaller {

    private static final MarshallingInfo<String> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistryId").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryName").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Architecture").build();
    private static final MarshallingInfo<String> IMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageDigest").build();
    private static final MarshallingInfo<List> IMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageTags").build();
    private static final MarshallingInfo<String> IMAGEPUBLISHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImagePublishedAt").build();

    private static final AwsEcrContainerImageDetailsMarshaller instance = new AwsEcrContainerImageDetailsMarshaller();

    public static AwsEcrContainerImageDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcrContainerImageDetails awsEcrContainerImageDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcrContainerImageDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getRegistryId(), REGISTRYID_BINDING);
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getImageDigest(), IMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getImageTags(), IMAGETAGS_BINDING);
            protocolMarshaller.marshall(awsEcrContainerImageDetails.getImagePublishedAt(), IMAGEPUBLISHEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
