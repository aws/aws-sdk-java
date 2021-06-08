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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsSecretsManagerSecretDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSecretsManagerSecretDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ROTATIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationRules").build();
    private static final MarshallingInfo<Boolean> ROTATIONOCCURREDWITHINFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationOccurredWithinFrequency").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> ROTATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationEnabled").build();
    private static final MarshallingInfo<String> ROTATIONLAMBDAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationLambdaArn").build();
    private static final MarshallingInfo<Boolean> DELETED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Deleted").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final AwsSecretsManagerSecretDetailsMarshaller instance = new AwsSecretsManagerSecretDetailsMarshaller();

    public static AwsSecretsManagerSecretDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSecretsManagerSecretDetails awsSecretsManagerSecretDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsSecretsManagerSecretDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getRotationRules(), ROTATIONRULES_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getRotationOccurredWithinFrequency(), ROTATIONOCCURREDWITHINFREQUENCY_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getRotationEnabled(), ROTATIONENABLED_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getRotationLambdaArn(), ROTATIONLAMBDAARN_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getDeleted(), DELETED_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsSecretsManagerSecretDetails.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
