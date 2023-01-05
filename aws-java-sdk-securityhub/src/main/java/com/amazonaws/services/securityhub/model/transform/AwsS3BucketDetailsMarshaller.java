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
 * AwsS3BucketDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketDetailsMarshaller {

    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> OWNERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerName").build();
    private static final MarshallingInfo<String> OWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccountId").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<StructuredPojo> SERVERSIDEENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerSideEncryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETLIFECYCLECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketLifecycleConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICACCESSBLOCKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicAccessBlockConfiguration").build();
    private static final MarshallingInfo<String> ACCESSCONTROLLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessControlList").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETLOGGINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketLoggingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETWEBSITECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketWebsiteConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETNOTIFICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketNotificationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETVERSIONINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketVersioningConfiguration").build();

    private static final AwsS3BucketDetailsMarshaller instance = new AwsS3BucketDetailsMarshaller();

    public static AwsS3BucketDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketDetails awsS3BucketDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3BucketDetails.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getOwnerName(), OWNERNAME_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getOwnerAccountId(), OWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getServerSideEncryptionConfiguration(), SERVERSIDEENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getBucketLifecycleConfiguration(), BUCKETLIFECYCLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getPublicAccessBlockConfiguration(), PUBLICACCESSBLOCKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getAccessControlList(), ACCESSCONTROLLIST_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getBucketLoggingConfiguration(), BUCKETLOGGINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getBucketWebsiteConfiguration(), BUCKETWEBSITECONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getBucketNotificationConfiguration(), BUCKETNOTIFICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsS3BucketDetails.getBucketVersioningConfiguration(), BUCKETVERSIONINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
