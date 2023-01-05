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
 * AwsEcrRepositoryDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcrRepositoryDetailsMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<StructuredPojo> IMAGESCANNINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageScanningConfiguration").build();
    private static final MarshallingInfo<String> IMAGETAGMUTABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageTagMutability").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifecyclePolicy").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryName").build();
    private static final MarshallingInfo<String> REPOSITORYPOLICYTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryPolicyText").build();

    private static final AwsEcrRepositoryDetailsMarshaller instance = new AwsEcrRepositoryDetailsMarshaller();

    public static AwsEcrRepositoryDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcrRepositoryDetails awsEcrRepositoryDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcrRepositoryDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getImageScanningConfiguration(), IMAGESCANNINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getImageTagMutability(), IMAGETAGMUTABILITY_BINDING);
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getLifecyclePolicy(), LIFECYCLEPOLICY_BINDING);
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(awsEcrRepositoryDetails.getRepositoryPolicyText(), REPOSITORYPOLICYTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
