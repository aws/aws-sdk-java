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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsS3AccessPointDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3AccessPointDetailsMarshaller {

    private static final MarshallingInfo<String> ACCESSPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPointArn").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alias").build();
    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bucket").build();
    private static final MarshallingInfo<String> BUCKETACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketAccountId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> NETWORKORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkOrigin").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICACCESSBLOCKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicAccessBlockConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final AwsS3AccessPointDetailsMarshaller instance = new AwsS3AccessPointDetailsMarshaller();

    public static AwsS3AccessPointDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3AccessPointDetails awsS3AccessPointDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsS3AccessPointDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3AccessPointDetails.getAccessPointArn(), ACCESSPOINTARN_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getBucketAccountId(), BUCKETACCOUNTID_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getNetworkOrigin(), NETWORKORIGIN_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getPublicAccessBlockConfiguration(), PUBLICACCESSBLOCKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3AccessPointDetails.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
