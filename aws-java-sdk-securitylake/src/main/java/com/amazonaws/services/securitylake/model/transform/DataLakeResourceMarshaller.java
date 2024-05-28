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
package com.amazonaws.services.securitylake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataLakeResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataLakeResourceMarshaller {

    private static final MarshallingInfo<String> CREATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createStatus").build();
    private static final MarshallingInfo<String> DATALAKEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataLakeArn").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleConfiguration").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<StructuredPojo> REPLICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationConfiguration").build();
    private static final MarshallingInfo<String> S3BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketArn").build();
    private static final MarshallingInfo<StructuredPojo> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateStatus").build();

    private static final DataLakeResourceMarshaller instance = new DataLakeResourceMarshaller();

    public static DataLakeResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataLakeResource dataLakeResource, ProtocolMarshaller protocolMarshaller) {

        if (dataLakeResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataLakeResource.getCreateStatus(), CREATESTATUS_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getDataLakeArn(), DATALAKEARN_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getLifecycleConfiguration(), LIFECYCLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getReplicationConfiguration(), REPLICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getS3BucketArn(), S3BUCKETARN_BINDING);
            protocolMarshaller.marshall(dataLakeResource.getUpdateStatus(), UPDATESTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
