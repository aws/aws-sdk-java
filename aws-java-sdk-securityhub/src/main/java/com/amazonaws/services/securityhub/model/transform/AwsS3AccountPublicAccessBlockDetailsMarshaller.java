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
 * AwsS3AccountPublicAccessBlockDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3AccountPublicAccessBlockDetailsMarshaller {

    private static final MarshallingInfo<Boolean> BLOCKPUBLICACLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockPublicAcls").build();
    private static final MarshallingInfo<Boolean> BLOCKPUBLICPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockPublicPolicy").build();
    private static final MarshallingInfo<Boolean> IGNOREPUBLICACLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IgnorePublicAcls").build();
    private static final MarshallingInfo<Boolean> RESTRICTPUBLICBUCKETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestrictPublicBuckets").build();

    private static final AwsS3AccountPublicAccessBlockDetailsMarshaller instance = new AwsS3AccountPublicAccessBlockDetailsMarshaller();

    public static AwsS3AccountPublicAccessBlockDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3AccountPublicAccessBlockDetails awsS3AccountPublicAccessBlockDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsS3AccountPublicAccessBlockDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3AccountPublicAccessBlockDetails.getBlockPublicAcls(), BLOCKPUBLICACLS_BINDING);
            protocolMarshaller.marshall(awsS3AccountPublicAccessBlockDetails.getBlockPublicPolicy(), BLOCKPUBLICPOLICY_BINDING);
            protocolMarshaller.marshall(awsS3AccountPublicAccessBlockDetails.getIgnorePublicAcls(), IGNOREPUBLICACLS_BINDING);
            protocolMarshaller.marshall(awsS3AccountPublicAccessBlockDetails.getRestrictPublicBuckets(), RESTRICTPUBLICBUCKETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
